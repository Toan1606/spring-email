package com.techical.SpringMail.services;


public interface IGmailServices {

    public void sendSimpleMessage(String toEmail,  String subject, String text);

}
