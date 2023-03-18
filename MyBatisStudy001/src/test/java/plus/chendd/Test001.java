package plus.chendd;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import plus.chendd.mapper.PlanTaskMapper;
import plus.chendd.pojo.PlanTask;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test001 {
  
  private SqlSession sqlSession;
  
  @Before
  public void init() {
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    InputStream resourceAsStream;
    try {
      resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
    sqlSession = build.openSession();
  }
  
  
  public void print(List<PlanTask> list) {
    for (Object o : list) {
      System.out.println(o);
    }
  }
  
  @Test
  public void test01() {
    PlanTaskMapper mapper = sqlSession.getMapper(PlanTaskMapper.class);
    List<PlanTask> all = mapper.findAll("11111");
    print(all);
  }
  
  @After
  public void after() {
    sqlSession.close();
  }
}
