package Entidade;

public class Forma {
    protected double largura;
    protected int altura;
    protected double base;
    

    public Forma(int altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public Forma(double largura, double base) {
		this.largura = largura;
		this.base = base;
	}

	public double calcularArea() {
		return 0;
	}

    public void mostrarInfo(String tipo) {
        System.out.println("Tipo: " + tipo);
        System.out.println("Área: " + calcularArea());
    }
}
