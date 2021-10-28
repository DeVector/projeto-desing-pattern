package com.example.demo.model;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContaBancaria {

	@Id
	private int conta;
	private long agencia;
	private String banco;
	private float saldo;
	private boolean ativa;
	
	public ContaBancaria() {
		this.ativa = true;
		Random random = new Random();
		this.conta = random.nextInt(9999999);
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public long getAgencia() {
		return agencia;
	}

	public void setAgencia(long agencia) {
		this.agencia = agencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
}
