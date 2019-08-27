package ar.com.bbva.api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.HttpMethodConstraint;

@RestController
@RequestMapping("/api/demo")
public class DemoApi {
    @Autowired
    private PersonaRepostory personaRepository;

    @RequestMapping(value="/saludo/{nombre}", method = RequestMethod.GET)
    public Persona  holaMundo(@PathVariable String nombre, @RequestParam String apellido){

        return new Persona(nombre, apellido);

    }

    @RequestMapping(value="/persona", method = RequestMethod.POST)
    public Persona persistirPersona(@RequestBody Persona persona){

        return personaRepository.save(persona);

    }

    @RequestMapping(value="/personas", method = RequestMethod.GET)
    public Iterable<Persona> consultarPersonas(){

        return personaRepository.findAll();

    }
}
