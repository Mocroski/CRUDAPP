package com.crudapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudapp.entities.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
