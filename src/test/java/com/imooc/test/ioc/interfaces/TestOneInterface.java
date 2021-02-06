package com.imooc.test.ioc.interfaces;

import com.imooc.ioc.interfaces.OneInterface;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

  public TestOneInterface() { super("classpath*:spring-ioc.xml"); }

  @Test
  public void testSay() {
    OneInterface oneInterface = super.getBean("oneInterface");
    oneInterface.say("This is a test.");
  }
}
