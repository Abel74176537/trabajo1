package pe.edu.upeu.msmatricula.Service;

import pe.edu.upeu.msmatricula.Entity.Matricula;

import java.util.List;
import java.util.Optional;

public interface MatriculaService {
    List<Matricula> listar();

    Optional<Matricula> buscarPorId(Integer id);

    Matricula guardar(Matricula matricula);

    Matricula actualizar(Matricula matricula);

    void borrarPorId(Integer id);
}