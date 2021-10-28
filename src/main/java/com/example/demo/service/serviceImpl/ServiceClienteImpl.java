package com.example.demo.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.model.Endereco;
import com.example.demo.repository.RepositoryCliente;
import com.example.demo.repository.RepositoryEndereco;
import com.example.demo.service.ServiceCliente;
import com.example.demo.service.ViaCepService;

@Service
public class ServiceClienteImpl implements ServiceCliente{
	
	@Autowired
	private RepositoryCliente clRepository;
	
	@Autowired
	private RepositoryEndereco edRepositry;
	
	@Autowired
	private ViaCepService cepService;

	@Override
	public Iterable<Cliente> buscarTodas() {
		return clRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void salvarCliente(Cliente cliente) {
		inserirClienteDB(cliente);		
	}

	@Override
	public void alterarCliente(Long id, Cliente cliente) {
		Optional<Cliente> cliente1 = clRepository.findById(id);
		if(cliente1.isPresent()) {
			inserirClienteDB(cliente);
		}
	}

	@Override
	public void deletarCliente(Long id) {
		clRepository.deleteById(id);		
	}
	
	private void inserirClienteDB(Cliente cliente) {
		
		String cep = cliente.getEndereco().getCep();
		
		Endereco endereco = edRepositry.findById(cep).orElseGet(()-> {
			Endereco newEndereco = cepService.consultarCep(cep);
			edRepositry.save(newEndereco);
			return newEndereco;
		});
		
		cliente.setEndereco(endereco);
		clRepository.save(cliente);
	}

}
