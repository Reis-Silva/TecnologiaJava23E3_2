package br.edu.inftnet.model.domain;

public class Solicitante {

	private String nome;

	private String cpf;

	private String email;
	
	public Solicitante(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Pedido obterPedido(String descricaoMesa) {
		return new Pedido(descricaoMesa);
	}

}
