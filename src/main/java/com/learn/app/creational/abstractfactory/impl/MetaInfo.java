package com.learn.app.creational.abstractfactory.impl;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class MetaInfo {
    private String sendTo;
    private String sendFrom;
}
