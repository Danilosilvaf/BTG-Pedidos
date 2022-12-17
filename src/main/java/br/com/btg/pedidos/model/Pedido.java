package br.com.btg.pedidos.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "pedido")
public class Pedido {

	@Id @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
	private Long codigoPedido;
	
	private int codigoCliente;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="pedido")
    private List<ItemPedido> itens = new ArrayList<>();
    
	public Pedido() {
	}

	public Pedido( Long codigoPedido, int codigoCliente, List<ItemPedido> itens) {
		super();
		this.codigoPedido = codigoPedido;
		this.codigoCliente = codigoCliente;
		this.itens = itens;
	}

	public Long getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Long codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
}
