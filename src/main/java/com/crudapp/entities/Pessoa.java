package com.crudapp.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "pessoas")
@Getter
@Setter
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoPessoa;
	
	@Column(nullable = false)
	private String nome;
	
	private String dataNascimento;
	
	@ManyToMany
	@JoinTable(
			name = "tabelaRelacional",
			joinColumns = {@JoinColumn(name = "codigo_pessoa", referencedColumnName = "codigoPessoa")},
			inverseJoinColumns = {@JoinColumn(name = "codigo_endereco", referencedColumnName = "codigoEndereco")})
	private List<Endereco> enderecos = new ArrayList<>();
}
