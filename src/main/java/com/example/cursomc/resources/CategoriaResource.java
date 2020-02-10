package com.example.cursomc.resources;

import com.example.cursomc.dominio.Categoria;
import com.example.cursomc.services.CategoriaService;
import org.hibernate.mapping.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Categoria obj = categoriaService.buscar(id);
        return ResponseEntity.ok().body(obj);

//        01
//        Categoria categoria1 = new Categoria(1,"Informatica");
//        Categoria categoria2 = new Categoria(1,"Informatica");
//
//        List<Categoria> list = new ArrayList<>();
//        list.add(categoria1);
//        list.add(categoria2);
//        return list;
    }
}
