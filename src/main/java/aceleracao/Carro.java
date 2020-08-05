package aceleracao;

public class Carro {
	
	private int velocidadeInicial = 0;
	private int velocidadeAtual;
	private int velocidadeMaxima = 200;
	private boolean motorLigado;

	
	public Carro() {
	
	}


	public int acelerar(int valor) {
		if(valor < velocidadeMaxima && valor > velocidadeAtual) {
			this.velocidadeAtual += valor;
		}
		return velocidadeAtual += velocidadeInicial;
		
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
		return velocidadeInicial - velocidadeAtual;
		
	}


	public int getVelocidadeInicial() {
		return velocidadeInicial;
	}


	public int getVelocidadeAtual() {
		return this.velocidadeAtual;
	}


	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}


	public boolean isMotorLigado() {
		return motorLigado;
	}


	public void setVelocidadeInicial(int velocidadeInicial) {
		this.velocidadeInicial = velocidadeInicial;
	}
	
	public int setVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}


	@Override
	public String toString() {
		return "Carro [velocidadeInicial=" + velocidadeInicial + ", velocidadeAtual=" + velocidadeAtual
				+ ", velocidadeMaxima=" + velocidadeMaxima + ", motorLigado=" + motorLigado + "]";
	}
	
	
	
}
