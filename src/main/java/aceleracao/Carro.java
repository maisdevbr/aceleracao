package aceleracao;

public class Carro {
	
	private int velocidadeInicial;
	private int velocidadeAtual;
	private int velocidadeMaxima = 200;
	private boolean motorLigado;

	
	public Carro() {
	
	}


	public int acelerar() {
		if(desligaMotor()&& velocidadeAtual < velocidadeMaxima) {
			this.velocidadeInicial+=5;
		}
		return velocidadeAtual;
		
	}
	public boolean desligaMotor() {
		if(velocidadeAtual >= 5) {
			this.motorLigado = true;
		}
		return false;
	}
	
	public int desacelerar(int valor) {
		if ( velocidadeAtual > valor) {
			velocidadeAtual -= 5;
		}
		return velocidadeAtual;
		
	}

}
