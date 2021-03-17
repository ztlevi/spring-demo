package com.imooc.test.beanannotation;

import com.imooc.beanannotation.BeanAnnotation;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {

  public TestBeanAnnotation() {
    super("classpath*:spring-beanannotation.xml");
  }

  @Test
  public void testSay() {
    BeanAnnotation bean = super.getBean("beanAnnotation");
    bean.say("This is test.");

    // BeanAnnotation bean = super.getBean("bean");
    // bean.say("This is test.");
  }

  @Test
  public void testScpoe() {
    BeanAnnotation bean = super.getBean("beanAnnotation");
    bean.myHashCode();

    bean = super.getBean("beanAnnotation");
    bean.myHashCode();
  }
}
