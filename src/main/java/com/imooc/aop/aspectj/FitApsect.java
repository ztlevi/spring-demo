package com.imooc.aop.aspectj;

import com.imooc.aop.schema.advice.Fit;
import com.imooc.aop.schema.advice.FitImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FitApsect {

  // Inner-type declartion
  // https://www.eclipse.org/aspectj/doc/next/adk15notebook/ataspectj-itds.html
  @DeclareParents(value = "com.imooc.aop.schema.advice.biz.*(+)", defaultImpl = FitImpl.class)
  public static Fit fit_impl;

  @Before("com.imooc.aop.aspectj.MoocAspect.pointcut() && this(fit)")
  public void beforeIntroduction(Fit fit) {
    System.out.println("Use Fit as input arg.");
  }
}
