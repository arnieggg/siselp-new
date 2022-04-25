package edu.elp.siselp.service;

import edu.elp.siselp.entity.Docente;
import edu.elp.siselp.entity.Persona;

import java.util.List;

public interface IDocenteService {
    //Listar docentes
    List<Docente> listaDocentes();



    //Buscar docente por su codigo
    Docente obtenerDocenteByCodigo(String codDocente);


}
