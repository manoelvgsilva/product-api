package com.app.product.controller;

import com.app.product.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * messages.
 */
@RestController
@RequestMapping("/messages")
public class MessageController {
  private final MessageService messageService;

  @Autowired
  public MessageController(MessageService messageService) {
    this.messageService = messageService;
  }

  /**
   * sendmessage.
   *
   * @param message the message
   * @return message
   */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<String> sendMessage(@RequestBody String message) {
    messageService.sendMessage(message);
    return ResponseEntity.ok().body("Mensagem enviada com sucesso: " + message);
  }
}
