package Classes;

public class Retangulo extends FormaGeometrica {

	protected int comprimento;
	protected int altura;

	public Retangulo() {
		this.altura = 5;
		this.comprimento = 5;
	}

	public Retangulo(int valor) {
		this.altura = valor;
		this.comprimento = valor;
	}

	public Retangulo(int comprimento, int altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}

	public int calcularArea() {
		return this.altura * this.comprimento;

	}

	public int calcularPerimetro() {
		return (this.comprimento * 2) + (this.altura * 2);
	}

	public Boolean ehQuadrado() {
		if (this.comprimento == this.altura) {
			return true;
		}
		return false;
	}

	public boolean equals(Retangulo r) {
		if (this.altura == r.altura && this.comprimento == r.comprimento)
			return true;
		return false;
	}

	int getComprimento() {
		return comprimento;
	}

	void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	int getAltura() {
		return altura;
	}

	void setAltura(int altura) {
		this.altura = altura;
	}

}
