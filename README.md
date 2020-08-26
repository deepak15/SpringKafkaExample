### Kafka message publisher and consumer example code in Spring application
##### Prerequisite 
1. Kafka server running on localhost at port _9092_ and topic _TopicOne_ is defined.
1. Pull code from git into STS and run as spring boot application.
1. Using SoapUI or PostMan, post (Http Method: POST) a text message to rest url- _http: //localhost:8080/kafka/publish_
1. You will notice posted message is printed on console by kafka listener inplemented in spring application.



##### Instruction to install and run Kafka on local (windows 10 machine).
1. Download https://www.apache.org/dyn/closer.cgi?path=/kafka/2.6.0/kafka_2.13-2.6.0.tgz
1. Extract content  into _C:\apache\kafka_2.13-2.6.0_ . Validate by listing directory you should have _bin_, _config_, _libs_ .. folder under it.
1. Open command prompt and navigate to kafka directory i.e.
    cd C:\apache\kafka_2.13-2.6.0
    
    _.\bin\windows\zookeeper-server-start.bat  .\config\zookeeper.properties_

1. Start Kafka server (new command window)
    _.\bin\windows\kafka-server-start.bat  .\config\server.properties_

1. Create topic
    _.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic TopicOne_

1. List created topic
    _.\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181_

1. Publish message from command prompt (use new commnad window)
    _.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic TopicOne_

1. Consume message from command prompt (use new commnad window)
    _.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic TopicOne --from-beginning_
