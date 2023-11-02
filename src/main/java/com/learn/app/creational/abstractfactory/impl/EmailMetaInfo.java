package com.learn.app.creational.abstractfactory.impl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@ToString(callSuper = true)
public class EmailMetaInfo extends MetaInfo{

    private String customerName;
    private Float totalDue;
}
