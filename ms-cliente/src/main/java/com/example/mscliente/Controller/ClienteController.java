package com.example.mscliente.Controller;

import com.example.mscliente.Entity.Cliente;
import com.example.mscliente.Service.ClienteService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @GetMapping
    public List<Cliente> listar(){return clienteService.listar();}
    @GetMapping("/{id}")
    public Cliente buscarPorid(@PathVariable Integer id){return clienteService.buscarPorid(id).get();}
    @PostMapping
    public Cliente guardar(Cliente cliente){return clienteService.guardar(cliente);}
    @PutMapping
    public Cliente actualizar (Cliente cliente){return clienteService.actualizar(cliente);}
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Integer id){
        clienteService.borrarPorid(id);
        return "cliente eliminado";
    }

}
