package br.edu.inftnet.model.domain;

public class Bebida extends Produto {

	private boolean gelada;

	private Float tamanho;

	private String marca;

	public Bebida(boolean gelada, Float tamanho, String marca, String nome, Float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.gelada = gelada;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	public boolean isGelada() {
		return gelada;
	}

	public void setGelada(boolean gelada) {
		this.gelada = gelada;
	}

	public Float getTamanho() {
		return tamanho;
	}

	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return " Produto: " + "Nome = " + getNome() + ", valor = R$" + getValor() + ", codigo = " + getCodigo() + " -- Especificidade: " + "gelada = " + (gelada ? "Sim" : "Não") + ", tamanho = " + tamanho + " ml, marca = " + marca;
	}

}
