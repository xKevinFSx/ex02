package formas;

public class Triangulo extends Poligono{
	
	public Triangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return (this.getBase() * this.getAltura()/2);
	}
	
	@Override
	public double perimetro() {
		return ((((this.getBase()/2) * this.getAltura()) * Math.sqrt(2) * 2) + this.getBase());
	}
}
