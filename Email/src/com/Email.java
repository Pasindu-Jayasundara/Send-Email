package com;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Email {

    public static void send(String from, String fromAppPassword, String to, String subject, String body) throws Exception {

        String host = "smtp.gmail.com"; // SMTP server host

        // Properties for configuring the mail session
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587"); // port
        properties.put("mail.smtp.starttls.enable", "true"); // Enable STARTTLS
        properties.put("mail.smtp.auth", "true"); // Enable authentication

        // Create a Session object password authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, fromAppPassword); // Your Gmail username and password
            }
        });

        // Create a MimeMessage object
        MimeMessage message = new MimeMessage(session);

        // Set From: header field
        message.setFrom(new InternetAddress(from));

        // Set To: header field
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

        // Set Subject: header field
        message.setSubject(subject);

        // Set the content of the email
        message.setText(body);

        // Send the email
        Transport.send(message);

    }

}
