package pe.edu.upeu.msmatricula.Dto;

import lombok.Data;

@Data
public class DetalleMatriculaDto {

    private Long idMatricula;
    private Long idCurso;
    private Long idDetalleMatricula;
    private CursoDto curso;
}
