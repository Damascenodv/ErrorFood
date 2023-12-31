package com.error404.errorfoodapi.di.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.error404.errorfoodapi.di.dao.interfaces.Crudinterface;
import com.error404.errorfoodapi.di.dao.jpql.CozinhaJpqlDao;
import com.error404.errorfoodapi.di.modelo.Cozinha;


@Controller
public class CozinhaController {
    Crudinterface<Cozinha> cozinhas = new CozinhaJpqlDao();
    @Autowired
    public CozinhaController(Crudinterface<Cozinha> cozinhas) {
        this.cozinhas = cozinhas;
    }

    @GetMapping("/cozinha")
    @ResponseBody
    public List<Cozinha> cozinhas() {        
        return cozinhas.getAll() ;
    }
    
}
