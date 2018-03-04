package formas;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {

		ArrayList<Figuras> figura = new ArrayList<>();
		figura.add(new Circulo());
		figura.add(new Quadrado(10, 50));
		figura.add(new Retangulo(30, 24));
		figura.add(new Triangulo(35, 50));
		figura.add(new Losango(57, 60));
		
		for (Figuras fig: figura) {
			System.out.println("A Area do quadrado é " + fig.area());
			System.out.println("O Perimetro do quadrado é " + fig.perimetro());
			System.out.println("A Diagonal do quadrado é ");

		} 
		
	}
}
