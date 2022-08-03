package org.springboot;

import java.sql.Date;
import java.sql.Timestamp;

import org.json.JSONObject;
import org.slf4j.Logger;


import org.slf4j.LoggerFactory;
import org.springboot.entity.WikimediaData;
import org.springboot.repository.WikimediaDataRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import netscape.javascript.JSObject;

@Service
public class KafkaDatabaseConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    private WikimediaDataRepository dataRepository;

    public KafkaDatabaseConsumer(WikimediaDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume( String eventMessage){
    	 WikimediaData wikimediaData = new WikimediaData();
    	LOGGER.info(String.format("Event message received -> %s", eventMessage));
    	JSONObject json = new JSONObject(eventMessage);
    	if(json.has("id"))
    	wikimediaData.setEventid(json.getInt("id"));

    	if(json.has("title"))
    		
    	wikimediaData.setWikititle(json.getString("title"));
    	
    	if(json.has("$schema"))
    	wikimediaData.setSchemadata(json.getString("$schema"));
    		
    	if(json.has("server_url"))	
    	wikimediaData.setServer_url(json.getString("server_url"));
    	
    	
    	dataRepository.save(wikimediaData);
    		
    	
    	
    	

       
        

        dataRepository.save(wikimediaData);
    }
}
