package xyz.lgdong.springcloudeurekacomsumer.service;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lgdong.springcloudeurekacomsumer.feignclients.ISayHIFeignClient;

/**
 * @author 神隐`
 * @date 2021-06-09
 */

@Service
public class ConsumerService {

    @Autowired
    private ISayHIFeignClient sayHi;

    @CircuitBreaker(name = "sayHi",fallbackMethod = "sayHiFallback")
    public String sayHi(){
        return this.sayHi.sayHi();
    }

    public String sayHiFallback (Throwable throwable){
        System.out.println(throwable.getMessage());
        return "error circuitBreaker fallback";
    }
}
