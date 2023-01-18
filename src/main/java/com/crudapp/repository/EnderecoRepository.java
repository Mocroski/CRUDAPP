package com.crudapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudapp.entities.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{

}
