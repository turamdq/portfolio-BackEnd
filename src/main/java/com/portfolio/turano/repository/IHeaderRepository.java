package com.portfolio.turano.repository;

import com.portfolio.turano.models.Header;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHeaderRepository extends JpaRepository <Header, Long>{
    
}
