
package sm.dsw.ms.student.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sm.dsw.ms.student.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findByEmail(String email);
}


