package negocio;

public class Divisao extends Calculo{
	
	
	public Divisao() {
		super();
		
	}

	@Override
	public void calcular() {
		resultado = valor1/valor2;
	};


}
