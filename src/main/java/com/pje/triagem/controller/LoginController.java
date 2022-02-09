package com.pje.triagem.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pje.triagem.modelo.Usuario;
import com.pje.triagem.repository.SeleniumRepository;


@RestController
@CrossOrigin
@RequestMapping("/pje")
public class LoginController {
	

		
		private SeleniumRepository repository = new SeleniumRepository();

		@GetMapping("/open")
		public @ResponseBody Usuario open() throws InterruptedException {
			return repository.open();
		}
}
