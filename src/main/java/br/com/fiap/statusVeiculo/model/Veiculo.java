package br.com.fiap.statusVeiculo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="statusSequence")
	@SequenceGenerator(name="statusSequence", sequenceName="statusSequence")
	private Long id;
	
	@Column(nullable = false)
	private String modelo;
	private int ano;
	private String proprietario;
	private String freios, airbeg;
	private int bateria, gasolina, pressaoPneu;
	private Long codigoChassi;
	private boolean LigaDesliga;
	
	
	private Long getId() {
		return id;
	}
	private void setId(Long id) {
		this.id = id;
	}
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
	private String getFreios() {
		return freios;
	}
	private void setFreios(String freios) {
		this.freios = freios;
	}
	private String getAirbeg() {
		return airbeg;
	}
	private void setAirbeg(String airbeg) {
		this.airbeg = airbeg;
	}
	private int getBateria() {
		return bateria;
	}
	private void setBateria(int bateria) {
		this.bateria = bateria;
	}
	private int getGasolina() {
		return gasolina;
	}
	private void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}
	private int getPressaoPneu() {
		return pressaoPneu;
	}
	private void setPressaoPneu(int pressaoPneu) {
		this.pressaoPneu = pressaoPneu;
	}
	private Long getCodigoChassi() {
		return codigoChassi;
	}
	private void setCodigoChassi(Long codigoChassi) {
		this.codigoChassi = codigoChassi;
	}
	public boolean isLigaDesliga() {
		return LigaDesliga;
	}
	public void setLigaDesliga(boolean ligaDesliga) {
		LigaDesliga = ligaDesliga;
	}
	
	
}
