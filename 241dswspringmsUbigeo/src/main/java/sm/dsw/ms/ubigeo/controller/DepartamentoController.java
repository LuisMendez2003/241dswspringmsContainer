package sm.dsw.ms.ubigeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sm.dsw.ms.ubigeo.model.Departamento;
import sm.dsw.ms.ubigeo.service.DepartamentoService;
import java.util.Optional;

@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;
   
    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(departamentoService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Departamento> departamento = departamentoService.findById(id);
        
        if (departamento.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Departamento no encontrado");
        }
        
        return ResponseEntity.ok(departamento.get());
    }
}
