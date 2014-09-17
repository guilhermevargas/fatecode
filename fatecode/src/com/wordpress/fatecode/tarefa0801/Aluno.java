package com.wordpress.fatecode.tarefa0801;


public class Aluno {
	private String matricula;
	private String nome;
	private double p1;
	private double p2;
	private double np;
	private int falta_b1;
	private int falta_b2;
	
	public Aluno(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double getNp() {
		return np;
	}

	public void setNp(double np) {
		this.np = np;
	}

	public int getFalta_b1() {
		return falta_b1;
	}

	public void setFalta_b1(int falta_b1) {
		this.falta_b1 = falta_b1;
	}

	public int getFalta_b2() {
		return falta_b2;
	}

	public void setFalta_b2(int falta_b2) {
		this.falta_b2 = falta_b2;
	}
	
	public double media() {
		return (p1 + p2 + np) / 3;
	}
	
	public double getPercentualFaltas() {
		return ((falta_b1 + falta_b2) * 88) / 100;
	}
	
}
