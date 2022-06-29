package com.tsswebapps.jftsistemasmembros.dto;

public class UsuarioDto {
	private String id;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String fone;

	public UsuarioDto(String id, String razaoSocial, String nomeFantasia, String cnpj, String fone) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.fone = fone;
	}

}
