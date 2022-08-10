package com.portfolio.turano.services;

import com.portfolio.turano.models.Header;
import com.portfolio.turano.repository.IHeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderService implements IHeaderService{

    @Autowired
    public IHeaderRepository headRepo;
    
    @Override
    public List<Header> verHeaders() {
        return headRepo.findAll();
    }

    @Override
    public void crearHeader(Header head) {
        headRepo.save(head);
    }

    @Override
    public void borrarHeader(Long id) {
        headRepo.deleteById(id);
    }

    @Override
    public Header buscarHeader(Long id) {
        return headRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHeader(Header head, Long id) {
        headRepo.save(head);
    }
    
}
