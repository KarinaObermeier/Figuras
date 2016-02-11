package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class calcularTrianguloTest {
	

		@Test
		public void calcularAreatest(){
		
			Equilatero E = new Equilatero(3.0);
			Double esperado = 2.25;
			
			assertEquals(esperado.doubleValue(),E.calcularArea(),0.01);
		}
		
		@Test
		public void calcularPerimetrotest() {
			Equilatero E = new Equilatero(3.0);
			Double esperado = 9.0;
					
			assertEquals(esperado.doubleValue(),E.calcularPerimetro(),0.01);
			
		}
	}


