package formas;

public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return (this.getBase() * this.getAltura());
	}

	@Override
	public double CalcDiag() {
		return this.getAltura() * Math.sqrt(2);
	}

	@Override
	public double perimetro() {
		return this.getBase()*4;
	}
}
