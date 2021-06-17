package xyz.lgdong.springcloudeurekacomsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.lgdong.springcloudeurekacomsumer.service.ConsumerService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 神隐`
 * @date 2021-06-09
 */

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/hi")
    public String sayHi(HttpServletRequest request){
        System.out.println(request.getHeader("hello"));
        return consumerService.sayHi();
    }
}
