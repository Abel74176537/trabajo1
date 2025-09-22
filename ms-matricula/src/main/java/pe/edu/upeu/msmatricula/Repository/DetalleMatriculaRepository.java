package pe.edu.upeu.msmatricula.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.msmatricula.Entity.DetalleMatricula;

import java.util.List;

public interface DetalleMatriculaRepository extends JpaRepository<DetalleMatricula, Long> {
    List<DetalleMatricula> findByMatriculaIdMatricula(Long id);
}