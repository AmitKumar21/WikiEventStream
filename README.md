# Spring Boot + Apache Kafka + JPA + JSON  
# WikimediaEventStream

We can use Kafka when we have to move a large amount of data and process it in real-time. 
In this application i have created two microservices springboot appliaction which will act as producing and consuming the real time data from https://stream.wikimedia.org/v2/stream/recentchange and parsing it in json format and then storing the relevant data into mysql database using Hibernate/JPA.
-------------
The data will be fetched by Kafka-producer microservice using the springboot event handler and gets stored inside the kafka topic.
Here is the screenshot of kafka proudcer fetching the data in **real-time** and storing it in topic.

![Screenshot 2022-08-01 at 9 44 55 PM](https://user-images.githubusercontent.com/31178228/182423675-d58b8666-7f79-4698-b99e-570f71779a1a.jpeg).

-------------
After fethcing the data and storing it in the topic we can trigger our consumer microservice to get the data stream stored in kafka topic using 
**kafka listner** . Since the data was coming in the form json strings we are using **org.json** to parse the json data. We have also created a enity class **WikimediaData** which will create a wikimedia table inside the mysql database using JAP repository.

Screeshot of insertion queries .

![Screenshot 2022-08-03 at 12 29 02 PM](https://user-images.githubusercontent.com/31178228/182554156-316a7e55-8fa5-4d48-afc0-e54bc38d4738.png)

---------------

Data Stored in MSQL

![Screenshot 2022-08-03 at 12 33 39 PM](https://user-images.githubusercontent.com/31178228/182554483-e2ae097b-1b2c-4b9b-83ed-a99e1175adc3.png)
