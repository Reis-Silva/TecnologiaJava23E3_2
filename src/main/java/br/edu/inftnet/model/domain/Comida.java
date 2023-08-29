package br.edu.inftnet.model.domain;

public class Comida extends Produto{

	private Float peso;

	private boolean vegano;

	private String ingredientes;
	
	public Comida(Float peso, boolean vegano, String ingredientes, String nome, Float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.peso = peso;
		this.vegano = vegano;
		this.ingredientes = ingredientes;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public boolean isVegano() {
		return vegano;
	}

	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return " Produto: " + "Nome = " + getNome() + ", valor = R$" + getValor() + ", codigo = " + getCodigo() + " -- Especificidade: " + "peso = " + peso + " gramas, vegano = "+ (vegano ? "Sim" : "Não") + ", ingredientes = " + ingredientes;
	}

}
