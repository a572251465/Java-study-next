package plus.chendd.Filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter 执行之前");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("MyFilter 执行之后");
    }
}
