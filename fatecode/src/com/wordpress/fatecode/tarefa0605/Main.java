package com.wordpress.fatecode.tarefa0605;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Estacionamento[] estacaionamentos = new Estacionamento[5];
		Tempo entrada;
		Tempo saida;
		
		for (int i = 0; i < estacaionamentos.length; i++) {
			System.out.println("Entre com a placa");
			String placa = scanner.next();
			
			System.out.println("Entre com a marca");
			String marca = scanner.next();
			
			System.out.println("Entre com a hora:minuto:segundo de entrada");
			int hora = scanner.nextInt();
			int minuto = scanner.nextInt();
			int segundo = scanner.nextInt();
			entrada = new Tempo(hora, minuto, segundo);
			
			System.out.println("Entre com a hora:minuto:segundo de saída");
			hora = scanner.nextInt();
			minuto = scanner.nextInt();
			segundo = scanner.nextInt();
			saida = new Tempo(hora, minuto, segundo);
			
			estacaionamentos[i] = new Estacionamento();
			estacaionamentos[i].setDados(placa, marca, entrada, saida);
		}
		
		for (int i = 0; i < estacaionamentos.length; i++) {
			System.out.println(estacaionamentos[i].toString());
		}
	}
}
