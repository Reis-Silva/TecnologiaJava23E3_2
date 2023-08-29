package br.edu.inftnet.model.domain;

import java.util.Date;

public abstract class Produto {

	private String nome;

	private Float valor;

	private Integer codigo;
	
	public Produto() {
	}

	public Produto(String nome, Float valor, Integer codigo) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public Produto(Produto produto) {
		this.nome = produto.getNome();
		this.valor = produto.getValor();
		this.codigo = produto.getCodigo();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public static String buscarSaudacaoAtual() {
		
		String[] saudacao = new String[] {"Bom Dia", "Boa Tarde", "Boa Noite"};
		
		Date dataAtual = new Date();
		
		if(dataAtual.getHours() >= 0 && dataAtual.getHours() < 12) {
			return saudacao[0].toString();
		} else if (dataAtual.getHours() >= 12 && dataAtual.getHours() < 18) {
			return saudacao[1].toString();
		} else {
			return saudacao[2].toString();
		}
	}
}
