package com.app.product.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * messageservices.
 */
@Service
public class MessageService {
  private static final Logger logger = LoggerFactory.getLogger(MessageService.class);
  private final KafkaTemplate<String, String> kafkaTemplate;
  private static String staticTopicProduct;

  /**
   * messageservice.
   *
   * @param kafkaTemplate the kafkatemplate
   * @param topicProduct the topicproduct
   */
  @Autowired
  public MessageService(KafkaTemplate<String, String> kafkaTemplate, @Value(
      "${topic.product}") String topicProduct) {
    this.kafkaTemplate = kafkaTemplate;
    staticTopicProduct = topicProduct;
  }

  /**
   * sendmessage.
   *
   * @param message the message
   */
  public void sendMessage(String message) {
    logger.info("Message -> {}", message);
    this.kafkaTemplate.send(staticTopicProduct, message);
  }
}
