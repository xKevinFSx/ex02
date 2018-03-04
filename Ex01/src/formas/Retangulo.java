package formas;

public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return (this.getBase() * this.getAltura());
	}

	@Override
	public double CalcDiag() {
		return Math.sqrt(((Math.pow(this.getBase(), 2)) + ((Math.pow(this.getAltura(), 2)))));
	}

	@Override
	public double perimetro() {
		return (this.getBase()*2) + (this.getAltura()*2);
	}
}
