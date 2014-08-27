package com.wordpress.fatecode.tarefa0605;

public class Estacionamento {
	String placa;
	String marca;
	Tempo entrada;
	Tempo saida;

	public void setDados(String placa, String marca, Tempo entrada, Tempo saida) {
		this.placa = placa;
		this.marca = marca;
		this.entrada = entrada;
		this.saida = saida;
	}

	@Override
	public String toString() {
		return placa + "; " + this.marca + "; " + entrada.getTempo() + "; "
				+ saida.getTempo() + " valor cobrado :" + getValorCobrado();
	}

	public double getValorCobrado() {
		Tempo tempoUtilizado = entrada.subtrair(saida);

		double valor = tempoUtilizado.getHora() * 1;
		valor += tempoUtilizado.getMinuto() > 0 ? 1 : 0;

		return valor;
	}

}
