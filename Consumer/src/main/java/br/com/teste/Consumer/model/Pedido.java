package br.com.teste.Consumer.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Pedido {

	@Id
	private String codigoPedido;
	private List<Item> itens;
	
	public Pedido() {
	}
	
	public Pedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	
	public String getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	
}
