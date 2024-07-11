package sm.dsw.ms.ubigeo.service;

import java.util.List;
import java.util.Optional;
import sm.dsw.ms.ubigeo.model.Provincia;

public interface ProvinciaService {
    List<Provincia> findAll();
    Optional<Provincia> findById(Long id);
    List<Provincia> findByDepartamentoId(Long departamentoId);
}
