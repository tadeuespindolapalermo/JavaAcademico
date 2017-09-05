package br.com.tadeudeveloper.guerraninja;

public class NinjaRaio extends Ninja {

	public NinjaRaio(String nome) {
		super(nome);		
	}

	@Override
	public String atacar() {

		int probabilidade = 1 + (int)(Math.random() * (100 - 1));

		String estiloAtaque = "";

		if (probabilidade >= 1 && probabilidade <= 5) { //5%
			estiloAtaque = "VENTO";
		} else if (probabilidade >= 6 && probabilidade <= 18) { // 13%
			estiloAtaque = "FOGO";
		} else if (probabilidade >= 19 && probabilidade <= 35) { // 17%
			estiloAtaque = "AGUA";
		} else if (probabilidade >= 36 && probabilidade <= 60) { // 25%
			estiloAtaque = "TERRA";
		} else if (probabilidade >= 61 && probabilidade <= 100) { // 40%
			estiloAtaque = "RAIO";
		}
		return estiloAtaque;
	}

}
