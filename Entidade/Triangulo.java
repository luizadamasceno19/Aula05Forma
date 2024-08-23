package Entidade;

public class Triangulo extends Forma {

	public Triangulo(int altura, double largura) {
		super(altura, largura);
	}

	public double calcularArea() {
		return altura *  largura;
	}
	
}