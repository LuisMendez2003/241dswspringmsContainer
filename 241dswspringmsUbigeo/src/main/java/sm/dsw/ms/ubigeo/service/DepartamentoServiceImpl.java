package sm.dsw.ms.ubigeo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sm.dsw.ms.ubigeo.model.Departamento;
import sm.dsw.ms.ubigeo.reposity.DepartamentoRepository;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{

    @Autowired
    DepartamentoRepository departamentoRepository;
    
    @Override
    public List<Departamento> findAll() {
        return (List<Departamento>)departamentoRepository.findAll();
    }

    @Override
    public Optional<Departamento> findById(Long id) {
        return departamentoRepository.findById(id);
    }
    
}
