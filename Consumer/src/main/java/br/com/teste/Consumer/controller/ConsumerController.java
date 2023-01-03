package br.com.teste.Consumer.controller;

import java.util.Optional;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.btg.pedidos.model.Pedido;
import br.com.teste.Consumer.repository.ConsumerRepository;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private ConsumerRepository consumerRepository;
	
	@GetMapping("/{codigoPedido}")
	public Optional<br.com.teste.Consumer.model.Pedido> getPedido(@PathVariable String codigoPedido) {
		return consumerRepository.findById(codigoPedido);
	}
}
