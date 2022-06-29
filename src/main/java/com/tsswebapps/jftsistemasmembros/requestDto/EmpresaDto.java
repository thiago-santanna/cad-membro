package com.tsswebapps.jftsistemasmembros.requestDto;

public class EmpresaDto {
	private String id;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String fone;
	public EmpresaDto(String id, String razaoSocial, String nomeFantasia, String cnpj, String fone) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.fone = fone;
	}
	public String getId() {
		return id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getFone() {
		return fone;
	}

}
