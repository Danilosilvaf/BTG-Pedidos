Como rodar:

  Start na aplicação pedidos spring-boot pela IDE de preferência, dê um “docker compose up” no diretório para subir o rabbitmq e o mongodb, abrir o postman e fazer o import do arquivo de teste que consta no repositório git, realizar o envio via método post, logo após abrir gerenciador do rabbitmq no navegador (localhost:15672) e ir em queue, feito isso startar a aplicação Consumer e verificar que ela consome a mensagem direto.
  
Informações de login ao rabbitmq e ao mongodb, estão em applications.properties na aplicação ou no próprio docker-compose.yaml
