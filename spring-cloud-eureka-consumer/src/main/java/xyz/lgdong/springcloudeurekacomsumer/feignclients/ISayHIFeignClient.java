package xyz.lgdong.springcloudeurekacomsumer.feignclients;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.lgdong.springcloudeurekacomsumer.config.RandomLoadbalancerConfig;

/**
 * @author 神隐`
 * @date 2021-06-09
 */

@FeignClient(value = "eureka-producer")
@LoadBalancerClient(value = "eureka-producer",configuration = RandomLoadbalancerConfig.class)
public interface ISayHIFeignClient {

    @GetMapping("/hi")
    public String sayHi();
}


