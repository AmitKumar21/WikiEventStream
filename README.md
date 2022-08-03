# Spring Boot + Apache Kafka  

# WikimediaEventStream
We can use **Kafka** when we have to move a large amount of data and process it in real-time. 
In this application i have created two **microservices** springboot appliaction which will act as producing and consuming the real time data from https://stream.wikimedia.org/v2/stream/recentchange and parsing it in json format and then storing the relevant data into mysql database using **Hibernate/JPA.**

The data will be fetched by Kafka-producer microservice and gets stored inside the kafka topics.
Here is the screenshot of kafka proudcer fetching the data in **real-time** and storing it in topic.

![Screenshot 2022-08-01 at 9 44 55 PM](https://user-images.githubusercontent.com/31178228/182423675-d58b8666-7f79-4698-b99e-570f71779a1a.jpeg)
