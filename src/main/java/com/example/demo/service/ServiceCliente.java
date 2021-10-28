package com.example.demo.service;

import com.example.demo.model.Cliente;

public interface ServiceCliente {

	Iterable<Cliente> buscarTodas();
	Cliente buscarPorId(Long id);
	void salvarCliente(Cliente cliente);
	void alterarCliente(Long id, Cliente cliente);
	void deletarCliente(Long id);
	
}
