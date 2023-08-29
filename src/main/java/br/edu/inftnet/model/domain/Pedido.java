package br.edu.inftnet.model.domain;

import java.time.LocalDateTime;

public class Pedido {

	private String descricaoao;

	private LocalDateTime data;

	private boolean web;
	
	public Pedido(String descricao) {
		this.descricaoao = descricao;
		this.data = LocalDateTime.now();	
	}

	public String getDescricaoao() {
		return descricaoao;
	}

	public void setDescricaoao(String descricaoao) {
		this.descricaoao = descricaoao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	@Override
	public String toString() {
		return "descricao = " + descricaoao + ", data = " + data + ", web = " + (web ? "Sim" : "Não");
	}
}
