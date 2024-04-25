package org.example.api;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="estudiantes")
public class Estudiante {
   private @Id @GeneratedValue(strategy = GenerationType.AUTO) Integer id;
   private String codigo;
   private String nombre;
   private String correo;

}
