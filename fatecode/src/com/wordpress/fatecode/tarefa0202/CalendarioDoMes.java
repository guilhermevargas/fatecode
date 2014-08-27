package com.wordpress.fatecode.tarefa0202;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarioDoMes {
	private Calendar calendar;
	private String[][] matrizCalendario;

	public CalendarioDoMes(Calendar calendar) {
		this.calendar = calendar;
		init();
	}

	public void init() {
		// obtem a quantidade de semanas no mês
		int linhas = getLinhas();
		// obtem o máximo de dias da semana.
		int colunas = getColunas();

		// instancia a matriz com as informações obtidas
		matrizCalendario = new String[linhas][colunas];

		// preenche a matriz com os dias em seu devido lugar
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				
				if (i == getSemanaAtual() && j == getDiaDaSemanaAtual()) {
					matrizCalendario[i][j] = String.valueOf(getDiaDoMesAtual());
					// vai para o próximo dia, Ex: 1, 2 ,3 ... 31
					adicionaDia(1);
				} else {
					matrizCalendario[i][j] = " ";
				}
			}
		}
	}

	/**
	 * obtem o mês e ano
	 * 
	 * @return Calendar
	 */
	public static Calendar converParaCalendar(String data) {
		Calendar calendar = Calendar.getInstance(); // Class responsável por
													// manipular datas

		// bloco try usado para empacotar o código que pode gerar uma exceção.
		// Neste caso, se não for possível transformar a String em Calendar,
		// será lançada a exceção ParseException,
		// onde a mesma será capturada no bloco catch
		try {
			// seta o calendário com a String que foi convertida em Date
			// através da classe SimpleDateFormat
			calendar.setTime(new SimpleDateFormat("MM/yyyy").parse(data));
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.print("Data informada inválida!");
		}

		// se tudo der certo, retorna um Calendar válido
		return calendar;
	}
	
	

	/**
	 * avança ou retrocede a quantidade de dias
	 * 
	 * @param quantidade
	 *            de dias
	 */
	public void adicionaDia(int quantidadeDias) {
		calendar.add(Calendar.DAY_OF_MONTH, quantidadeDias);
	}

	/**
	 * 
	 * @return numero do dia do mês atual
	 */
	public int getDiaDoMesAtual() {
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 
	 * @return numero do dia da semana atual começado por 0
	 */
	public int getDiaDaSemanaAtual() {
		return this.calendar.get(Calendar.DAY_OF_WEEK) - 1;
	}

	/**
	 * 
	 * @return numero da semana atual começado por 0
	 */
	public int getSemanaAtual() {
		return this.calendar.get(Calendar.WEEK_OF_MONTH) - 1;
	}

	/**
	 * 
	 * @return total de dias no mes
	 */
	public int getDiasDoMes() {
		return calendar.getMaximum(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 
	 * @return total de colunas
	 */
	public int getColunas() {
		return calendar.getMaximum(Calendar.DAY_OF_WEEK);
	}

	/**
	 * @return total de linhas
	 */
	public int getLinhas() {
		return calendar.getMaximum(Calendar.WEEK_OF_MONTH);
	}

	public String[][] getMatrizCalendario() {
		return matrizCalendario;
	}

}
