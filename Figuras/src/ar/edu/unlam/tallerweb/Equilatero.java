package ar.edu.unlam.tallerweb;

public class Equilatero extends Triangulo{
private Double lado;


//defino atributos
	public Equilatero(Double lado){
		this.setLado(lado);
}
//defino metodo de calcular area base por altura dividido dos
	public Double calcularArea(){
		Double altura =(Math.sqrt(lado*3))/2;
		return (lado*altura)/2;
	}
//defino metodo de calcular perimetro la suma de los lados
	public Double calcularPerimetro(){
		return lado*3;
	}

public Double getLado() {
	return lado;
}

public void setLado(Double lado) {
	this.lado = lado;
}

}
