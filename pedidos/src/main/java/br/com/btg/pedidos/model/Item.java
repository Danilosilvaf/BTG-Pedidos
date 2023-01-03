package br.com.btg.pedidos.model;

public class Item {

	private String produto;
	private int quantidade;
	private double preco;
	
	public Item() {
	}
	
	public Item(String produto, int quantidade, double preco) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Item [produto=" + produto + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
	
}
