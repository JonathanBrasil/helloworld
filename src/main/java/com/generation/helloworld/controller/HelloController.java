package com.generation.helloworld.controller;


//Estamos criando uma classe....
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//importar os comandos abaixos (ctrl+shift+O)

@RestController //serve para indicar que é uma classe controladora
@RequestMapping("/hello") //para definir para qual recurso será feito a request
public class HelloController {

	//criando método
	@GetMapping  //para indicar o método HTTP
	public String hello() {
		return "Hello World!";
			}
	
	@GetMapping("/bsm")  //para indicar outro endereço
	public String bsm() {
		return "Comunicação <br /> "
				+ "Persistência <br /> "
				+ "Orientação ao Detalhe <br />"
				+ "Trabalho em Equipe";
			}
	
	@GetMapping("/objetivos")  //para indicar outro endereço
	public String objetivos() {
		return "Meus objetivos de aprendizagem essa semana são: "
				+ "<br /> Ver todos os vídeos 	"
				+ "<br /> Organizar o GitHub 	"
				+ "<br /> Praticar e realizar os exercícios";
			}
	
}
