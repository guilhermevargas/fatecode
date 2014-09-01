package com.wordpress.fatecode.tarefa0704;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.wordpress.fatecode.tarefa0701.ContaBancaria;
import com.wordpress.fatecode.tarefa0702.MovimentacaoFinanceira;
import com.wordpress.fatecode.tarefa0702.MovimentacaoSaque;

public class Main {
	public static final String OPCOES_MENU = "1: Criar uma nova conta \n"
			+ "2: Definir o limite de uma conta \n"
			+ "3: Realizar uma retirada de uma conta \n"
			+ "4: Realizar um depósito em uma conta \n"
			+ "5: Visualizar o saldo e limite de uma conta \n"
			+ "6: Visualizar o extrato de uma conta \n"
			+ "7: excluir uma conta \n" + "Entre com a opção desejada: ";

	ArrayList<ContaBancaria> listaContas = new ArrayList<>();

	/**
	 * Cria Scanner
	 * 
	 * @return scanner para obter entrada de dados
	 */
	public static Scanner criarScanner() {
		Scanner input = new Scanner(System.in);
		return input;
	}

	/**
	 * Efetua a trasacao a partir do tipo de movimentação
	 * 
	 * @param movimentacao
	 * @param conta
	 */
	public void efetuarTransacao(MovimentacaoFinanceira movimentacao,
			ContaBancaria conta) {
		movimentacao.efetuarTransacao(conta);
	}

	/**
	 * 
	 * @param contas
	 * @param conta
	 */
	public void excluir(int numeroConta) {

	}

	/**
	 * Salva conta bancaria
	 * 
	 * @param contaBancaria
	 */
	public void salvar(ContaBancaria contaBancaria) {
		listaContas.add(contaBancaria);
	}

	/**
	 * Método abre campos para entrada de dados
	 * 
	 * @return retorna uma conta bancaria ainda não salva
	 */
	public static ContaBancaria criarContaBancaria() {
		Scanner input = criarScanner();

		System.out.println("Entre com o número: ");
		int numero = input.nextInt();

		System.out.println("Entre com o nome: ");
		String nome = input.next();

		System.out.println("Entre com cpf: ");
		String cpf = input.next();

		System.out.println("Entre com o saldo: ");
		double saldo = input.nextDouble();

		return new ContaBancaria(numero, nome, cpf, saldo);
	}

	/**
	 * Buscar conta bancaria a partir do numero da conta
	 * 
	 * @param numero
	 * @return conta bancaria encontrada, ou retorna null caso não encontre
	 */
	public ContaBancaria buscar(int numero) {
		Iterator<ContaBancaria> i = listaContas.iterator();

		while (i.hasNext()) {
			ContaBancaria contaBancaria = i.next();
			
			if (contaBancaria.getNumero() == numero)
				return contaBancaria;
		}

		return null;
	}

	public static void main(String[] args) {
		Main principal = new Main();
		Scanner input = criarScanner();

		

		ContaBancaria contaBancaria = null;
		
		
		while (true) {
			System.out.println(OPCOES_MENU);
			int opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				contaBancaria = criarContaBancaria();
				principal.salvar(contaBancaria);
				break;

			case 2:
				System.out.println("Entre com o numero da conta");
				int numero = input.nextInt();
				contaBancaria = principal.buscar(numero);

				System.out.println("Entre com o valor do saque");
				double valor = input.nextDouble();
				MovimentacaoFinanceira movimentacao = new MovimentacaoSaque(
						new Date(System.currentTimeMillis()), "Saque", valor);
				
				principal.efetuarTransacao(movimentacao, contaBancaria);

				System.out.println("Saque efetuado!");

			case 3:
			}
		}
	}
}
