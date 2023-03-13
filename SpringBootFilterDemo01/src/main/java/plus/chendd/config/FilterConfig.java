package plus.chendd.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import plus.chendd.Filter.MyFilter;

import java.util.Arrays;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean registrationBean() {
        FilterRegistrationBean<MyFilter> myFilterFilterRegistrationBean = new FilterRegistrationBean<>(new MyFilter());

        myFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return myFilterFilterRegistrationBean;
    }
}
