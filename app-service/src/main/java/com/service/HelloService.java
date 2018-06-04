package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by sam on 2018/4/30.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient client;

    public String hiService(String name) {
        test(name);
        return restTemplate.getForObject("http://APPCLIENT/hi?name="+name,String.class);
    }


    private void test(String name) {
        List<ServiceInstance> instances = client.getInstances("APPCLIENT");
        for (int i = 0; i < instances.size(); i++) {
            System.out.println("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
        }
        //只是打印出来
    }
}
