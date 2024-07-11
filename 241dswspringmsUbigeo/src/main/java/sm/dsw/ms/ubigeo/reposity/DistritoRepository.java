package sm.dsw.ms.ubigeo.reposity;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sm.dsw.ms.ubigeo.model.Distrito;

@Repository
public interface DistritoRepository extends CrudRepository<Distrito, String>{
    Optional<Distrito> findById(Long id);
    
    List<Distrito> findByProvinciaId(Long provinciaId);
    
    List<Distrito> findByUbigeo(String ubigeo);
}
