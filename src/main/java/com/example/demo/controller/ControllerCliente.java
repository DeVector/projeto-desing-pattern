package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.service.serviceImpl.ServiceClienteImpl;

@RestController
@RequestMapping(value = "clientes")
public class ControllerCliente {

	@Autowired
	private ServiceClienteImpl service;
	
	@GetMapping
	public ResponseEntity<Iterable<Cliente>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodas());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarPorId(@PathVariable("id") Long id){
		return ResponseEntity.ok(service.buscarPorId(id));
	}
	
	@PostMapping
	public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente){
		service.salvarCliente(cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizarCliente(@PathVariable("id")Long id, Cliente cliente){
		service.alterarCliente(id, cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarPorId(@PathVariable("id")Long id){
		service.deletarCliente(id);
		return ResponseEntity.ok().build();
	}
}
