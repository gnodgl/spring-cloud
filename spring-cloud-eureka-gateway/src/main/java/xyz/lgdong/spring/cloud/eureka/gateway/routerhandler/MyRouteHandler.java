package xyz.lgdong.spring.cloud.eureka.gateway.routerhandler;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 神隐`
 * 创建时间 2021-06-11 14:06
 */

@Component
public class MyRouteHandler {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route(p->p.path("/consumer/**")
                .filters(f -> f.addRequestHeader("hello", "mary"))
                /*.stripPrefix(1))*/
                .uri("lb://eureka-consumer"))
                .build();
    }
}
