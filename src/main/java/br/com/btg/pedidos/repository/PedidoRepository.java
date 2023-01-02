package br.com.btg.pedidos.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.btg.pedidos.model.Pedido;

public interface PedidoRepository extends MongoRepository<Pedido, String>{

	Optional<Pedido> findById(String codigoPedido);
}
