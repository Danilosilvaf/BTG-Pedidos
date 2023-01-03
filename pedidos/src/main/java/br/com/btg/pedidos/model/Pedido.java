package br.com.btg.pedidos.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teste")
public class Pedido {

	@Id
	private String codigoPedido;
	private String codigoCliente;
	private List<Item> itens;
	
	public Pedido(String codigoPedido, String codigoCliente, List<Item> itens) {
		this.codigoPedido = codigoPedido;
		this.codigoCliente = codigoCliente;
		this.itens = itens;
	}
	
	public Pedido() {
	}
	
	public String getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", codigoCliente=" + codigoCliente + ", itens=" + itens + "]";
	}
	
}
