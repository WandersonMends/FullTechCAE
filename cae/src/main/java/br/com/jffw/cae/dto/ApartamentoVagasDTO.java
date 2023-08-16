package br.com.jffw.cae.dto;

public class ApartamentoVagasDTO {
	
	private int idVaga;
	private String numeroAP;
	private String bloco;
	private String numeroVaga;
	
	public ApartamentoVagasDTO () { }
	
	public ApartamentoVagasDTO(int idVaga, String numeroAP, String bloco, String numeroVaga) {
		this.setIdVaga(idVaga);
		this.setNumeroAP(numeroAP);
		this.setBloco(bloco);
		this.setNumeroVaga(numeroVaga);
	}

	public int getIdVaga() {
		return idVaga;
	}

	public void setIdVaga(int idVaga) {
		this.idVaga = idVaga;
	}

	public String getNumeroAP() {
		return numeroAP;
	}

	public void setNumeroAP(String numeroAP) {
		this.numeroAP = numeroAP;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(String numeroVaga) {
		this.numeroVaga = numeroVaga;
	}
}