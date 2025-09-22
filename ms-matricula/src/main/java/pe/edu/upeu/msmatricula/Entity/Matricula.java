package pe.edu.upeu.msmatricula.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "matricula")  // 👈 nombre exacto de la tabla
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")   // 👈 nombre real de la columna en la BD
    private Integer idMatricula;

    @Column(name = "nombre_alumno")  // opcional, si quieres respetar snake_case en BD
    private String nombreAlumno;

    @Column(name = "numero_matricula")
    private String numeroMatricula;
}
