package com.tsswebapps.jftsistemasmembros.requestDto;

public class LogradouroDto {
	private String cep;
	private String logradouro;
	private String bairro;
	private String localidade;
	private String ibge;
	private String uf;
	private String pais;

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public String getIbge() {
		return ibge;
	}

	public String getUf() {
		return uf;
	}

	public String getPais() {
		return pais;
	}

	public LogradouroDto(String cep, String logradouro, String bairro, String localidade, String ibge, String uf,
			String pais) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.localidade = localidade;
		this.ibge = ibge;
		this.uf = uf;
		this.pais = pais;
	}

}
