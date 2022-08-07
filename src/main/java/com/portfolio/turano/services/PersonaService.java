package com.portfolio.turano.services;

import com.portfolio.turano.models.Persona;
import com.portfolio.turano.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//IMPLEMENTA LOS METODOS DE IPersonaService (ACA IMPLEMENTAMOS LOGICA DE NEGOCIO)
//AVISO QUE ES UNA CAPA DE SERVICIO
@Service
public class PersonaService implements IPersonaService{

    //INYECTO DEPENDENCIAS DE FORMA AUTO
    @Autowired
    public IPersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    //SE COLOCA orElse(null) POR SI NO ENCUENTRA LA PERSONA
    @Override
    public Persona buscarPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }
    
    /*NO SE COLOCA UN METODO EDITAR YA QUE HIBERNATE UTILIZA SAVE PARA
    MODIFICAR O EDITAR SI ES QUE HAY CAMBIOS*/
}
