package com.learn.app.creational.abstractfactory.impl;

public class NotificationTester {

    public static void main(String[] args) {

        Notification notification = NotificationFactory.createNotification(
                EmailMetaInfo.builder()
                        .sendTo("raj@gmail.com")
                        .sendFrom("test@gmail.com")
                        .customerName("Raj kumar")
                        .totalDue(4000f).build());
        System.out.println(notification.sendNotification());

        Notification smsNotification = NotificationFactory.createNotification(
                SmsMetaInfo.builder()
                        .sendTo("9876546723")
                        .sendFrom("CT-AVS")
                        .totalDue(4000f).build());

        System.out.println(smsNotification.sendNotification());

    }
}
