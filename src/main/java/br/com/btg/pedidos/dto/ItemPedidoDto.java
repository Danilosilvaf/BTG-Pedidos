package br.com.btg.pedidos.dto;

public class ItemPedidoDto {

    private String nome;
    private Integer quantidade;
    private String descricao;
    
	public ItemPedidoDto() {
	}
	public ItemPedidoDto(String nome, Integer quantidade, String descricao) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.descricao = descricao;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    
}
