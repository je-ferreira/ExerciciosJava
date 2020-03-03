package negocio;

	abstract class Pessoa {

	private String email;
	protected String nome;

	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	//nome nao tera set, somente via construtor

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	public String saudar() {
		return String.format("Olá, %s, seja bem vindo(a)!", nome); 
	}
	
}
