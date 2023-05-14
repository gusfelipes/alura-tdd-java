package br.com.alura.tdd.exemplo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	/**
	 * Cada metodo deve testar um cenario individualmente
	 * o Junit5 para esse caso vou utilizado adicionando no projeto, nao pelo maven
	 */
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}

}
