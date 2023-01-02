package br.com.btg.pedidos.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize
@JsonDeserialize
@Entity
@Table(name = "item_do_pedido")
public class ItemPedido {

	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

	private String nome;

	private Integer quantidade;
	
	private double preco;
	
	@JsonIgnore
    @ManyToOne(optional=false)
    private Pedido pedido;
	
	public ItemPedido() {
	}
	
	public ItemPedido( String nome, Integer quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
