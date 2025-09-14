package com.example.mscliente.Service;

import com.example.mscliente.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> listar();
    Optional<Cliente> buscarPorid(Integer id);
    Cliente guardar(Cliente cliente);
    Cliente actualizar(Cliente cliente);
    void borrarPorid (Integer id);
}
