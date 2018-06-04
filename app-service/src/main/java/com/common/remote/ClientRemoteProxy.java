package com.common.remote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sam on 2018/5/26.
 */

@Component
public class ClientRemoteProxy {

    @Autowired
    RestTemplate restTemplate;

    public String hello(String name) {
        //request
        return restTemplate.getForObject("http://APPCLIENT/hello?name="+name,String.class);
    }
}
