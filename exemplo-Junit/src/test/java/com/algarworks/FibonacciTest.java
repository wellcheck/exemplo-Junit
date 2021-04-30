package com.algarworks;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	private Fibonacci fibonacci;

	@Before
	public void init() {
		fibonacci = new Fibonacci();
	}

	@Test
	public void deve_retornar_fibonacci_posicao_1() {
		long posicao = 1L;

		// 1. Cenario

		// 2. Acão
		long valor = fibonacci.calcular(posicao);

		// 3. Validação
		assertEquals(1L, valor);
	}

	@Test
	public void deve_retornar_fibonacci_posicao_2() {
		long posicao = 2L;

		// 1. Cenario

		// 2. Acão
		long valor = fibonacci.calcular(posicao);

		// 3. Validação
		assertEquals(1L, valor);
	}

	@Test
	public void deve_retornar_fibonacci_posicao_0() {
		long posicao = 0L;

		// 1. Cenario

		// 2. Acão
		long valor = fibonacci.calcular(posicao);

		// 3. Validação
		assertEquals(0L, valor);
	}
}
