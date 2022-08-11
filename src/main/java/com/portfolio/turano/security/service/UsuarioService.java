package com.portfolio.turano.security.service;

import com.portfolio.turano.security.entity.Usuario;
import com.portfolio.turano.security.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    IUsuarioRepository usuarioRepo;
    
    public Optional<Usuario> getByUsuario(String nombreUsuario){
        return usuarioRepo.findByNombreUsuario(nombreUsuario);
    }

    public Boolean existsByUsuario(String nombreUsuario){
        return usuarioRepo.existsByNombreUsuario(nombreUsuario);
    }

    public Boolean existsByEmail(String email){
        return usuarioRepo.existsByEmail(email);
    }

    public void save(Usuario usuario){
        usuarioRepo.save(usuario);
    }
}
