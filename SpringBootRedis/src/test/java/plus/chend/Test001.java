package plus.chend;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.hash.Jackson2HashMapper;
import org.springframework.test.context.junit4.SpringRunner;
import plus.chendd.SpringBootRedisApplication;
import plus.chendd.entity.Person;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootRedisApplication.class)
public class Test001 {
  
  @Autowired
  StringRedisTemplate stringRedisTemplate;
  
  @Autowired
  private ObjectMapper objectMapper;
  
  @Test
  public void setValue() {
    ValueOperations valueOperations = stringRedisTemplate.opsForValue();
    valueOperations.set("name", "lihh");
  }
  
  @Test
  public void getValue() {
    ValueOperations valueOperations = stringRedisTemplate.opsForValue();
    System.out.println(valueOperations.get("name"));
  }
  
  @Test
  public void testMap() {
    Person person = new Person("lihh", 20);
    HashOperations<String, Object, Object> forHash = stringRedisTemplate.opsForHash();
    
    Jackson2HashMapper jackson2HashMapper = new Jackson2HashMapper(objectMapper, false);
    forHash.putAll("lihh:1", jackson2HashMapper.toHash(person));
    
    Map<Object, Object> entries = forHash.entries("lihh:1");
    Person person1 = objectMapper.convertValue(entries, Person.class);
    System.out.println(person1);
  }
}
