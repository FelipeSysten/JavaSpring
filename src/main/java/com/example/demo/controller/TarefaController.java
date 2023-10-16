package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Tarefa;


@Controller
public class TarefaController {
	
	@GetMapping("/lista")
	public String lista(Model model) {
		
		List<Tarefa> dados = new ArrayList<>();
		
		dados.add(new Tarefa(1, "Jogar Video Game"));
		dados.add(new Tarefa(2, "Trabalhar"));
		dados.add(new Tarefa(3, "Ler"));
		dados.add(new Tarefa(4, "Estudar"));
		
		model.addAttribute("x", dados);
	
		
		return "ViewList";
	}
	

}
