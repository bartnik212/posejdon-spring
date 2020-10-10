package com.jakubbartnik.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PosejdonConfig {

    @Value("${domain}")
    private String domain;

    @Value("#{'s{themes}'.split(',')}")
    private List<String> themes;

    @Value("${admin.email}")
    private String adminEmail;

    @Value("${admin.phone}")
    private String adminPhone;

    public String getDomain() {
        return domain;
    }

    public List<String> getThemes() {
        return themes;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public String getAdminPhone() {
        return adminPhone;
    }
}
