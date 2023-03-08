import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T008_TestImportProperties {

    @Test
    public void testImport() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ImportProperties.xml");
        DruidDataSource dataSource = applicationContext.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
    }
}
