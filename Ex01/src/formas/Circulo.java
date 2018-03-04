package formas;

public class Circulo extends Figuras {
	
	private double raio;
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * this.getRaio()*2;
	}

	@Override
	public double perimetro() {
		return Math.PI * 2 * this.getRaio();
	}
	
	
}
