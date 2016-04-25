package br.com.caelum.argentum.modelo;


import java.util.Calendar;
import java.util.List;

public class CandlestickFactory {
	
	public Candlestick constroiCandleParaData(Calendar data, List<Negociacao> negociacoes){
		
		//1.ª Versão com valores de maximo e mínimo...
		//double maximo = negociacoes.get(0).getPreco();
		//double minimo = negociacoes.get(0).getPreco();
		
		//2.ª Versão acertados os valores...
		double maximo = 0;
		//Felizmente, a classe Double conta com a constante que representa o maior double válido! É o Double.MAX_VALUE.
		double minimo = Double.MAX_VALUE;
		
		double volume = 0;
		
		for (Negociacao negociacao : negociacoes) {
			volume += negociacao.getVolume();
			
			if(negociacao.getPreco() > maximo){
				maximo = negociacao.getPreco();
			} else if (negociacao.getPreco() < minimo){
				minimo = negociacao.getPreco();
			}
			
		}
		
		//double fechamento = negociacoes.get(negociacoes.size()1).getPreco(); no código da
		//apostila da Caelum não aparece o decremento do tamanho do array "-1"...
		//Além disso, devemos vericar se negociacoes está vazia na hora de calcular o preço de abertura e fechamento. Altere novamente o método:
		double abertura = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double fechamento = negociacoes.isEmpty() ?0: negociacoes.get(negociacoes.size()-1).getPreco();
		
		
		
		return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
		
		
	}

}
