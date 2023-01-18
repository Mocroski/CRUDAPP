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

import com.crudapp.entities.Endereco;
import com.crudapp.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@GetMapping("/listar")
	public Iterable<Endereco> listar() {
		return enderecoRepository.findAll();
	}

	@PostMapping("/cadastrar")
	public Endereco cadastrar(@RequestBody Endereco enderecoObj) {
		return enderecoRepository.save(enderecoObj);
	}

	@GetMapping("/busca/{id}")
	public Optional<Endereco> buscar(@PathVariable Long id) {
		return enderecoRepository.findById(id);
	}

	@DeleteMapping("/deletar/{id}")
	public void deletar(@PathVariable Long id) {
		enderecoRepository.deleteById(id);
	}
}
