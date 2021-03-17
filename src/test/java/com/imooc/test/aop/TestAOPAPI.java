package com.imooc.test.aop;

import com.imooc.aop.api.BizLogic;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAPI extends UnitTestBase {

  public TestAOPAPI() {
    super("classpath:spring-aop-api.xml");
  }

  @Test
  public void testSave() {
    BizLogic logic = (BizLogic) super.getBean("bizLogicImpl");
    logic.save();
  }
}
