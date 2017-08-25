package br.com.tadeu.atividadeprotocolopdm.classes;

import java.util.List;
import java.util.ArrayList;

public class Protocolo {

	String H_MAC;
	String H_MAC_DES;
	int H_BATERIA;
	int H_STATUS;
	int H_TIPO_PACOTE;
	int H_TIPO_SENSOR;
	int H_QTE_PARAM;
	List<Param> B_DATA_LIST;

	public Protocolo(String h_MAC, String h_MAC_DES, int h_BATERIA,
			int h_STATUS, int h_TIPO_PACOTE, int h_TIPO_SENSOR) {

		super();
		H_MAC = h_MAC;
		H_MAC_DES = h_MAC_DES;
		H_BATERIA = h_BATERIA;
		H_STATUS = h_STATUS;
		H_TIPO_PACOTE = h_TIPO_PACOTE;
		H_TIPO_SENSOR = h_TIPO_SENSOR;
		B_DATA_LIST = new ArrayList<>();

	}

	void AddParam(Param param) {

		H_QTE_PARAM++;
		B_DATA_LIST.add(param);

	}

	String Serializar() {

		String pacote = "";
		pacote += H_MAC + H_MAC_DES;

		if (H_BATERIA<10) pacote += "00"; // AUMENTOU UM ZERO. PADRÃO "0"
		pacote += Integer.toString (H_BATERIA);

		if (H_STATUS<10) pacote += "0";
		pacote += Integer.toString (H_STATUS);

		if (H_TIPO_PACOTE<10) pacote += "0";
		pacote += Integer.toString (H_TIPO_PACOTE);

		if (H_TIPO_SENSOR<10) pacote += "0";
		pacote += Integer.toString (H_TIPO_SENSOR);

		if (H_QTE_PARAM<10) pacote += "0";
		pacote += Integer.toString (H_QTE_PARAM);

		for(Param p : B_DATA_LIST) {

			if (p.getTipo()<10) pacote += "0";
			pacote += Integer.toString (p.getTipo());

			if (p.getSize()<10) pacote += "0";
			pacote += Integer.toString (p.getSize());
			pacote += p.getValue();
		}

		return pacote;	
	}

	void DeSerializar(String Pacote) {

		H_MAC = Pacote.substring(0, 11); //MAC:00:00:00:FF
		H_MAC_DES = Pacote.substring(11, 22);
		H_BATERIA = Integer.parseInt(Pacote.substring(22, 25)); // PADRÃO (22, 24)
		H_STATUS = Integer.parseInt(Pacote.substring(25, 27)); // PADRÃO (24, 26)
		H_TIPO_PACOTE = Integer.parseInt(Pacote.substring(27, 29)); // PADRÃO (26, 28)
		H_TIPO_SENSOR = Integer.parseInt(Pacote.substring(29, 31)); // PADRÃO (28, 30)
		H_QTE_PARAM = Integer.parseInt(Pacote.substring(31, 33)); // PADRÃO (30, 32)
		int Qte_ParamAux = H_QTE_PARAM;
		B_DATA_LIST.clear();
		H_QTE_PARAM = 0;
		int index = 32;	

		for (int i = 0; i < Qte_ParamAux; i++) {

			int tipo = Integer.parseInt(Pacote.substring(index, index + 2));
			index = index + 2;

			int size = Integer.parseInt(Pacote.substring(index, index + 2));
			index = index + 2;

			String value = Pacote.substring(index, index + size);
			index = index + size;

			Param param = new Param(tipo, size, value);
			AddParam(param);
		}
	}
}
