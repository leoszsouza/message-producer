# message-producer
Instruçes para subir o rabbitmq local:
- docker pull rabbitmq
- docker run -d --hostname my-rabbit --name some-rabbit rabbitmq:3-management

Url de acesso ao management do rabbitmq:
http://localhost:15672/#/queues

O projeto contendo o serviço de consumo da fila está em:
https://github.com/leoszsouza/message-receiver
