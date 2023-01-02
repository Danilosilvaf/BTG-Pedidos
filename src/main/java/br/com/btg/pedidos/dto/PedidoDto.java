package br.com.btg.pedidos.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonDeserialize
public class PedidoDto {

    private Long id;

    private List<ItemPedidoDto> itens = new ArrayList<>();
    
	public PedidoDto() {
	}

	public PedidoDto(Long id, List<ItemPedidoDto> itens) {
		this.id = id;
		this.itens = itens;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemPedidoDto> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedidoDto> itens) {
		this.itens = itens;
	}
    
}

