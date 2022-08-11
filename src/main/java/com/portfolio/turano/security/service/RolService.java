
package com.portfolio.turano.security.service;

import com.portfolio.turano.security.entity.Rol;
import com.portfolio.turano.security.enums.RolNombre;
import com.portfolio.turano.security.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    IRolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return  rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);        
    }
}
