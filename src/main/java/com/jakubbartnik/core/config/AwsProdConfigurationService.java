package com.jakubbartnik.core.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class AwsProdConfigurationService implements AwsConfigurationService {
    @Override
    public String getAwsRegion() {
        return "AWS region for PROD";
    }

    @Override
    public String AwsAZ() {
        return "AWS AZ FOR PROD";
    }
}
