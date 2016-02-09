package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcularTest {

	@Test
	public void calcularAreaLado4Test() {
		Cuadrado c = new Cuadrado(5.0);
		Double esperado = 25.0;
		
		assertEquals(esperado.doubleValue(),c.calcularArea(),0.01);
	}
	@Test
	public void calcularPerimetroLado4Test() {
		Cuadrado c = new Cuadrado(5.0);
		Double esperado = 20.0;
		
		assertEquals(esperado.doubleValue(),c.calcularPerimetro(),0.01);
	}
	

	
}
