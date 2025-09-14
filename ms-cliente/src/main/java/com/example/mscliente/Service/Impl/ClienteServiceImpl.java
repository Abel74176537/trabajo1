package com.example.mscliente.Service.Impl;

import com.example.mscliente.Entity.Cliente;
import com.example.mscliente.Repository.ClienteRepository;
import com.example.mscliente.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> listar(){return clienteRepository.findAll();}
    @Override
    public Optional <Cliente> buscarPorid (Integer id){return clienteRepository.findById(id); }
    @Override
    public Cliente guardar(Cliente cliente){return clienteRepository.save(cliente); }
    @Override
    public Cliente actualizar (Cliente cliente){return clienteRepository.save(cliente);}
    @Override
    public void borrarPorid(Integer id){clienteRepository.deleteById(id);}
}
