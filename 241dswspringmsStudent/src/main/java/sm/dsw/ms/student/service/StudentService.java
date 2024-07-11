package sm.dsw.ms.student.service;

import java.util.List;
import org.springframework.stereotype.Service;
import sm.dsw.ms.student.model.Student;

public interface StudentService {
    List<Student> findAll();
    boolean authenticate(String email, String password);
}