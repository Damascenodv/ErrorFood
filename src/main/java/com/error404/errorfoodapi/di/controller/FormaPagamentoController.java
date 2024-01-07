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
import com.error404.errorfoodapi.di.dao.jpql.FormaPagamentoJpqlDao;
import com.error404.errorfoodapi.di.modelo.FormaPagamento;




@Controller
public class FormaPagamentoController {
   
   
    Repositorio<FormaPagamento> formaPagamentos = new FormaPagamentoJpqlDao();

    @Autowired
    public FormaPagamentoController(Repositorio<FormaPagamento> formaPagamentos){
        this.formaPagamentos = formaPagamentos;

    }

    @GetMapping("/formaPagamento")
    @ResponseBody
    public  List<FormaPagamento> buscarPorId(){
        return formaPagamentos.getAll();

    }
    
    @GetMapping("/formaPagamento/{id}")
    public ResponseEntity<FormaPagamento> getMethodName(@PathVariable  long id) {
        FormaPagamento formaPagamento = formaPagamentos.getAllbyPK(id);
        if(formaPagamento != null){
            return ResponseEntity.ok(formaPagamento);
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping("/formaPagamento")
    public ResponseEntity postMethodName(@RequestBody FormaPagamento formaPagamento) {
        formaPagamentos.insert(formaPagamento);       
        return ResponseEntity.status(HttpStatus.CREATED).body("forma de pagamento inserida com sucesso");
    }
    

    @PutMapping("/formaPagamento/{id}")
    public ResponseEntity putMethodName(@PathVariable long id, @RequestBody FormaPagamento entity) {
        formaPagamentos.update(id, entity);   
        return ResponseEntity.status(HttpStatus.CREATED).body("forma de pagamento alterado com sucesso");
    }
    @DeleteMapping("/formaPagamento/{id}")
    public ResponseEntity deleEntity(@PathVariable long id){
        FormaPagamento formaPagamento = formaPagamentos.getAllbyPK(id);
        if(formaPagamento != null){
            formaPagamentos.delete(formaPagamento);  
            return ResponseEntity.status(HttpStatus.CREATED).body("forma de pagamento alterado com sucesso");
        }       
        return ResponseEntity.status(HttpStatus.CREATED).body("erro ao deletar o forma de pagaemnto");
        
    }
    

    

    
}
