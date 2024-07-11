package sm.dsw.ms.ubigeo.reposity;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sm.dsw.ms.ubigeo.model.Provincia;

@Repository
public interface ProvinciaRepository extends CrudRepository<Provincia, String>{
    Optional<Provincia> findById(Long id);
    
    List<Provincia> findByDepartamentoId(Long departamentoId);
}
