package com.wordpress.fatecode.tarefa0802;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.wordpress.fatecode.tarefa0801.Aluno;

public class Main {
	public static HashMap<String, Aluno> todosAlunos = new HashMap<String, Aluno>();
	
	public static final String menu = "1: Cadastrar um aluno\n"
			+ "2: Remover um aluno" + "3: Listar os alunos da sala\n"
			+ "4: Lançar as faltas dos alunos\n"
			+ "5: Lançar  as notas dos alunos\n"
			+ "0: Sair\n";

	public static String input(String mensagem) {
		System.out.println(mensagem);
		Scanner scanner = new Scanner(System.in);

		return scanner.next();
	}

	public static int mostrarMenu() {
		System.out.println(menu);
		int opcao = Integer.parseInt(input("entre com a opção: "));

		return opcao;
	}

	public static void main(String[] args) {
		int opcao = 0;
		do {
			opcao = mostrarMenu();
			
			switch (opcao) {
			case 1:
				cadastrarAluno();
				break;
			case 2:
				excluirAluno();
				break;
			case 3:
				listarAlunos();
				break;
				
			case 4:
				lancarFaltasAluno();
				break;
				
			case 5:
				lancarNotasAluno();
				break;
			default: System.out.println("Finalizado.");
			}
		} while (opcao != 0);
	}

	private static void lancarNotasAluno() {
		String matricula = input("Entre com a matricula: ");
		Aluno aluno = todosAlunos.get(matricula);
		
		int p1 = Integer.parseInt(input("Entre com a p1: "));
		int p2 = Integer.parseInt(input("Entre com a p2: "));
		int np = Integer.parseInt(input("Entre com a np: "));
		aluno.setP1(p1);
		aluno.setP2(p2);
		aluno.setNp(np);
	}

	private static void lancarFaltasAluno() {
		String matricula = input("Entre com a matricula: ");
		Aluno aluno = todosAlunos.get(matricula);
		
		int falta_b1 = Integer.parseInt(input("Entre com as faltas 1 bimestre: "));
		int falta_b2 = Integer.parseInt(input("Entre com as faltas 2 bimestre: "));
		aluno.setFalta_b1(falta_b1);
		aluno.setFalta_b2(falta_b2);
	}

	private static void listarAlunos() {
		Set<String> keysSet = todosAlunos.keySet();
		for (String chave : keysSet) {
			Aluno aluno = todosAlunos.get(chave);
			System.out.println("Matricula: " + aluno.getMatricula()
					+ " Nome: " + aluno.getNome());
		}
	}

	private static void excluirAluno() {
		String matricula = input("Entre com a matricula: ");
		todosAlunos.remove(matricula);
	}

	private static void cadastrarAluno() {
		String nome = input("Nome do aluno: ");
		String matricula = input("Matricula do aluno: ");
		todosAlunos.put(matricula, new Aluno(matricula, nome));
	}
}
