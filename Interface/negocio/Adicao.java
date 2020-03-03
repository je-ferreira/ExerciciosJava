package negocio;

public class Adicao extends Calculo {
	
	
	
	public Adicao() {
		super();
	}
	
	@Override
	public void calcular() {
		resultado = valor1+valor2;
	};

}
