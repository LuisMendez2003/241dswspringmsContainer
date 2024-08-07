package sm.dsw.ms.ubigeo.service;

import java.util.List;
import java.util.Optional;
import sm.dsw.ms.ubigeo.model.Departamento;

public interface DepartamentoService {
    List<Departamento> findAll();
    Optional<Departamento> findById(Long id);
    
}
