package com.design.designPatterns.phonepayAfter;

public class Client {
    public static void main(String[] args) {
        PhonePe p = new PhonePe(
                new ICICIBankAPIAdapter());
    }

}
