package aceleracao;

public class App {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setVelocidadeInicial(10);
		carro.acelerar(15);
		
		System.out.println(carro.getVelocidadeAtual());

	}

}
