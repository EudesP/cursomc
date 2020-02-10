package com.example.cursomc.services;

import com.example.cursomc.dominio.Categoria;
import com.example.cursomc.repositories.CategoriaRepository;
import com.example.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objecto não encontrado! Id: " + id +", Tipo: " + Categoria.class.getName()));
    }
}
