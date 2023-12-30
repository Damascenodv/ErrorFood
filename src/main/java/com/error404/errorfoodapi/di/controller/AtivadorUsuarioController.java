package com.error404.errorfoodapi.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.error404.errorfoodapi.di.modelo.Cliente;
import com.error404.errorfoodapi.di.modelo.enums.NivelUrgencia;
import com.error404.errorfoodapi.di.notificacao.Notificador;
import com.error404.errorfoodapi.di.notificacao.TipoNotificador;
import com.error404.errorfoodapi.di.service.AtivacaoClienteService;
import com.error404.errorfoodapi.di.service.listener.NotificacaoServce;


@Controller
public class AtivadorUsuarioController {

	private AtivacaoClienteService ativacaoClienteService; 
	@TipoNotificador(NivelUrgencia.URGENTE)
	@Autowired(required = false)
	private Notificador notificador;

	private Cliente cliente;
	

	public AtivadorUsuarioController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;

		System.out.println("MeuPrimeiroController: "+ativacaoClienteService  );
	}


	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("joão", "email@gmail.com", "999999");
	 
		ativacaoClienteService.ativar(joao,notificador);
		return "Hello1234!";
	}

	@GetMapping("/ativacaoTeste")
	@ResponseBody
	public String ativarTest() {
		cliente = new Cliente("joão", "email@gmail.com", "999999");
		ativacaoClienteService.ativar(cliente,notificador);
		return NotificacaoServce.getMessage();
	}
	
}
