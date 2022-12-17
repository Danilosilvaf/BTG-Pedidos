
CREATE TABLE item_do_pedido (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  nome varchar(255) DEFAULT NULL,
  quantidade int(11) NOT NULL,
  preco double(20) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (codigoPedido_id) REFERENCES pedidos(codigoPedido)
)