package com.rolinzhang.rolin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(RolinProperties.class)
@EnableConfigurationProperties(RolinProperties.class)
@Configuration
public class RolinIdTemplate {

    @Autowired
    private RolinProperties rolinProperties;

    @Bean
    public long getId() {
        return new SnowFlakeService(rolinProperties.getDatacenterId(), rolinProperties.getMachineId()).nextId();
    }
}
