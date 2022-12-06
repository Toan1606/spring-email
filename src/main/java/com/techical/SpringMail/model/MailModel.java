package com.techical.SpringMail.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailModel {

    private String from;

    private String to;

    private String subject;

    private String body;

    @Builder.Default
    private Set<String> cc = new HashSet<>();

    @Builder.Default
    private Set<String> bcc = new HashSet<>();

    private List<File> files = new ArrayList<>();
}
