SpringCloud是基于SpringBoot之上的用来快速构建微服务系统的工具集，拥有功能完善的轻量级微服务组件，例如服务治理（Eureka）,声明式REST调用（Feign）,
客户端负载均衡（Ribbon），服务容错（Hystrix）,服务网关（Zuul）以及服务配置（Spring Cloud Config）,服务跟踪（Sleuth）等等





模块说明：
springcloud-eureka-server    分布式服务注册中心（单点）
springcloud-eureka-server-ha 分布式服务注册中心（高可用版本）
springcloud-provider-user-service 用户服务提供者
springcloud-consumer-h5      用户服务调用者，采用原始的RestTemplate调用
springcloud-consumer-h5-ribbon-hystrix   用户服务调用者，采用ribbon做客户端负载均衡
springcloud-consumer-h5-feign   feign声明式服务调用者
springcloud-gateway          网关服务
springcloud-config-server    配置中心  