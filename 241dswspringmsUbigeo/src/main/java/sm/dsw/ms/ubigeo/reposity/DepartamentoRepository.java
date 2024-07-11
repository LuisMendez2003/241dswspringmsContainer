package sm.dsw.ms.ubigeo.reposity;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sm.dsw.ms.ubigeo.model.Departamento;

@Repository
public interface DepartamentoRepository extends CrudRepository<Departamento, String>{
    
    Optional<Departamento> findById(Long id);
}
