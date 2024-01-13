package com.error404.errorfoodapi.di.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.error404.errorfoodapi.di.dao.interfaces.Repositorio;
import com.error404.errorfoodapi.di.dao.jpql.PermissaoJpqlDao;
import com.error404.errorfoodapi.di.modelo.Permissao;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class PermissaoController {
    Repositorio<Permissao> permissoes = new PermissaoJpqlDao();

    @Autowired
    public PermissaoController(Repositorio<Permissao> permissoes){
        this.permissoes = permissoes;
    }


    @GetMapping("/permissao")
    @ResponseBody
    public List<Permissao> getMethodName() {
        return permissoes.getAll() ;
    }

    @GetMapping("/permissao/{id}")
    public ResponseEntity<Permissao> getMethodName(@PathVariable long id) {
        Permissao permissao = permissoes.getAllbyPK(id);
        if(permissao != null){
            return ResponseEntity.ok(permissao);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/permissao")
    public ResponseEntity postMethodName(@RequestBody Permissao entity) {
        permissoes.insert(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body("inserido com sucesso");
    }
    

    @PutMapping("/permissao/{id}")
    public ResponseEntity putMethodName(@PathVariable long id, @RequestBody Permissao permissao) {
        permissoes.update(id, permissao);
        return ResponseEntity.status(HttpStatus.CREATED).body("permissao não encontrada");
    }
    
    @DeleteMapping("/permissao/{id}")
    public ResponseEntity delete(@PathVariable long id ) {
        Permissao permissao = permissoes.getAllbyPK(id);
        permissoes.delete(permissao);
        return ResponseEntity.status(HttpStatus.CREATED).body("deletado com sucesso");
    }
    
    
}
