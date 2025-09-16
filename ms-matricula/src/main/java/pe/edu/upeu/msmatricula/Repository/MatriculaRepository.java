package pe.edu.upeu.msmatricula.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.msmatricula.Entity.Matricula;


public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
}
