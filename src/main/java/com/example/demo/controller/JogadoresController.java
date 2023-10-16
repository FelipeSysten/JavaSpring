package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Jogadores;


@Controller
public class JogadoresController {
	
	private List<Jogadores> jogador = new ArrayList<>();
	 
	  @GetMapping("/cadastro")
	  public String exibirFormulario() {
	      return "Cadastro";
	  }
	 
	  @PostMapping("/cadastrar")
	  public String cadastrarJogador(@RequestParam String nome, @RequestParam int numero, Model model) {
	       Jogadores jogadores = new Jogadores();
	       
	       jogadores.setNome(nome);
	       jogadores.setNumero(numero);
	       jogador.add(jogadores);
	              
	      return "redirect:/listar";
	  }
	 
	  @GetMapping("/listar")
	  public String listarJogadores(Model model) {
	      model.addAttribute("jogador", jogador);
	      return "Listagem";
	  }
}
