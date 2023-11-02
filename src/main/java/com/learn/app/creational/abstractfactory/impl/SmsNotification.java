package com.learn.app.creational.abstractfactory.impl;

import lombok.Builder;

@Builder
public class SmsNotification implements Notification{

    private MetaInfo metaInfo;

    @Override
    public String parseMessage(MetaInfo metaInfo) {
        return "SMS TO:  " + metaInfo.getSendTo() + ":::::: Email Content ::::: From: "+metaInfo.getSendFrom();
    }

    @Override
    public String sendNotification() {
        return "Sending SMS..." + parseMessage(this.metaInfo);
    }
}
