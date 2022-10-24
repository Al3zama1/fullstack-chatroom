package com.example.fullstack.chatroom.controller;

import com.example.fullstack.chatroom.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private SimpMessagingTemplate simpMessagingTemplate;

    @Autowired
    public ChatController(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    // app/message
    @MessageMapping("/message")
    @SendTo("/chatroom/public")
    private Message receivePublicMessage(@Payload Message message) {
        return message;
    }

    // /user/{userName}/private
    @MessageMapping("/private-message")
    private Message receivePrivateMessage(@Payload Message message) {
        simpMessagingTemplate
                .convertAndSendToUser(message.getReceiverName(), "/private", message);
        return message;
    }
}
