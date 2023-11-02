package com.learn.app.creational.abstractfactory.impl;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Helps to create notification instance as per MetaInfo instance type
 * */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NotificationFactory {

    public static Notification createNotification(MetaInfo metaInfo) {

        if (metaInfo instanceof SmsMetaInfo) {
            return SmsNotification.builder().metaInfo(metaInfo).build();
        }else if (metaInfo instanceof EmailMetaInfo) {
            return EmailNotification.builder().metaInfo(metaInfo).build();
        }

        throw new RuntimeException("Invalid Notification");
    }
}
