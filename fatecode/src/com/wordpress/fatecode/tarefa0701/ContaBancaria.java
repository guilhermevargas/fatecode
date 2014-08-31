package com.wordpress.fatecode.tarefa0701;

public class ContaBancaria {
	private int numero;
	private String nome;
	private String cpf;
	private double saldo;
	private double limite;
	
	public ContaBancaria(int numero, String nome, String cpf, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if (valor <= this.saldo + this.limite)
			this.saldo -= valor;
		else 
			throw new IllegalArgumentException("Saldo insuficiente.");
	}
	
	public void depositar(double valor) {
		if (valor > 0)
			this.saldo =+ valor;
		else 
			throw new IllegalArgumentException("O valor do deposito deve ser positivo.");
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
