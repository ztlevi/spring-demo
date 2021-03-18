package com.imooc.autowiring;

public class AutoWiringService {

  private AutoWiringDAO autoWiringDAO;

  // Note: Constuctor needs to be disabled if we use auto-wiring byType or byName
  // Change default-autowire in spring-autowiring.xml to constructor if we want to auto-wire by
  // constructor
  // public AutoWiringService(AutoWiringDAO autoWiringDAO) {
  //   System.out.println("AutoWiringService");
  //   this.autoWiringDAO = autoWiringDAO;
  // }

  public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
    System.out.println("setAutoWiringDAO");
    this.autoWiringDAO = autoWiringDAO;
  }

  public void say(String word) {
    this.autoWiringDAO.say(word);
  }
}
