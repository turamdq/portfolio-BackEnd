package com.portfolio.turano.services;

import com.portfolio.turano.models.Experiencia;
import com.portfolio.turano.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    IExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(Experiencia exp, Long id) {
        Experiencia expUpdate = expRepo.findById(id).get();
        expUpdate.setName(exp.getName());
        expUpdate.setImage(exp.getImage());
        expUpdate.setStartDate(exp.getStartDate());
        expUpdate.setEndDate(exp.getEndDate());
        expUpdate.setPosition(exp.getPosition());
        expUpdate.setTasks(exp.getTasks());
        expRepo.save(expUpdate);
    }
    
    
    
    
}
