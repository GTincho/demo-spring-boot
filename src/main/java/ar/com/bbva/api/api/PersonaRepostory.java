package ar.com.bbva.api.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepostory extends CrudRepository<Persona, Long> {

    List<Persona> findByNombre(String nombre);

}
