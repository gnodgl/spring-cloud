package xyz.lgdong.spring.cloud.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 神隐`
 * @date 2021-06-09
 */

@RestController
public class ProducerController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return "hello spring boot! port: "+port;
    }
}
