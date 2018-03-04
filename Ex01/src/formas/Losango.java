package formas;

public class Losango extends Poligono {
	
	public Losango(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return (this.getBase() * this.getAltura());
	}

	@Override
	public double perimetro() {
		return this.getBase()*4;
	}
}
