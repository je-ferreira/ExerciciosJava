package negocio;

public class Multiplicacao extends Calculo {
	
	
	public Multiplicacao() {
		super();
		
	}

	@Override
	public void calcular() {
		resultado = valor1*valor2;
	};

}
