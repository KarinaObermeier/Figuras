package ar.edu.unlam.tallerweb;

public class Cuadrado{
	 	
	private Double lado;
		
	public Cuadrado(Double lado){
 		this.lado = lado;
	}            
   
	public double calcularArea()	{
			return this.lado*this.lado;
		
		}
   
	public double calcularPerimetro()	{
		return this.lado*4;
	
	}

	
}