package br.com.tadeudeveloper.guerraninja;

public class NinjaAgua extends Ninja {

	public NinjaAgua(String nome) {
		super(nome);		
	}

	@Override
	public String atacar() {

        int probabilidade = 1 + (int)(Math.random() * (100 - 1));

        String estiloAtaque = "";

		if (probabilidade >= 1 && probabilidade <= 5) { //5%
			estiloAtaque = "TERRA";
		} else if (probabilidade >= 6 && probabilidade <= 18) { // 13%
			estiloAtaque = "RAIO";
		} else if (probabilidade >= 19 && probabilidade <= 35) { // 17%
			estiloAtaque = "VENTO";
		} else if (probabilidade >= 36 && probabilidade <= 60) { // 25%
			estiloAtaque = "FOGO";
		} else if (probabilidade >= 61 && probabilidade <= 100) { // 40%
			estiloAtaque = "AGUA";
		}
		return estiloAtaque;
	}
}
