package com.wordpress.fatecode.tarefa0203;

import java.util.Scanner;

public class Tabuada {

	public void geraTabuada(int numero) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " x " + numero + " = " + i * numero);
		}
	}

	public int mostraMenu() {
		int result = 0;
		
		do {
			String mensagem = "0: Sair\n" + "1: Tabuada do 1\n"
					+ "2: Tabuada do 2\n" + "3: Tabuada do 3\n"
					+ "4: tabuada do 4\n" + "5: Tabuada do 5\n"
					+ "6: Tabuada do 6\n" + "7: Tabuada do 7\n"
					+ "8: tabuada do 8\n" + "9: Tabuada do 9\n"
					+ "10: Tabuada de outro número\n";

			System.out.println(mensagem);
			
			result = input();

		} while (result < 0 || result > 10);

		return result;
	}
	
	public static int input() {
		System.out.println("Entre com o número");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
		int result = tabuada.mostraMenu();
		
		switch (result) {
		case 0: break;
		case 10:
			tabuada.geraTabuada(input());
			break;
		default : tabuada.geraTabuada(result);	
		}
	}
	
}
