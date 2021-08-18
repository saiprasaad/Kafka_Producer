package com.kafkaproducer.kafkaproducer.producer;

import com.kafkaproducer.kafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * service for kafka producer.
 */
@Service
public class KafkaProducer {

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  @Autowired
  private KafkaTemplate<String, User> kafkaJsonTemplate;

  public void produceMessage(String topic, String message) {
    kafkaTemplate.send(topic, message);
  }

  public void produceJsonMessage(String topic, User user) {
    kafkaJsonTemplate.send(topic, user);
  }

}
