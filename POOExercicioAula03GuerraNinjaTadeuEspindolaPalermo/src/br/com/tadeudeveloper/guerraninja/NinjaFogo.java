package br.com.tadeudeveloper.guerraninja;

public class NinjaFogo extends Ninja {

	public NinjaFogo(String nome) {
		super(nome);		
	}

	@Override
	public String atacar() {

		int probabilidade = 1 + (int)(Math.random() * (100 - 1));

		String estiloAtaque = "";

		if (probabilidade >= 1 && probabilidade <= 5) { //5%
			estiloAtaque = "AGUA";
		} else if (probabilidade >= 6 && probabilidade <= 18) { // 13%
			estiloAtaque = "TERRA";
		} else if (probabilidade >= 19 && probabilidade <= 35) { // 17%
			estiloAtaque = "RAIO";
		} else if (probabilidade >= 36 && probabilidade <= 60) { // 25%
			estiloAtaque = "VENTO";
		} else if (probabilidade >= 61 && probabilidade <= 100) { // 40%
			estiloAtaque = "FOGO";
		}
		return estiloAtaque;
	}

}
