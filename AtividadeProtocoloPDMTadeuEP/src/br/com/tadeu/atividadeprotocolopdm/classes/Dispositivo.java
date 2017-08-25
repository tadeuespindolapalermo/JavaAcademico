package br.com.tadeu.atividadeprotocolopdm.classes;

public class Dispositivo {
	
	/*Criar uma função, na classe Dispositivo, que receba uma pacote no formato STRING e
	que emita uma alerta informando o tipo do sensor e também que verifique se a bateria
	está baixa ou não. O critério para a bateria baixa é estar abaixo de 20%.*/
	
	String MAC;
	int tipo;
	int dado;
	Protocolo protocolo;
	
	public String getMAC() {
		return MAC;
	}
	public void setMAC(String mAC) {
		MAC = mAC;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public Protocolo getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}
	
	public Dispositivo (String mac, int Tipo, int Dado) {
		super();
		MAC = mac;
		tipo = Tipo;
		dado = Dado;
	}
	
	String serializacao() {
		
		String pacote = "";
		pacote += MAC;
		
		if (tipo < 10) 
			pacote += "0";
			pacote += Integer.toString(tipo);
		
		if (dado < 10) 
			pacote += "0";
			pacote += Integer.toString(dado);
			
		return pacote;				
	}
	
	void deserializacao(String pacote) {
		
		MAC = pacote.substring(0, 11);
		dado = Integer.parseInt(pacote.substring(11, 13));
		
		if (dado < 20) {
			System.out.println("A bateria está fraca com: " + dado + " %");
		} else {
			System.out.println("A bateria está boa com: " + dado + " %");
		}
		
		tipo = Integer.parseInt(pacote.substring(13, 15));
		if (tipo < 99)
			System.out.println("Sensor do tipo: " + tipo);		
	}
}
