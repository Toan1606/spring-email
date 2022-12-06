package com.techical.SpringMail.model.dto;

import lombok.Data;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class MailDTO implements Serializable {
    private String to;

    private String subject;

    private String body;

    private Set<String> cc = new HashSet<>();

    private Set<String> bcc = new HashSet<>();

    private List<File> files = new ArrayList<>();
}
