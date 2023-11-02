package com.learn.app.creational.abstractfactory.impl;

public interface Notification {

    String parseMessage(MetaInfo metaInfo);
    String sendNotification();
}
