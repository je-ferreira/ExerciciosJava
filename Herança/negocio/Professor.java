package negocio;

public class Professor extends Pessoa {

	public Professor(String nome) {
		super(nome);
	}

	@Override
	public String saudar() {
		return String.format("Olá, Prof. %s, seja bem vindo(a)!", super.nome); 
	}


	//polimorfismo horizontal (overload), nome do metodo igual mas com assinatura diferente da classe pai
	public String saudar(String tratamento) {
		return String.format("Olá, Prof. %s %s, seja bem vindo(a)!", tratamento, super.nome); 
	}

	
	
}
