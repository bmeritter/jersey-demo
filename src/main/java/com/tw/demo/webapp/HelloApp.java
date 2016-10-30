package com.tw.demo.webapp;

import com.tw.demo.service.HelloService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloApp {
    private static HelloService helloWorldService = new HelloService();

    @GET()
    public String hello() {
        return helloWorldService.sayHello();
    }
}