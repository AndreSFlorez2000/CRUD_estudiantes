package org.example.api;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface  EstudiantesRepository extends CrudRepository<Estudiante,Integer> {
    Optional<Estudiante> findByCodigo(String codigo);
}
