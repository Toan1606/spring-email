package com.techical.SpringMail.controller;

import com.techical.SpringMail.model.dto.MailDTO;
import com.techical.SpringMail.services.IGmailServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/api/v1/email")
public class EmailController {

    private final IGmailServices gmailServices;

    public EmailController(IGmailServices gmailServices) {
        this.gmailServices = gmailServices;
    }

    @GetMapping
    public ResponseEntity<String> email() {
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendEmail() {
        MailDTO mailDTO = MailDTO.builder()
                .to("nguyenthetoan1606@gmail.com")
                .subject("Test Send Email From FPT")
                .body("Hello, My name is toanntse06164")
                .cc(Collections.singleton("toanntse06164@fpt.edu.vn"))
                .bcc(Collections.singleton("toannt16.softwareengineering@gmail.com"))
                .build();
        gmailServices.sendSimpleMessage(mailDTO.getTo(), mailDTO.getSubject(), mailDTO.getBody());
        return ResponseEntity.ok("OK");
    }
}
