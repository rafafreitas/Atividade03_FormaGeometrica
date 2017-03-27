package Classes;

public class Quadrado extends Retangulo{

	public Quadrado(){
		this.comprimento = 5;
		this.altura = 5;
	}
	
	public Quadrado(int valor){
		this.comprimento = valor;
		this.altura = valor;
	}
	
	public void aumentarQuadrado(int valor){
		this.comprimento = this.comprimento + valor;
		this.altura = this.altura + valor;
	}
}
