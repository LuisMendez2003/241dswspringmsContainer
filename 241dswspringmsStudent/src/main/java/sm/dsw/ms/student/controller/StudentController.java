
package sm.dsw.ms.student.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sm.dsw.ms.student.service.StudentService;


@RestController
@RequestMapping("/api/Student")
public class StudentController {
    @Autowired
    private StudentService Studentservice;
    
    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(Studentservice.findAll());
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");
        
        boolean authenticated = Studentservice.login(email, password);
        
        if (authenticated) {
            return ResponseEntity.ok("Inicio de sesión exitoso");
        } else {
            return ResponseEntity.status(401).body("Credenciales incorrectas");
        }
    }
    
}