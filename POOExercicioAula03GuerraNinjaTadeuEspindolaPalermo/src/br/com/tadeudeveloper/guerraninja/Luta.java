package br.com.tadeudeveloper.guerraninja;

public class Luta {

	private Ninja ninja1;
	private Ninja ninja2;
	private int vitoriaNinja1;
	private int vitoriaNinja2;

	public Luta(Ninja ninja1, Ninja ninja2) {
		this.ninja1 = ninja1;
		this.ninja2 = ninja2;
		setVitoriaNinja1(0);
		setVitoriaNinja2(0);
	}

	public int getVitoriaNinja1() {
		return vitoriaNinja1;
	}

	public void setVitoriaNinja1(int vitoriaNinja1) {
		this.vitoriaNinja1 = vitoriaNinja1;
	}

	public int getVitoriaNinja2() {
		return vitoriaNinja2;
	}

	public void setVitoriaNinja2(int vitoriaNinja2) {
		this.vitoriaNinja2 = vitoriaNinja2;
	}

	public void iniciarLuta() {

		System.out.println("Ninja 1: " + ninja1.getNome());
		System.out.println("Ninja 2: " + ninja2.getNome() + "\n");

		// ********************************************************************************************************

		/*
		 * OBS: l = luta; n = ninja; r = round
		 * */

		// NinjaTerra(1) e NinjaAgua(2) -> PRIMEIRA LUTA
		String l1n1r1 = ninja1.atacar(); // NinjaTerra
		String l1n2r1 = ninja2.atacar(); // NinjaAgua

		if (ninja1.getNome().equals("NinjaTerra") && ninja2.getNome().equals("NinjaAgua")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l1n1r1);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l1n2r1 + "\n");
			if (l1n1r1.equals(l1n2r1) || l1n2r1.equals(l1n1r1)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l1n2r1.equals("AGUA") || l1n2r1.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l1n2r1.equals("VENTO") || l1n2r1.equals("RAIO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} 

			System.out.println("SEGUNDO ROUND!\n");

			String l1n1r2 = ninja1.atacar();
			String l1n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l1n1r2);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l1n2r2 + "\n");
			if (l1n1r2.equals(l1n2r2) || l1n2r2.equals(l1n1r2)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l1n2r2.equals("AGUA") || l1n2r2.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l1n2r2.equals("VENTO") || l1n2r2.equals("RAIO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l1n1r3 = ninja1.atacar();
			String l1n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l1n1r3);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l1n2r3 + "\n");
			if (l1n1r3.equals(l1n2r3) || l1n2r3.equals(l1n1r3)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l1n2r3.equals("AGUA") || l1n2r3.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l1n2r3.equals("VENTO") || l1n2r3.equals("RAIO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ": " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ":  " + ninja2.getPontos());
			System.out.println("==================================================================================");
		}
		
		// ********************************************************************************************************
		// NinjaTerra(1) e NinjaFogo(2) -> SEGUNDA LUTA
		String l2n1r1 = ninja1.atacar(); // NinjaTerra
		String l2n2r1 = ninja2.atacar(); // NinjaFogo

		if (ninja1.getNome().equals("NinjaTerra") && ninja2.getNome().equals("NinjaFogo")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l2n1r1);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l2n2r1 + "\n");
			if (l2n1r1.equals(l2n2r1) || l2n2r1.equals(l2n1r1)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l2n2r1.equals("AGUA") || l2n2r1.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l2n2r1.equals("VENTO") || l2n2r1.equals("RAIO")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("SEGUNDO ROUND!\n");

			String l2n1r2 = ninja1.atacar();
			String l2n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l2n1r2);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l2n2r2 + "\n");
			if (l2n1r2.equals(l2n2r2) || l2n2r2.equals(l2n1r2)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l2n2r2.equals("AGUA") || l2n2r2.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l2n2r2.equals("VENTO") || l2n2r2.equals("RAIO")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l2n1r3 = ninja1.atacar();
			String l2n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l2n1r3);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l2n2r3 + "\n");
			if (l2n1r3.equals(l2n2r3) || l2n2r3.equals(l2n1r3)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l2n2r3.equals("AGUA") || l2n2r3.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l2n2r3.equals("VENTO") || l2n2r3.equals("RAIO")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ": " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ":  " + ninja2.getPontos());
			System.out.println("==================================================================================");
		}		

		// ********************************************************************************************************
		// NinjaTerra(1) e NinjaVento(2) -> TERCEIRA LUTA
		String l3n1r1 = ninja1.atacar(); // NinjaTerra
		String l3n2r1 = ninja2.atacar(); // NinjaVento

		if (ninja1.getNome().equals("NinjaTerra") && ninja2.getNome().equals("NinjaVento")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l3n1r1);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l3n2r1 + "\n");
			if (l3n1r1.equals(l3n2r1) || l3n2r1.equals(l3n1r1)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome()+ "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l3n2r1.equals("AGUA") || l3n2r1.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l3n2r1.equals("VENTO") || l3n2r1.equals("RAIO")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("SEGUNDO ROUND!\n");

			String l3n1r2 = ninja1.atacar();
			String l3n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l3n1r2);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l3n2r2 + "\n");
			if (l3n1r2.equals(l3n2r2) || l3n2r2.equals(l3n1r2)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l3n2r2.equals("AGUA") || l3n2r2.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l3n2r2.equals("VENTO") || l3n2r2.equals("RAIO")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l3n1r3 = ninja1.atacar();
			String l3n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l3n1r3);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l3n2r3 + "\n");
			if (l3n1r3.equals(l3n2r3) || l3n2r3.equals(l3n1r3)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l3n2r3.equals("AGUA") || l3n2r3.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l3n2r3.equals("VENTO") || l3n2r3.equals("RAIO")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ": " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ": " + ninja2.getPontos());
			System.out.println("==================================================================================");
		}		

		// ********************************************************************************************************
		// NinjaTerra(1) e NinjaRaio(2) -> QUARTA LUTA
		String l4n1r1 = ninja1.atacar(); // NinjaTerra
		String l4n2r1 = ninja2.atacar(); // NinjaRaio

		if (ninja1.getNome().equals("NinjaTerra") && ninja2.getNome().equals("NinjaRaio")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l4n1r1);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l4n2r1 + "\n");
			if (l4n1r1.equals(l4n2r1) || l4n2r1.equals(l4n1r1)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l4n2r1.equals("AGUA") || l4n2r1.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l4n2r1.equals("VENTO") || l4n2r1.equals("RAIO")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("SEGUNDO ROUND!\n");

			String l4n1r2 = ninja1.atacar();
			String l4n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l4n1r2);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l4n2r2 + "\n");
			if (l4n1r2.equals(l4n2r2) || l4n2r2.equals(l4n1r2)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l4n2r2.equals("AGUA") || l4n2r2.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l4n2r2.equals("VENTO") || l4n2r2.equals("RAIO")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l4n1r3 = ninja1.atacar();
			String l4n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l4n1r3);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l4n2r3 + "\n");
			if (l4n1r3.equals(l4n2r3) || l4n2r3.equals(l4n1r3)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l4n2r3.equals("AGUA") || l4n2r3.equals("FOGO")) { // TERRA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l4n2r3.equals("VENTO") || l4n2r3.equals("RAIO")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ": " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ":  " + ninja2.getPontos());
			System.out.println("==================================================================================");
		}		

		// ********************************************************************************************************
		// NinjaAgua(1) e NinjaFogo(2) -> QUINTA LUTA
		String l5n1r1 = ninja1.atacar(); // NinjaAgua
		String l5n2r1 = ninja2.atacar(); // NinjaFogo

		if (ninja1.getNome().equals("NinjaAgua") && ninja2.getNome().equals("NinjaFogo")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l5n1r1);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l5n2r1 + "\n");
			if (l5n1r1.equals(l5n2r1) || l5n2r1.equals(l5n1r1)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l5n2r1.equals("FOGO") || l5n2r1.equals("VENTO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l5n2r1 != "RAIO" || l5n2r1 != ("TERRA")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("SEGUNDO ROUND!\n");

			String l5n1r2 = ninja1.atacar();
			String l5n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l5n1r2);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l5n2r2 + "\n");
			if (l5n1r2.equals(l5n2r2) || l5n2r2.equals(l5n1r2)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l5n2r2.equals("FOGO") || l5n2r2.equals("VENTO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l5n2r2 != "RAIO" || l5n2r2 != ("TERRA")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l5n1r3 = ninja1.atacar();
			String l5n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l5n1r3);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l5n2r3 + "\n");
			if (l5n1r3.equals(l5n2r3) || l5n2r3.equals(l5n1r3)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l5n2r3.equals("FOGO") || l5n2r3.equals("VENTO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l5n2r3 != "RAIO" || l5n2r3 != ("TERRA")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ": " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ": " + ninja2.getPontos());
			System.out.println("==================================================================================");
		}		

		// ********************************************************************************************************
		// NinjaAgua(1) e NinjaVento(2) -> SEXTA LUTA
		String l6n1r1 = ninja1.atacar(); // NinjaAgua
		String l6n2r1 = ninja2.atacar(); // NinjaVento

		if (ninja1.getNome().equals("NinjaAgua") && ninja2.getNome().equals("NinjaVento")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + "  - Estilo de Golpe: " + l6n1r1);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l6n2r1 + "\n");
			if (l6n1r1.equals(l6n2r1) || l6n2r1.equals(l6n1r1)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l6n2r1.equals("FOGO") || l6n2r1.equals("VENTO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l6n2r1 != "RAIO" || l6n2r1 != ("TERRA")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("SEGUNDO ROUND!\n");

			String l6n1r2 = ninja1.atacar();
			String l6n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + "  - Estilo de Golpe: " + l6n1r2);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l6n2r2 + "\n");
			if (l6n1r2.equals(l6n2r2) || l6n2r2.equals(l6n1r2)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l6n2r2.equals("FOGO") || l6n2r2.equals("VENTO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l6n2r2 != "RAIO" || l6n2r2 != ("TERRA")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l6n1r3 = ninja1.atacar();
			String l6n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + "  - Estilo de Golpe: " + l6n1r3);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l6n2r3 + "\n");
			if (l6n1r3.equals(l6n2r3) || l6n2r3.equals(l6n1r3)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l6n2r3.equals("FOGO") || l6n2r3.equals("VENTO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l6n2r3 != "RAIO" || l6n2r3 != ("TERRA")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ":  " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ": " + ninja2.getPontos());
			System.out.println("==================================================================================");
		}		

		// ********************************************************************************************************
		// NinjaAgua(1) e NinjaRaio(2) -> SÉTIMA LUTA
		String l7n1r1 = ninja1.atacar(); //NinjaAgua
		String l7n2r1 = ninja2.atacar(); //NinjaRaio

		if (ninja1.getNome().equals("NinjaAgua") && ninja2.getNome().equals("NinjaRaio")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l7n1r1);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l7n2r1 + "\n");
			if (l7n1r1.equals(l7n2r1) || l7n2r1.equals(l7n1r1)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l7n2r1.equals("FOGO") || l7n2r1.equals("VENTO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l7n2r1 != "RAIO" || l7n2r1 != ("TERRA")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("SEGUNDO ROUND!\n");

			String l7n1r2 = ninja1.atacar();
			String l7n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l7n1r2);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l7n2r2 + "\n");
			if (l7n1r2.equals(l7n2r2) || l7n2r2.equals(l7n1r2)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l7n2r2.equals("FOGO") || l7n2r2.equals("VENTO")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l7n2r2 != "RAIO" || l7n2r2 != ("TERRA")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l7n1r3 = ninja1.atacar();
			String l7n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l7n1r3);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l7n2r3 + "\n");
			if (l7n1r3.equals(l7n2r3) || l7n2r3.equals(l7n1r3)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l7n2r3 != "RAIO" || l7n2r3 != ("TERRA")) { // AGUA GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l7n2r3.equals("FOGO") || l7n2r3.equals("VENTO")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ": " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ": " + ninja2.getPontos());
			System.out.println("==================================================================================");
		}		

		// ********************************************************************************************************
		// NinjaFogo(1) e NinjaVento(2) -> OITAVA LUTA
		String l8n1r1 = ninja1.atacar(); // NinjaFogo
		String l8n2r1 = ninja2.atacar(); // NinjaVento

		if (ninja1.getNome().equals("NinjaFogo") && ninja2.getNome().equals("NinjaVento")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + "  - Estilo de Golpe: " + l8n1r1);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l8n2r1 + "\n");
			if (l8n1r1.equals(l8n2r1) || l8n2r1.equals(l8n1r1)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n" );
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l8n2r1.equals("VENTO") || l8n2r1.equals("RAIO")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l8n2r1.equals("TERRA") || l8n2r1.equals("AGUA")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("SEGUNDO ROUND!\n");

			String l8n1r2 = ninja1.atacar();
			String l8n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + "  - Estilo de Golpe: " + l8n1r2);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l8n2r2 + "\n");
			if (l8n1r2.equals(l8n2r2) || l8n2r2.equals(l8n1r2)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l8n2r2.equals("VENTO") || l8n2r2.equals("RAIO")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l8n2r2.equals("TERRA") || l8n2r2.equals("AGUA")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l8n1r3 = ninja1.atacar();
			String l8n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + "  - Estilo de Golpe: " + l8n1r3);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l8n2r3 + "\n");
			if (l8n1r3.equals(l8n2r3) || l8n2r3.equals(l8n1r3)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l8n2r3.equals("VENTO") || l8n2r3.equals("RAIO")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l8n2r3.equals("TERRA") || l8n2r3.equals("AGUA")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ":  " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ": " + ninja2.getPontos());
			System.out.println("==================================================================================");
		}		

		// ********************************************************************************************************
		// NinjaFogo(1) e NinjaRaio(2) -> NONA LUTA
		String l9n1r1 = ninja1.atacar(); // NinjaFogo
		String l9n2r1 = ninja2.atacar(); // NinjaRaio

		if (ninja1.getNome().equals("NinjaFogo") && ninja2.getNome().equals("NinjaRaio")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l9n1r1);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l9n2r1 + "\n");
			if (l9n1r1.equals(l9n2r1) || l9n2r1.equals(l9n1r1)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l9n2r1.equals("VENTO") || l9n2r1.equals("RAIO")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l9n2r1.equals("TERRA") || l9n2r1.equals("AGUA")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("SEGUNDO ROUND!\n");

			String l9n1r2 = ninja1.atacar();
			String l9n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l9n1r2);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l9n2r2 + "\n");
			if (l9n1r2.equals(l9n2r2) || l9n2r2.equals(l9n1r2)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome()+ "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l9n2r2.equals("VENTO") || l9n2r2.equals("RAIO")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l9n2r2.equals("TERRA") || l9n2r2.equals("AGUA")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l9n1r3 = ninja1.atacar();
			String l9n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l9n1r3);
			System.out.println(ninja2.getNome() + " - Estilo de Golpe: " + l9n2r3 + "\n");
			if (l9n1r3.equals(l9n2r3) || l9n2r3.equals(l9n1r3)) { // EMPATE
				System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			} else if (l9n2r3.equals("VENTO") || l9n2r3.equals("RAIO")) { // FOGO GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l9n2r3.equals("TERRA") || l9n2r3.equals("AGUA")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ": " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ": " + ninja2.getPontos());
			System.out.println("==================================================================================");
		}		

		// ********************************************************************************************************
		// NinjaVento(1) e NinjaRaio(2) -> DÉCIMA LUTA
		String l10n1r1 = ninja1.atacar(); // NinjaVento
		String l10n2r1 = ninja2.atacar(); // NinjaRaio

		if (ninja1.getNome().equals("NinjaVento") && ninja2.getNome().equals("NinjaRaio")) {
			System.out.println("PRIMEIRO ROUND!\n");
			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l10n1r1);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l10n2r1 + "\n");
            if (l10n1r1.equals(l10n2r1) || l10n2r1.equals(l10n1r1)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l10n2r1.equals("RAIO") || l10n2r1.equals("TERRA")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l10n2r1.equals("AGUA") || l10n2r1.equals("FOGO")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("SEGUNDO ROUND!\n");

			String l10n1r2 = ninja1.atacar();
			String l10n2r2 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l10n1r2);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l10n2r2 + "\n");
            if (l10n1r2.equals(l7n2r1) || l10n2r2.equals(l10n1r2)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l10n2r2.equals("RAIO") || l10n2r2.equals("TERRA")) { // VENTO GANHA
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l10n2r2.equals("AGUA") || l10n2r2.equals("FOGO")) { // RAIO GANHA
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			System.out.println("TERCEIRO ROUND!\n");

			String l10n1r3 = ninja1.atacar();
			String l10n2r3 = ninja2.atacar();

			System.out.println(ninja1.getNome() + " - Estilo de Golpe: " + l10n1r3);
			System.out.println(ninja2.getNome() + "  - Estilo de Golpe: " + l10n2r3 + "\n");

            if (l10n1r3.equals(l10n2r3) || l10n2r3.equals(l10n1r3)) { // EMPATE
                System.out.println("Empate entre os Ninjas: " + ninja1.getNome() + " e " + ninja2.getNome() + "\n");
                setVitoriaNinja1(getVitoriaNinja1() + 1);
                setVitoriaNinja2(getVitoriaNinja2() + 1);
            } else if (l10n2r3.equals("RAIO") || l10n2r3.equals("TERRA")) { // VENTO
				System.out.println("Vitória do " + ninja1.getNome() + " !!!\n");
				setVitoriaNinja1(getVitoriaNinja1() + 1);
			} else if (l10n2r3.equals("AGUA") || l10n2r3.equals("FOGO")) { // RAIO
				System.out.println("Vitória do " + ninja2.getNome() + " !!!\n");
				setVitoriaNinja2(getVitoriaNinja2() + 1);
			}

			if (getVitoriaNinja1() > getVitoriaNinja2()) {
				ninja1.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja1.getNome() + "\n");
			} else if (getVitoriaNinja1() < getVitoriaNinja2()) {
				ninja2.addPontosVitoria();
				System.out.println("RESULTADO DA LUTA: o vencedor desta luta foi o: " + ninja2.getNome() + "\n");
			} else if (getVitoriaNinja1() == getVitoriaNinja2()) {
				ninja1.addPontosEmpate();
				ninja2.addPontosEmpate();
				System.out.println("RESULTADO DA LUTA: EMPATE entre o " + ninja1.getNome() + " e o " + ninja2.getNome() + "\n");
			}

			System.out.println("Pontuação do " + ninja1.getNome() + ": " + ninja1.getPontos());
			System.out.println("Pontuação do " + ninja2.getNome() + ":  " + ninja2.getPontos());
			System.out.println();
			System.out.println("===================================================");
		}
		// ********************************************************************************************************
	}
}