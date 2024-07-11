package sm.dsw.ms.student.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;
import sm.dsw.ms.student.model.Student;
import sm.dsw.ms.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    StudentRepository StudentRepository;
    
    @Override
    public List<Student> findAll() {
        return (List<Student>)StudentRepository.findAll();
    }

    @Override
    public boolean login(String email, String password) {
        Student student = StudentRepository.findByEmail(email);
        if (student != null && BCrypt.checkpw(password, student.getContrasena())) {
            return true;
        }
        return false;
    }
}