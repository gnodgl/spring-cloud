package xyz.lgdong.springcloudeurekacomsumer.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 神隐`
 * @date 2021-06-09
 */

@FeignClient(value = "eureka-producer")
public interface ISayHIFeignClient {

    @GetMapping("/hi")
    public String sayHi();
}


