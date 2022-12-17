package br.com.btg.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.btg.pedidos.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
