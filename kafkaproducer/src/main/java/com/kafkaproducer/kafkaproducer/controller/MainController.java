package com.kafkaproducer.kafkaproducer.controller;


import com.kafkaproducer.kafkaproducer.model.User;
import com.kafkaproducer.kafkaproducer.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller for producing messages.
 */
@RestController
public class MainController {

  @Autowired
  private KafkaProducer kafkaProducer;

  @GetMapping("/sendKafkaMessage")
  public void sendMessage(@RequestParam  String msg) {
    kafkaProducer.produceMessage("test", msg);
  }

  @PostMapping("/sendJsonKafkaMessage")
  public String sendJsonMessage(@RequestBody User user) {
    kafkaProducer.produceJsonMessage("jsontest", user);
    return "Produced " +  user.toString() + " Successfully";
  }


}
