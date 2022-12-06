package com.techical.SpringMail.controller;

import com.techical.SpringMail.model.dto.MailDTO;
import com.techical.SpringMail.services.IGmailServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @PostMapping
    public ResponseEntity<String> sendEmail(@Valid @RequestBody MailDTO mailDTO) {
        gmailServices.sendSimpleMessage(mailDTO.getTo(), mailDTO.getSubject(), mailDTO.getBody());
        return ResponseEntity.ok("OK");
    }
}
