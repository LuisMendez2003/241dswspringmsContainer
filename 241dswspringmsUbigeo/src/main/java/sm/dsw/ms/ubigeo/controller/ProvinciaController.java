package sm.dsw.ms.ubigeo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sm.dsw.ms.ubigeo.model.Provincia;
import sm.dsw.ms.ubigeo.service.ProvinciaService;
import java.util.Optional;

@RestController
@RequestMapping("/api/provincia")
public class ProvinciaController {
    @Autowired
    private ProvinciaService provinciaService;
   
    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(provinciaService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Provincia> provincia = provinciaService.findById(id);
        
        if (provincia.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Provincia no encontrado");
        }
        
        return ResponseEntity.ok(provincia.get());
    }
    
    @GetMapping("/departamento/{id}")
    public ResponseEntity<?> getProvinciasByDepartamento(@PathVariable Long id){
        List<Provincia> provincias = provinciaService.findByDepartamentoId(id);
        
        if (provincias.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.ok(provincias);
    }
    
}
