package com.crudapp.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "enderecos")
@Getter
@Setter
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoEndereco;
	
	private String logradouro;
	
	private String cep;
	
	private String numero;
	
	private String cidade;
	
	@ManyToMany(mappedBy = "enderecos")
	private List<Pessoa> pessoas = new ArrayList<>();
	
}
