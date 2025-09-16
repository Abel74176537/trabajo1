package pe.edu.upeu.mscurso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.mscurso.Entity.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Integer> {
}
