package com.jakubbartnik.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PosejdonConfig {

    @Value("${env}")
    private String env;

    @Value("${domain}")
    private String domain;

    @Value("${themes}")
    private String[] themes;

    @Value("${admin.email}")
    private String adminEmail;

    @Value("${admin.phone}")
    private String adminPhone;

    public String getDomain() {
        return domain;
    }

   public List<String> getThemes(){
        return List.of(themes);
   }

    public String getAdminEmail() {
        return adminEmail;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public String getEnv() {
        return env;
    }
}
