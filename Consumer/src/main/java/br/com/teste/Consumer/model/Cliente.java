package br.com.teste.Consumer.model;

import org.springframework.data.annotation.Id;

public class Cliente {

	@Id
	private String codigoCliente;
	private String nome;
	
	public Cliente() {
	}	
	
	public Cliente(String codigoCliente, String nome) {
		this.codigoCliente = codigoCliente;
		this.nome = nome;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
