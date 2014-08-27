package com.wordpress.fatecode.test.tarefa0201;

import junit.framework.Assert;

import org.junit.Test;

import com.wordpress.fatecode.tarefa0201.OperacoesAritmeticas;

public class OperacoesTest {

	@Test
	public void test() {
	}
	
	@Test
	public void operacoes() {
		Assert.assertEquals(4.0, OperacoesAritmeticas.soma(2, 2));
		Assert.assertEquals(0.0, OperacoesAritmeticas.subtracao(2, 2));
		Assert.assertEquals(4.0, OperacoesAritmeticas.multiplicacao(2, 2));
		Assert.assertEquals(1.0,  OperacoesAritmeticas.divisao(2, 0));
	
	}

}
