package com.wordpress.fatecode.tarefa0704;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.wordpress.fatecode.tarefa0701.ContaBancaria;
import com.wordpress.fatecode.tarefa0702.MovimentacaoDeposita;
import com.wordpress.fatecode.tarefa0702.MovimentacaoFinanceira;
import com.wordpress.fatecode.tarefa0702.MovimentacaoSaque;

public class Main {
	ArrayList<ContaBancaria> listaContas = new ArrayList<>();

	public static final String OPCOES_MENU = "1: Criar uma nova conta \n"
			+ "2: Definir o limite de uma conta \n"
			+ "3: Realizar uma retirada de uma conta \n"
			+ "4: Realizar um depósito em uma conta \n"
			+ "5: Visualizar o saldo e limite de uma conta \n"
			+ "6: Visualizar o extrato de uma conta \n"
			+ "7: excluir uma conta \n" + "Entre com a opção desejada: ";

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
	public void excluir(ContaBancaria contaBancaria) {
		listaContas.remove(contaBancaria);
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

	public static String input(String mensagem) {
		System.out.println(mensagem);
		
		return new Scanner(System.in).next();
	}

	public static void main(String[] args) {
		Main principal = new Main();
		ContaBancaria contaBancaria = null;
		MovimentacaoFinanceira movimentacao;

		while (true) {
			int opcao = Integer.parseInt(input(OPCOES_MENU));
			double valor = 0;
			int numero = Integer.parseInt(input("Entre com o número da conta"));

			if (opcao > 0)
				contaBancaria = principal.buscar(numero);

			switch (opcao) {

			case 1:
				String nome = input("Entre com o nome");

				String cpf = input("Entre com o cpf");

				double saldo = Double.parseDouble(input("Entre com o saldo"));

				contaBancaria = new ContaBancaria(numero, nome, cpf, saldo);

				principal.salvar(contaBancaria);
				break;

			case 2:
				double limite = Double.parseDouble(input("Entre com o limite"));
				contaBancaria.setLimite(limite);
				break;

			case 3:
				valor = Double.parseDouble(input("Entre com o valor do saque"));
				movimentacao = new MovimentacaoSaque(new Date(
						System.currentTimeMillis()), "Saque", valor);
				principal.efetuarTransacao(movimentacao, contaBancaria);

				System.out.println("Saque efetuado!");
				break;

			case 4:
				valor = Double.parseDouble(input("Entre com o valor do deposito"));
				movimentacao = new MovimentacaoDeposita(new Date(
						System.currentTimeMillis()), "Deposito", valor);
				principal.efetuarTransacao(movimentacao, contaBancaria);

				System.out.println("Depósito efetuado!");
				break;

			case 5:

				System.out.println("Saldo: " + contaBancaria.getSaldo()
						+ " | Limite: " + contaBancaria.getLimite());
				break;

			case 6:
				System.out.println(contaBancaria.getExtrato());
			case 7:
				principal.excluir(contaBancaria);
				break;
			}

		}
	}
}
