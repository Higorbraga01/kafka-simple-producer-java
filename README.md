# kafka-simple-producer-java
Comandos uteis do Kafka, para exibir os tópicos ou consumir mensagens que foram produzidas.

------------- Listando topicos ----------------------
bin/kafka-topics.sh --list --zookeeper localhost:2181
------------- ou ------------------------------------
./bin/kafka-topics.sh --bootstrap-server=localhost:9092 --list
------------------------------------------------------

------------- Detalhes do Topico ---------------------
bin/kafka-topics.sh --bootstrap-server=localhost:9092 --describe --topic NOME_TOPICO
------------------------------------------------------

-------- Listar e exibir os detalhes dos Consumers ---
 bin/kafka-consumer-groups.sh --all-groups --bootstrap-server localhost:9092 --describe  
------------------------------------------------------

------- Consumir mensagens de um topico --------------
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic NOME_TOPICO --from-beginning
------------------------------------------------------



explicaçõoes sobre os parametros utilizados pelos comandos listados acima:
# --bootstrap-server : endereço do broker do kafka geralmente a porta é sempre 9092.
# --topic: nome do topico a ser consultado ou de onde sera consumida as mensagens
# --describe: Detalha com maiores informações o(s) topicos listado(s).
# --from_beginning: indica ao consumer a partir de quando deve consumir as mensagens, utilizando esta flag indica que seram consumidas todas as mensagens a partir do inicio.

