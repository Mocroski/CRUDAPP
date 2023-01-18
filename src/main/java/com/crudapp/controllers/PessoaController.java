package com.crudapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.entities.Pessoa;
import com.crudapp.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping("/listar")
	public Iterable<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
	
	@PostMapping("/cadastrar")
	public Pessoa cadastrar(@RequestBody Pessoa pessoaObj) {
		return pessoaRepository.save(pessoaObj);
	}
	
	@GetMapping("/busca/{id}")
	public Optional<Pessoa> buscar(@PathVariable Long id){
		return pessoaRepository.findById(id);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletar(@PathVariable Long id) {
		pessoaRepository.deleteById(id);
	}
	

}
