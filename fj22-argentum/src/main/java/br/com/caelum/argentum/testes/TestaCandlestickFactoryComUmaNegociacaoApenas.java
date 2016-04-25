package br.com.caelum.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;


/**
 * Escrevemos uma quantidade razoável de código no capítulo anterior, meia dúzia de classes. Elas funcionam
 * corretamente? Tudo indica que sim, até criamos um pequeno main para vericar isso e fazer as perguntas
 * corretas. Pode parecer que o código funciona, mas ele tem muitas falhas. Olhemos com mais cuidado.
 * @author dellcloud1
 *
 */
public class TestaCandlestickFactoryComUmaNegociacaoApenas {
	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
		List<Negociacao> negociacoes = Arrays.asList(negociacao1);
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		System.out.println(candle.getAbertura());
		System.out.println(candle.getFechamento());
		System.out.println(candle.getMinimo());
		System.out.println(candle.getMaximo());
		System.out.println(candle.getVolume());
	}

}
