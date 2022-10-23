package com.example.fullstack.chatroom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String source;
    private String destination;
    private String content;
    private LocalDateTime date;
    private Status status;
}
