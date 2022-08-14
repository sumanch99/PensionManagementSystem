package com.cognizant.pms.login.securityConfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("jwt")
public class JwtConfig {
    private String secret = "secret";
    private long validity = 1000;
    private boolean authDisabled;

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setValidity(long validity) {
        this.validity = validity;
    }

    public String getSecret() {
        return secret;
    }

    public long getValidity() {
        return validity;
    }

    public boolean isAuthDisabled() {
        return authDisabled;
    }

    public void setAuthDisabled(boolean authDisabled) {
        this.authDisabled = authDisabled;
    }

}