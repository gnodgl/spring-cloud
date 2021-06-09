package xyz.lgdong.springcloudeurekacomsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lgdong.springcloudeurekacomsumer.service.ConsumerService;

/**
 * @author 神隐`
 * @date 2021-06-09
 */

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/hi")
    public String sayHi(){
        return consumerService.sayHi();
    }
}
