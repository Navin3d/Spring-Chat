package gmc.project.springchat.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import gmc.project.springchat.models.Greeting;
import gmc.project.springchat.models.HelloMessage;

@Controller
public class ChatController {


  @MessageMapping("/hello")
  @SendTo("/topic/greetings")
  public Greeting greeting(HelloMessage message) throws Exception {
    return new Greeting(HtmlUtils.htmlEscape(message.getName()));
  }

}
// Kabali

// Idukku per thaan thalaivar athiradi

// Kabali