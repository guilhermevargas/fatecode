package com.wordpress.fatecode.test.tarefa0203;

import junit.framework.Assert;

import org.junit.Test;

import com.wordpress.fatecode.tarefa0203.Tabuada;

public class TabuadaTest {
	
	
	@Test
	public void geraTabuada() {
		Tabuada tabuada = new Tabuada();
		tabuada.geraTabuada(2);
	}
	
	@Test
	public void mostraMenu() {
		Tabuada tabuada = new Tabuada();
		int result =  tabuada.mostraMenu();
		
		Assert.assertTrue(result >= 0 && result <= 10); 
	}
	
	@Test
	public void calcula() {
		
	}
	
}
