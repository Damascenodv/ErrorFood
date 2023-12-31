package com.error404.errorfoodapi.di.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.error404.errorfoodapi.di.dao.interfaces.Crudinterface;
import com.error404.errorfoodapi.di.dao.jpql.RestauranteJpqlDao;
import com.error404.errorfoodapi.di.modelo.Restaurante;




@Controller
public class RestauranteController {
    Crudinterface<Restaurante> restaurantes = new RestauranteJpqlDao();
    @Autowired
    public RestauranteController(Crudinterface<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    @GetMapping("/restaurante")
    @ResponseBody
    public List<Restaurante> restaurantes() {        
        return restaurantes.getAll() ;
    }
    @PostMapping("/restaurante")
    public ResponseEntity postMethodName(@RequestBody Restaurante restaurante) {
        restaurantes.insert(restaurante);
        return ResponseEntity.status(HttpStatus.CREATED).body("restaurante cadastrada com sucesso");
    }


    @GetMapping("/restaurante/{id}")
    public ResponseEntity<Restaurante> buscarProdutoPorId(@PathVariable Long id) {
        Restaurante restaurante = restaurantes.getAllbyPK(id);

        if (restaurante != null){
            return ResponseEntity.ok(restaurante);
        }
        return ResponseEntity.notFound().build();
    }
}