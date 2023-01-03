package br.com.teste.Consumer.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.btg.pedidos.model.Pedido;
import br.com.teste.Consumer.repository.ConsumerRepository;

@Component
public class PedidoListener {

	
	@Autowired
	private ConsumerRepository repository;
	
	@RabbitListener(queues = "pedido")
	public void recebeMensagem(Pedido pedido) {
		System.out.println("recebido" + pedido.toString());
	};
}
