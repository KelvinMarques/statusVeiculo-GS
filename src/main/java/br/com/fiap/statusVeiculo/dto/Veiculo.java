package br.com.fiap.statusVeiculo.dto;

public class Veiculo {
	private String modelo;

	private int ano;

	private String proprietario;

	private String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private int getAno() {
		return ano;
	}

	private void setAno(int ano) {
		this.ano = ano;
	}

	private String getProprietario() {
		return proprietario;
	}

	private void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getLigaDesliga() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getBateria(){
		// TODO Auto-generated method stub
		int nivelBateria = 50;
		return nivelBateria;
	}
	public int getGasolina() {
		// TODO Auto-generated method stub
		int nivelGasolina = 50;
		return nivelGasolina;
	}
}
