package com.design.designPatterns.observerDesignPattern;

public class EmailManagementService implements RegisterUserSubscriber {

    private void sendEmail(String to, String from) {

    }

    private UserService userService; // singleton

    @Override
    public void handleRegisterUser() {
        sendEmail("aditya", "raj");
    }

}
