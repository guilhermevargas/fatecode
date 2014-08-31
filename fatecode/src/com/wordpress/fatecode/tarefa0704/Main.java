package com.wordpress.fatecode.tarefa0704;

import java.util.Scanner;

import com.wordpress.fatecode.tarefa0701.ContaBancaria;
import com.wordpress.fatecode.tarefa0702.MovimentacaoFinanceira;

public class Main {

	public static int exibirMenu() {
		String opcoesMenu = "1: Criar uma nova conta \n";
		opcoesMenu += "2: Definir o limite de uma conta \n";
		opcoesMenu += "3: Realizar uma retirada de uma conta \n";
		opcoesMenu += "4: Realizar um depósito em uma conta \n";
		opcoesMenu += "5: Visualizar o saldo e limite de uma conta \n";
		opcoesMenu += "6: Visualizar o extrato de uma conta \n";
		opcoesMenu += "7: excluir uma conta";
		opcoesMenu += "Entre com a opção desejada: ";
		System.out.println(opcoesMenu);

		return criarScanner().nextInt();
	}
	
	/**
	 * Cria Scanner
	 * @return scanner para obter entrada de dados
	 */
	public static Scanner criarScanner() {
		Scanner input = new Scanner(System.in);
		return input;
	}

	/**
	 * Efetua a trasacao a partir do tipo de movimentação 
	 * @param movimentacao
	 * @param conta
	 */
	public static void efetuarTransacao(MovimentacaoFinanceira movimentacao, ContaBancaria conta) {
		movimentacao.efetuarTransacao(conta);
	}
	
	/**
	 * 
	 * @param contas
	 * @param conta
	 */
	public void excluir(ContaBancaria[] contas, ContaBancaria conta) {
		for (ContaBancaria contaAtual : contas) {
			if (contaAtual.getNumero() == conta.getNumero()) {
				contaAtual = null;
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
