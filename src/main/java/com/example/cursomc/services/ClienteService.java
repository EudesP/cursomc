package com.example.cursomc.services;

import com.example.cursomc.dominio.Categoria;
import com.example.cursomc.dominio.Cliente;
import com.example.cursomc.repositories.ClienteRepository;
import com.example.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objecto não encontrado! Id: " + id +", Tipo: " + Cliente.class.getName()));
    }
}
