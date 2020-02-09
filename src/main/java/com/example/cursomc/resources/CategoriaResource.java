package com.example.cursomc.resources;

import com.example.cursomc.dominio.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar() {

        Categoria categoria1 = new Categoria(1,"Informatica");
        Categoria categoria2 = new Categoria(1,"Informatica");

        List<Categoria> list = new ArrayList<>();
        list.add(categoria1);
        list.add(categoria2);
        return list;
    }
}
