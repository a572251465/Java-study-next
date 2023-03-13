package plus.chendd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "plus.chendd.filter")
public class SpringBootFilterDemo02Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootFilterDemo02Application.class, args);
    }
}
