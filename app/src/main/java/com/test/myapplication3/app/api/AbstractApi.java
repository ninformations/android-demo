package com.test.myapplication3.app.api;

import android.os.AsyncTask;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by nitin.sharma01 on 08-07-2015.
 */
public abstract class AbstractApi<Params, Progress, Result> extends AsyncTask<Params, Progress, Result>  {
    protected String baseUrl = "http://rest-service.guides.spring.io";
    protected RestTemplate restTemplate = new RestTemplate();
    public String getBaseUrl() {
        return baseUrl;
    }
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    {
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
    }
}
