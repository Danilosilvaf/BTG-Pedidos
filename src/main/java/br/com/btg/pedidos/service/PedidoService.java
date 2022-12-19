package br.com.btg.pedidos.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.btg.pedidos.dto.PedidoDto;
import br.com.btg.pedidos.model.Pedido;
import br.com.btg.pedidos.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;
	
    @Autowired
    private ModelMapper modelMapper;
    
    public List<PedidoDto> obterTodos() {
        return repository.findAll().stream()
                .map(p -> modelMapper.map(p, PedidoDto.class))
                .collect(Collectors.toList());
    }

    public PedidoDto criarPedido(PedidoDto dto) {
        Pedido pedido = modelMapper.map(dto, Pedido.class);

        pedido.getItens().forEach(item -> item.getClass());
        Pedido salvo = repository.save(pedido);

        return modelMapper.map(pedido, PedidoDto.class);
    }
}
