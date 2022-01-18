package com.steelparrot.authapispring.email;

public interface EmailSender {
    void send(String to, String email);
}
