package br.com.teste.Consumer.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.teste.Consumer.model.Pedido;

public interface ConsumerRepository extends MongoRepository<Pedido, String>{

	Optional<Pedido> findById(String codigoPedido);

}
