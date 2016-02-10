package ar.edu.unlam.tallerweb;

public class Equilatero extends Triangulo{
private Double lado;
private Double altura;

//defino atributos
	public Equilatero(Double lado, Double altura){
		this.setLado(lado);
		this.setAltura(altura);
}
//defino metodo de calcular area base por altura dividido dos
	public Double calcularArea(){
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

public Double getAltura() {
	return altura;
}

public void setAltura(Double altura) {
	this.altura = altura;
}


}
