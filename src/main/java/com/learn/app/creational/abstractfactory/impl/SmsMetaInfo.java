package com.learn.app.creational.abstractfactory.impl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@ToString(callSuper = true)
public class SmsMetaInfo extends MetaInfo{

    private Float totalDue;
}
