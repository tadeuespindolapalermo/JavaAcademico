package br.com.tadeu.atividadeprotocolopdm.classes;

public class Main_questao_04 {

	public static void main(String[] args) {		
		
		Dispositivo dispositivo1 = new Dispositivo("AA:AA:AA:AA", 18, 03);
		Dispositivo dispositivo2 = new Dispositivo("11:11:11:11", 21, 04);
		
		System.out.println("==========DISPOSITIVO 01===========");
		System.out.println(dispositivo1.serializacao());
		dispositivo1.deserializacao(dispositivo1.serializacao());
		System.out.println("===================================\n");
		
		System.out.println("==========DISPOSITIVO 02===========");
		System.out.println(dispositivo2.serializacao());
		dispositivo2.deserializacao(dispositivo2.serializacao());		
		System.out.println("===================================");
	}
}


