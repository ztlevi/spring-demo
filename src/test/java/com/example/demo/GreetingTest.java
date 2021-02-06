package com.example.demo;
import com.example.restservice.Greeting;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class GreetingTest extends UnitTestBase {
  public GreetingTest() { super("classpath*:spring-ioc.xml"); }

  @Test
  public void testGreeting() {
    Greeting g = super.getBean("greeting");
  }
}
