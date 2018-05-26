package com.controller;

import com.common.remote.ClientRemoteProxy;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sam on 2018/4/30.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    ClientRemoteProxy clientRemoteProxy;


    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }



    @RequestMapping(value = "/hello/{name}")
    @HystrixCommand(fallbackMethod = "error", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
            , @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2")})
    public String hello(@PathVariable(value = "name") String name){
        return clientRemoteProxy.hello(name);
    }

    public String error(String name){
        return name+"：您所调用的接口服务不可用，请重试";
    }
}
