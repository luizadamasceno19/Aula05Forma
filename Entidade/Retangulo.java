package Entidade;

public class Retangulo extends Forma {
	
	public Retangulo(double largura, double base) {
		super(largura, base);
	}
	@Override
	public double calcularArea() {
		return largura* base;
	}
}