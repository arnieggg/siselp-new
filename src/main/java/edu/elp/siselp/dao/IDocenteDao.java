package edu.elp.siselp.dao;

import edu.elp.siselp.entity.Docente;
import edu.elp.siselp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IDocenteDao extends JpaRepository<Docente,String> {


}
