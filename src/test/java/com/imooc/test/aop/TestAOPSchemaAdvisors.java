package com.imooc.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.dao.PessimisticLockingFailureException;

import com.imooc.aop.schema.advisors.service.InvokeService;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvisors extends UnitTestBase {

  public TestAOPSchemaAdvisors() {
    super("classpath:spring-aop-schema-advisors.xml");
  }

  @Test
  public void testSave() {
    InvokeService service = super.getBean("invokeService");
    System.out.println();
    service.invoke();
  }

  @Test(expected = PessimisticLockingFailureException.class)
  public void testSaveWithThrow() {
    InvokeService service = super.getBean("invokeService");
    System.out.println();
    service.invokeException();
  }
}
