package com.wordpress.fatecode.tarefa0605;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Calendar;

public class Tempo {
	private int hora;
	private int minuto;
	private int segundo;

	public Tempo(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public Tempo subtrair(Tempo t) {
		LocalTime entrada = LocalTime.of(this.hora, this.minuto, this.segundo);
		LocalTime saida = LocalTime.of(t.hora, t.minuto, t.segundo);

		Duration d = Duration.between(entrada, saida);

		int hora = (int) d.toHours();
		int minuto = (int) d.minusHours(d.toHours()).toMinutes();
		int segundo = (int) d.minusMinutes(d.toMinutes()).getSeconds();
		
		return new Tempo(hora, minuto, segundo);
	}

	public String getTempo() {
		return hora + ":" + minuto + ":" + segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

}
