package com.wordpress.fatecode.tarefa0202;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemplosSimpleDateFormat {
	public static void main(String[] args) {
		//instancia do objeto SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("MM/yyyy");
	
		// bloco try usado para empacotar o código que pode gerar uma exceção.
		// Neste caso, se não for possível transformar a String em Calendar,
		// será lançada a exceção ParseException,
		// onde a mesma será capturada no bloco catch
		try {
			//metodo parse() retorna uma data caso seja possível convertar a string em data
			Date data = format.parse("09/1992");
			//Obtem o objeto Calendar para manipular a data
			Calendar calendar = Calendar.getInstance(); // Class responsável por
			calendar.setTime(data);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
