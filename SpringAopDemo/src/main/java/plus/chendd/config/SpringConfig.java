package plus.chendd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "plus.chendd")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
