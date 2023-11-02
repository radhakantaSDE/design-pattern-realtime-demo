package com.learn.app.creational.abstractfactory.impl;

import lombok.Builder;

@Builder
public class EmailNotification implements Notification {

    private MetaInfo metaInfo;

    @Override
    public String parseMessage(MetaInfo metaInfo) {
        return "ToEmail:  " + metaInfo.getSendTo() + ":::::: Email Content ::::: FromEmail: "+metaInfo.getSendFrom();
    }

    @Override
    public String sendNotification() {
        return "Sending..." + parseMessage(this.metaInfo);
    }
}
