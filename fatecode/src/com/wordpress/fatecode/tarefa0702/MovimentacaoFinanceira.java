package com.wordpress.fatecode.tarefa0702;

import java.util.Date;

public class MovimentacaoFinanceira {
	private Date timeStamp;
	private String tipo;
	private double valor;
	
	public MovimentacaoFinanceira(Date timeStamp, String tipo, double valor) {
		this.timeStamp = timeStamp;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getMovimentacao() {
		String dadosMovimentacao = "Data: " + timeStamp.toString();
		dadosMovimentacao += " Tipo: " + tipo;
		dadosMovimentacao += " Valor: " + valor;
		
		return dadosMovimentacao;
	}

	public double getValor() {
		return valor;
	}
 
}
