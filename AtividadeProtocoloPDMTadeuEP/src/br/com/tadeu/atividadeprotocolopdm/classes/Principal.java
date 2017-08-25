package br.com.tadeu.atividadeprotocolopdm.classes;

public class Principal {

	public static void main(String[] args) {
		
		/* [HEADER]-[BODY]
	     * TIPO_01: HEART
	     * [{1:OBR}{2:OBR}{3:OBR}{4:OBR}{5:OBR}{6:OBR}{07:OBR}][VAZIO]
	     * TIPO_02: ACK
	     * [{1:OBR}{2:OBR}{3:OBR}{4:OBR}{5:OBR}{6:OBR}{07:OBR}][VAZIO]
	     * TIPO_03: PEDE_DADO
	     * [{1:OBR}{2:OBR}{3:OBR}{4:OBR}{5:OBR}{6:OBR}{07:OBR}][1 PARÂMETRO]
	     * TIPO_04: ENVIA_DADO
	       [{1:OBR}{2:OBR}{3:OBR}{4:OBR}{5:OBR}{6:OBR}{07:OBR}][2 PARÂMETROS]*/
		
		Protocolo p = new Protocolo ("00:00:00:01", "00:00:00:02", 80, 1, 2, 1);
		Param param = new Param(1,2,"10");
		p.AddParam(param);
		
		String Value = "MEU VALOR DADO";
		
		Param param2 = new Param(1,Value.length(),Value);
		p.AddParam(param2);
		
		System.out.println(p.Serializar());
		p.DeSerializar(p.Serializar());
		System.out.println(p.Serializar());
		
		

	}

}
