package edu.elp.siselp.service.impl;

import edu.elp.siselp.dao.IPersonaDao;
import edu.elp.siselp.entity.Persona;
import edu.elp.siselp.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicelmpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersonas() {

       List<Persona> personaList = this.personaDao.findAll();
       for(Persona persona:personaList){
           System.out.println(persona.toString());
       }
        return this .personaDao.findAll();
    }

    @Override
    public Persona obtenetPersonaByDni(String dni) {
        return null;
    }
}
