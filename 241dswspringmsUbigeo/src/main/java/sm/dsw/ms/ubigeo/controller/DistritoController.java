package sm.dsw.ms.ubigeo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sm.dsw.ms.ubigeo.model.Distrito;
import sm.dsw.ms.ubigeo.service.DistritoService;
import java.util.Optional;

@RestController
@RequestMapping("/api/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoService;
   
    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(distritoService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Distrito> distrito = distritoService.findById(id);
        
        if (distrito.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Departamento no encontrado");
        }
        
        return ResponseEntity.ok(distrito.get());
    }
    
    @GetMapping("/provincia/{id}")
    public ResponseEntity<?> getDistritosByProvinciaId(@PathVariable Long id){
        List<Distrito> distritos = distritoService.findByProvinciaId(id);
        
        if (distritos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.ok(distritos);
    }
    
    @GetMapping("/ubigeo/{ubigeo}")
    public ResponseEntity<?> getDistritoByUbigeo(@PathVariable String ubigeo){
        List<Distrito> distritos = distritoService.findByUbigeo(ubigeo);
        
        if (distritos.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.ok(distritos);
    }
    
}
