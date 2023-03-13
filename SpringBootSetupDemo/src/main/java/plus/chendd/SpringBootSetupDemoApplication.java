package plus.chendd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(value = "plus.chendd")
public class SpringBootSetupDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSetupDemoApplication.class, args);
    }
}
