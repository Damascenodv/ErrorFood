package com.error404.errorfoodapi.di.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.error404.errorfoodapi.di.modelo.Cliente;
import com.error404.errorfoodapi.di.service.AtivacaoClienteService;


@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;
	

	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;

		System.out.println("MeuPrimeiroController: "+ativacaoClienteService  );
	}


	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("joão", "email@gmail.com", "999999");
	 
		ativacaoClienteService.ativar(joao);
		return "Hello1234!";
	}
	
}
