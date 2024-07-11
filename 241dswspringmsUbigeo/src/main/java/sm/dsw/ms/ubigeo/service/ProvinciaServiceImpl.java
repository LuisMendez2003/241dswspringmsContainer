package sm.dsw.ms.ubigeo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.ubigeo.model.Provincia;
import sm.dsw.ms.ubigeo.reposity.ProvinciaRepository;

@Service
public class ProvinciaServiceImpl implements ProvinciaService{

    @Autowired
    ProvinciaRepository provinciaRepository;
    
    @Override
    public List<Provincia> findAll() {
        return (List<Provincia>)provinciaRepository.findAll();
    }

    @Override
    public Optional<Provincia> findById(Long id) {
        return provinciaRepository.findById(id);
    }

    @Override
    public List<Provincia> findByDepartamentoId(Long departamentoId) {
        return provinciaRepository.findByDepartamentoId(departamentoId);
    }
    
}
