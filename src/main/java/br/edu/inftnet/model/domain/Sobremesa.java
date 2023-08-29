package br.edu.inftnet.model.domain;

public class Sobremesa extends Produto{

	private Float quantidade;

	private boolean doce;

	private String informacoes;
	
	public Sobremesa(Float quantidade, boolean doce, String informacoes, String nome, Float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.quantidade = quantidade;
		this.doce = doce;
		this.informacoes = informacoes;
	}

	public Float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isDoce() {
		return doce;
	}

	public void setDoce(boolean doce) {
		this.doce = doce;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	@Override
	public String toString() {
		return " Produto: " + "Nome = " + getNome() + ", valor = R$" + getValor() + ", codigo = " + getCodigo() + " -- Especificidade: " + "quantidade = " + quantidade + " gramas, doce = "+ (doce ? "Sim" : "Não") + ", informacoes = " + informacoes;
	}

}
