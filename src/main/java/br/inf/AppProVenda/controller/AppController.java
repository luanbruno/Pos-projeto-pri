package br.inf.AppProVenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.inf.AppProVenda.modal.service.AppService;

@Controller
public class AppController {
	
	@Autowired
	private AppService appService;
	

	@GetMapping(value = "/home")
	public String telahome() {
		
		return "home";
	}
	
	@GetMapping(value = "/app")
	public String telaApp(Model model) {
		
		model.addAttribute("myMap", appService.qtds());
		
		return "app";
	}

}
