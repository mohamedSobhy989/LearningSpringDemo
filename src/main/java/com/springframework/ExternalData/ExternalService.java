package com.springframework.ExternalData;

import org.springframework.beans.factory.annotation.Value;
 import org.springframework.stereotype.Component;

@Component
public class ExternalService {

    // get url from property file
    @Value("${external.service.url}")
    private String URL;

    public String getExternalURL(){
        return this.URL;
    }

}
