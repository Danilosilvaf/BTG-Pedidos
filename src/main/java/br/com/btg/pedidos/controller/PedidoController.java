package br.com.btg.pedidos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.btg.pedidos.model.Pedido;
import br.com.btg.pedidos.repository.PedidoRepository;


@RestController
@RequestMapping("/")
public class PedidoController {

	@Autowired
	private PedidoRepository repository;

	@GetMapping("/pedido/{codigoPedido}")
	public Optional<Pedido> getPedido(@PathVariable String codigoPedido) {
		return repository.findById(codigoPedido);
	}
}