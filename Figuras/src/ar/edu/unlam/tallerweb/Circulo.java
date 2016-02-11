package ar.edu.unlam.tallerweb;

public class Circulo {
	
	private Double radio;
	private Double area;
	private Double perimetro;
	
	
	
	public Circulo(Double radio, Double perimetro, Double area){
		 		this.setRadio(radio);
		 		this.setArea(area);
		 		this.setPerimetro(perimetro);
		 }
	

	public Double calculeArea(){
		
		//area=(Float)(Math.PI*radio*radio);
		return (Double) (Math.PI*radio*radio);
	}

	 
	public Double calcularPermitro(){
		
		return (Double) (Math.PI*(2*radio));
	}
	
	
	public void setRadio(Double radio) {
		this.radio = radio;
	}


	public Double getArea() {
		return area;
	}


	public void setArea(Double area) {
		this.area = area;
	}


	public Double getPerimetro() {
		return perimetro;
	}


	public void setPerimetro(Double perimetro) {
		this.perimetro = perimetro;
	}


}