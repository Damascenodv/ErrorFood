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

import com.error404.errorfoodapi.di.dao.interfaces.Crudinterface;
import com.error404.errorfoodapi.di.dao.jpql.PessoaJpqlDao;
import com.error404.errorfoodapi.di.modelo.Pessoa;

@Controller
public class PessoaController {
    Crudinterface<Pessoa> pessoas = new PessoaJpqlDao();
    @Autowired
    public PessoaController(Crudinterface<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @GetMapping("/pessoa")
    @ResponseBody
    public List<Pessoa> pessoas() {        
        return pessoas.getAll() ;
    }
    @PostMapping("/pessoa")
    public ResponseEntity postMethodName(@RequestBody Pessoa pessoa) {
        pessoas.insert(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body("pessoa cadastrada com sucesso");
    }


    @GetMapping("/pessoa/{id}")
    public ResponseEntity<Pessoa> buscarProdutoPorId(@PathVariable Long id) {
        Pessoa pessoa = pessoas.getAllbyPK(id);

        if (pessoa != null){
            return ResponseEntity.ok(pessoa);
        }
        return ResponseEntity.notFound().build();
    }


    @PutMapping("pessoa/{id}")
    public ResponseEntity updateCozinha(@PathVariable long id, @RequestBody Pessoa entity) {
        pessoas.update(id, entity);
        return ResponseEntity.status(HttpStatus.CREATED).body("pessoa alterada com sucesso");
    }
    
    @DeleteMapping("pessoa/{id}")
    public ResponseEntity deleteCozinha(@PathVariable long id){
        Pessoa cozinha =  pessoas.getAllbyPK(id);
        pessoas.delete(cozinha);
        return ResponseEntity.status(HttpStatus.CREATED).body("cozinha deleto com sucesso");

    }
}
