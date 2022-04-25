package edu.elp.siselp.controller;

import edu.elp.siselp.entity.Administrativo;
import edu.elp.siselp.entity.Docente;
import edu.elp.siselp.entity.Estudiante;
import edu.elp.siselp.entity.Persona;
import edu.elp.siselp.service.IAdministrativoService;
import edu.elp.siselp.service.IDocenteService;
import edu.elp.siselp.service.IEstudianteService;
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
    private IDocenteService docenteService;



    @Autowired
    private IAdministrativoService administrativoService;

    @GetMapping("/listaAdministrativo")
    public List<Administrativo>listaAdministrativo(){
        return this.administrativoService.listaAdministrativo();
    }
    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/listaEstudiantes")
    public List<Estudiante>listaEstudiantes(){
        return this.estudianteService.listaEstudiantes();
    }
    @GetMapping("/buscarEstudiante")
    public Estudiante buscarEstudiante(@RequestParam("codigo") String codigo) {
        return this.estudianteService.obtenerEstudianteByCodigo(codigo);
    }


    @GetMapping("/listaDocentes")
    public List<Docente>listaDocente() {
        return this.docenteService.listaDocentes();
    }



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
