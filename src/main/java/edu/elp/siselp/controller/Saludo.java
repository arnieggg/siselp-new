package edu.elp.siselp.controller;

import edu.elp.siselp.entity.Persona;
import edu.elp.siselp.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")

public class Saludo {
    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listaPersona")
    public List<Persona> listaPersona(){
        return this.personaService.listaPersonas();
    }
    @GetMapping("/buscarPersona")
    public Persona buscarPersona(@RequestParam("dni") String dni){
        return this.personaService.obtenerPersonaByDni(dni);
    }


    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "Hola mundo desde Ayacucho!!!!! Te saluda"+ nombre;
    }

    @GetMapping("/bienvenida")
    public  String bienvenida(){
        return "Hola amig@s al curso de Java";
    }

}
