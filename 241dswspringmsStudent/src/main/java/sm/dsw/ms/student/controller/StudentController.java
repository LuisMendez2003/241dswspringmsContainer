
package sm.dsw.ms.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sm.dsw.ms.student.model.Student;
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
    public ResponseEntity<?> login(@RequestBody Student student) {
        boolean isAuthenticated = Studentservice.authenticate(student.getEmail(), student.getContrasena());
        if (isAuthenticated) {
            return ResponseEntity.ok("Usuario encontrado");
        } else {
            return ResponseEntity.status(401).body("Credenciales incorrectas");
        }
    }
}