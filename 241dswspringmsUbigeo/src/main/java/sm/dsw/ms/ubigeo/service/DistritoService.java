package sm.dsw.ms.ubigeo.service;

import java.util.List;
import java.util.Optional;
import sm.dsw.ms.ubigeo.model.Distrito;

public interface DistritoService {
    List<Distrito> findAll();
    Optional<Distrito> findById(Long id);
    List<Distrito> findByProvinciaId(Long provinciaId);
    List<Distrito> findByUbigeo(String ubigeo);
}
