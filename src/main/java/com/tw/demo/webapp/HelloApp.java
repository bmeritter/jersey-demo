package com.tw.demo.webapp;

import com.sun.org.apache.xpath.internal.operations.String;
import com.tw.demo.service.HelloService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloApp {
    private static HelloService helloWorldService = new HelloService();

    @GET()
    public java.lang.String hello() {
        return helloWorldService.sayHello();
    }

    @GET()
    public java.lang.String toHello(@PathParam("name") String name) {
        return helloWorldService.toHello(name);
    }
}