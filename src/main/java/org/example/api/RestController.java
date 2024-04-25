package org.example.api;

import org.hibernate.ScrollableResults;
import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private EstudiantesRepository estudiantesRepository;

    @GetMapping("/{id}")
    public Optional<Estudiante> getEstudianteById(@PathVariable Integer id) {
        System.out.println(estudiantesRepository.findById(id));
        return estudiantesRepository.findById(id);
    }
    @GetMapping("/buscar/{codigo}")
    public Optional<Estudiante> getEstudianteByCodigo(@PathVariable String codigo) {
        return estudiantesRepository.findByCodigo(codigo);
    }

    @GetMapping
    public Iterable<Estudiante> listarEstudiantes() {
        return estudiantesRepository.findAll();
    }
    @PostMapping
    public Estudiante agregarEstudiante(@RequestBody Estudiante e) {
        System.out.println(e);
        return estudiantesRepository.save(e);
    }




}
