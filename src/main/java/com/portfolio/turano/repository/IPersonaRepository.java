package com.portfolio.turano.repository;

import com.portfolio.turano.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//INDICO QUE ESTA ES UNA INTERFAZ REPOSITORY
//INDICO QUE IPersonaRepository EXTIENDE DE JpaRepository PARA PODER USAR SUS METODOS
//<EL OBJETO QUE VOY A PERSISTIR Y TIPO DE DATO DEL ID DE ESA CLASE>
@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
    
}
