package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularCirculoTest {

	@Test
	public void testCalculoAreaCirculo() {
		Circulo c=new Circulo(2.0,0.0,0.0);
		Double esperado=12.57;
		assertEquals(esperado.doubleValue(), c.calculeArea().doubleValue(),0.01);
	}
	
	@Test
	public void testCalcularPerimetroCirculo() {
		Circulo c=new Circulo(2.0,0.0,0.0);
		Double esperado=12.566368;
		assertEquals(esperado.doubleValue(), c.calcularPerimetro().doubleValue(),0.01);
	}

}
