package ar.com.bbva.api.api;

import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.HttpMethodConstraint;

@RestController
@RequestMapping("/api/demo")
public class DemoApi {
    @RequestMapping(value="/saludo/{nombre}", method = RequestMethod.GET)
    public Persona  holaMundo(@PathVariable String nombre, @RequestParam String apellido){

        return new Persona(nombre, apellido);

    }
}
