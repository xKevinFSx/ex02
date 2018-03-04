package formas;

public abstract class Poligono extends Figuras {
	
	double base, altura;
	
	public Poligono(double base, double altura) {
	}

	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
}
