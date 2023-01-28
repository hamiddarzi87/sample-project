package com.hamid.sample.sampleproject.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "application.properties", name = {"name1", "name2"}, havingValue = "a")
public class Simple {

    @Override
    public String toString() {
        return "I am alive.";
    }
}
