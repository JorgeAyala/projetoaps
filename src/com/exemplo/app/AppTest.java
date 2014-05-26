package com.exemplo.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	App app = new App("Jorge", 23, 'M');

	@Test
	public void testObject() {

		int idade1 = 10;
		int idade2 = 20;
		int valorEsperado = 30;

		int valorFeito = app.executaCalculoIdade(idade1, idade2);
		assertEquals(valorEsperado, valorFeito, 0);

	}
	
	@Test
	public void testFat() {

		int fat = 5;
		int resultadoEsperado = 6;

		int resultadoCalculado = app.calculaFatorial(fat);
		assertEquals(resultadoEsperado, resultadoCalculado, 0);
	}

}
