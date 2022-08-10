package com.portfolio.turano.repository;

import com.portfolio.turano.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository <Skill, Long>{
    
}
