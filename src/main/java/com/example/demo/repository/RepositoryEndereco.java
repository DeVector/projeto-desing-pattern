package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Endereco;

@Repository
public interface RepositoryEndereco extends CrudRepository<Endereco, String>{

}
