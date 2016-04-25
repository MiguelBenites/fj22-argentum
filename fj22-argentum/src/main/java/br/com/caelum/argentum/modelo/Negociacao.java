package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Negociacao {
	
	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	public Negociacao(double preco, int quantidade, Calendar data) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Calendar getData() {
		return data;
	}
	
	public double getVolume(){
		return preco * quantidade;
		//Repare que um método que parece ser um simples getter pode (e deve muitas vezes) encapsular regras de
		//negócio e não necessariamente reetem um atributo da classe.
	}
}
