package sm.dsw.ms.ubigeo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.ubigeo.model.Distrito;
import sm.dsw.ms.ubigeo.reposity.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService{

    @Autowired
    DistritoRepository distritoRepository;
    
    @Override
    public List<Distrito> findAll() {
        return (List<Distrito>)distritoRepository.findAll();
    }

    @Override
    public Optional<Distrito> findById(Long id) {
        return distritoRepository.findById(id);
    }

    @Override
    public List<Distrito> findByProvinciaId(Long provinciaId) {
        return distritoRepository.findByProvinciaId(provinciaId);
    }

    @Override
    public List<Distrito> findByUbigeo(String ubigeo) {
        return distritoRepository.findByUbigeo(ubigeo);
    }
    
}
