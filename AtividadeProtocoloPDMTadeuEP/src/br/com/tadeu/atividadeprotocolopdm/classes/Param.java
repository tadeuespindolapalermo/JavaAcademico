package br.com.tadeu.atividadeprotocolopdm.classes;

public class Param {	
	
	int tipo;
	int size;
	String value;	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}	
	
	Param(int tipo, int size, String value) {

		this.tipo = tipo;
		this.size = size;
		this.value = value;
	}
	
	Param() {

		this.tipo = 0;
		this.size = 0;
		this.value = "";
	}
}
