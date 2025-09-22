package pe.edu.upeu.msmatricula.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.upeu.msmatricula.Dto.CursoDto;

@FeignClient(name = "ms-curso", path = "/curso")
public interface CursoFeign {
    @GetMapping("/{id}")
    ResponseEntity<CursoDto> buscarPorId(@PathVariable Long id);
}
