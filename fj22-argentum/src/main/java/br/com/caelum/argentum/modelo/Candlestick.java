package br.com.caelum.argentum.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Candlestick {
	
	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	
	public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}

	public Calendar getData() {
		return data;
	}
	
	
	//(opcional) Vamos adicionar dois métodos de negócio, para que o Candlestick possa nos dizer se ele é do
	//tipo de alta, ou se é de baixa:
	public boolean isAlta(){
		return this.abertura < this.fechamento;
	}
	
	public boolean isBaixa(){
		return this.abertura > this.fechamento;
	}

	//Reescreva o toString da classe Candlestick. Como o toString da classe Calendar retorna uma
	//String bastante complexa, faça com que a data seja corretamente visualizada, usando para isso o
	//SimpleDateFormat. Procure sobre essa classe na API do Java.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(data.getTime());
		return "[Abertura "+abertura+", Fechamento "+fechamento+", Mínima "+minimo+", Máxima "+maximo+", Volume "+volume+", Data "+dataFormatada+"]";
	}
	
}
