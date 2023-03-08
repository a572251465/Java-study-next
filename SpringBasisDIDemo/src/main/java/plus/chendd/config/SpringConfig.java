package plus.chendd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "plus.chendd")
@PropertySource("userInfo.properties")
public class SpringConfig {
}
