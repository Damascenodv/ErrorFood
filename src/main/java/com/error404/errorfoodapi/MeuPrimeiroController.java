package com.error404.errorfoodapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.error404.errorfoodapi.di.modelo.Cliente;
import com.error404.errorfoodapi.di.service.AtivacaoClienteService;


@Controller
public class MeuPrimeiroController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
	 
		
		return "Hello1!";
	}
	
}
