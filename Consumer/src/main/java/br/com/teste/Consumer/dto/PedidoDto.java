package br.com.teste.Consumer.dto;

import br.com.teste.Consumer.model.Pedido;

public class PedidoDto {

	private String codigoPedido;
	private String codigoCliente;
	private Pedido pedido;
	
	public PedidoDto() {
	}
	
	public PedidoDto(String codigoPedido, String codigoCliente, Pedido pedido) {
		this.codigoPedido = codigoPedido;
		this.codigoCliente = codigoCliente;
		this.pedido = pedido;
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
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}	
	
}
