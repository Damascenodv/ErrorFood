package com.error404.errorfoodapi.di.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.error404.errorfoodapi.di.dao.interfaces.Repositorio;
import com.error404.errorfoodapi.di.dao.jpql.CozinhaJpqlDao;
import com.error404.errorfoodapi.di.modelo.Cozinha;




@Controller
public class CozinhaController {
   
   
    Repositorio<Cozinha> cozinhas = new CozinhaJpqlDao();
    @Autowired
    public CozinhaController(Repositorio<Cozinha> cozinhas) {
        this.cozinhas = cozinhas;
    }

    @GetMapping("/cozinha")
    @ResponseBody
    public List<Cozinha> cozinhas() {        
        return cozinhas.getAll() ;
    }
    @PostMapping("/cozinha")
    public ResponseEntity insertCozinha(@RequestBody Cozinha cozinha) {
        cozinhas.insert(cozinha);
        return ResponseEntity.status(HttpStatus.CREATED).body("cozinha cadastrada com sucesso");
    }


    @GetMapping("/cozinha/{id}")
    public ResponseEntity<Cozinha> buscarProdutoPorId(@PathVariable Long id) {
        Cozinha cozinha = cozinhas.getAllbyPK(id);

        if (cozinha != null){
            return ResponseEntity.ok(cozinha);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("cozinha/{id}")
    public ResponseEntity updateCozinha(@PathVariable long id, @RequestBody Cozinha entity) {
        cozinhas.update(id, entity);
        return ResponseEntity.status(HttpStatus.CREATED).body("cozinha alterada com sucesso");
    }
    
    @DeleteMapping("cozinha/{id}")
    public ResponseEntity deleteCozinha(@PathVariable long id){
        Cozinha cozinha =  cozinhas.getAllbyPK(id);
        cozinhas.delete(cozinha);
        return ResponseEntity.status(HttpStatus.CREATED).body("cozinha deleto com sucesso");

    }

    
    
    
}
