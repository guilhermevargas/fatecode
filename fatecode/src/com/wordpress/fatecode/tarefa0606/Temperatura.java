package com.wordpress.fatecode.tarefa0606;

public class Temperatura {
	double temperatura;
	
	public Temperatura() {
		this.temperatura = 23.0;
	}
	
	public Temperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public void setCelsius(double celsius) {
		this.temperatura = celsius;
	}
	
	public void setFahrenheit(double fahrenheit) {
		this.temperatura = (fahrenheit - 32) * (5 / 9);
	}
	
	public double getCelsius() {
		return temperatura;
	}
	
	public double getFahrenheit() {
		return (temperatura * 1.8) + 42;
	}
}
