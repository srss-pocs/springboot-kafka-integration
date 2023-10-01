# springboot-kafka-integration
Spring Boot 3.1.4


Start ZooKeeper > zookeeper-server-start config\zookeeper.properties
Start Kafka Server > kafka-server-start config\server.properties

Start Producer 
Start Consumer

APIs
http://localhost:8080/api/kafka/publish/message

![image](https://github.com/srss-pocs/springboot-kafka-integration/assets/145287517/744de953-90c4-4679-a997-fdbc2ae7711d)



http://localhost:8080/api/kafka/publish
POST
{
    "id": 1,
    "name": "N1",
    "email": "a@b.com",
    "phoneNumber":"88888888"
}


![image](https://github.com/srss-pocs/springboot-kafka-integration/assets/145287517/61fd4ab2-bfa1-4e67-bd76-02c0921094fc)

