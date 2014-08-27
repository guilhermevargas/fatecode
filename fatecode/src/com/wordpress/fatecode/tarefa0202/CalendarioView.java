package com.wordpress.fatecode.tarefa0202;

import java.util.Scanner;

public class CalendarioView {
	String[][] matrizCalendario;
	
	public CalendarioView(String[][] matrizCalendario) {
		this.matrizCalendario = matrizCalendario;
	}
	
	/**
	 * Mostra o calendario no console
	 */
	public void printCalendario() {
		System.out.println(" D  S  T  Q  Q  S  S");

		// Um looping pra percorrer a matriz já inicializada
		for (int i = 0; i < matrizCalendario.length; i++) {
			for (int j = 0; j < matrizCalendario[0].length; j++) {
				if (matrizCalendario[i][j].length() < 2) {
					System.out.print(" " + matrizCalendario[i][j] + " ");
				} else {
					System.out.print(matrizCalendario[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}
	

	public static String mostraMenu(String mensagem) {
		System.out.println(mensagem);

		Scanner scanner = new Scanner(System.in); // Class Scanner usado para
													// entrada de dados.
		return scanner.nextLine(); // Método NextLine usado para capturar
									// a string digitado no console
	}
}
