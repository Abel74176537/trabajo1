package pe.edu.upeu.msmatricula.Dto;

import lombok.Data;

import java.util.List;
@Data
public class MatriculaDto {
    private Long idMatricula;
    private String nombreAlumno;
    private String numeroMatricula;
    private List<DetalleMatriculaDto> detalles;
}
