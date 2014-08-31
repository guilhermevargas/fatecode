package com.wordpress.fatecode.tarefa0702;

import java.util.Date;

import com.wordpress.fatecode.tarefa0701.ContaBancaria;

public class MovimentacaoSaque extends MovimentacaoFinanceira {

	public MovimentacaoSaque(Date timeStamp, String tipo, double valor) {
		super(timeStamp, tipo, valor);
	}

	@Override
	public void efetuarTransacao(ContaBancaria conta) {
		conta.sacar(this.getValor(), this.getMovimentacao());
		
	}

}
