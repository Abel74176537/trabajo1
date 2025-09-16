package pe.edu.upeu.mscurso.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.mscurso.Entity.Curso;
import pe.edu.upeu.mscurso.Repository.CursoRepository;
import pe.edu.upeu.mscurso.Service.CursoService;

import java.util.List;
import java.util.Optional;
@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> buscarPorId(Integer id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Curso guardar(Curso curso) {return cursoRepository.save(curso);
    }

    @Override
    public Curso actualizar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void borrarPorId(Integer id) {
        cursoRepository.deleteById(id);
    }
}
