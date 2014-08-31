package com.wordpress.fatecode.tarefa0704;

import java.util.Date;
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

		Scanner input = getScanner();
		return input.nextInt();
	}

	public static ContaBancaria CriarConta() {
		Scanner input = getScanner();

		System.out.println("Entre com numero:");
		int numero = input.nextInt();

		System.out.println("Entre com o nome:");
		String nome = input.next();

		System.out.println("Entre com o cpf: ");
		String cpf = input.next();

		System.out.println("Entre com o saldo");
		double saldo = input.nextDouble();

		return new ContaBancaria(numero, nome, cpf, saldo);
	}

	public static Scanner getScanner() {
		Scanner input = new Scanner(System.in);
		return input;
	}

	public static void sacar(ContaBancaria conta) {
		MovimentacaoFinanceira movimentacao = CriarMovimentacaoFinanceira("Saque");
		
		conta.sacar(movimentacao.getValor(), movimentacao.getMovimentacao());
	}

	public static MovimentacaoFinanceira CriarMovimentacaoFinanceira(String tipo) {
		double valor = getScanner().nextDouble();

		MovimentacaoFinanceira movimentacao = new MovimentacaoFinanceira(
				new Date(System.currentTimeMillis()), tipo, valor);
		return movimentacao;
	}

	
	
	public static void depositar(ContaBancaria conta) {
		MovimentacaoFinanceira movimentacao = CriarMovimentacaoFinanceira("Depósito");
		conta.sacar(movimentacao.getValor(), movimentacao.getMovimentacao());
	}

	public static void definirLimiteConta(ContaBancaria conta) {
		Scanner input = getScanner();

		System.out.println("Entre com o limite: ");
		double limite = input.nextDouble();
	}

	public static void main(String[] args) {

	}
}
