package com.imooc.autowiring;

public class AutoWiringService {

  private AutoWiringDAO autoWiringDAO;

  // Constuctor needs to be disabled if we use auto-wiring byType or byName
  public AutoWiringService(AutoWiringDAO autoWiringDAO) {
    System.out.println("AutoWiringService");
    this.autoWiringDAO = autoWiringDAO;
  }

  public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
    System.out.println("setAutoWiringDAO");
    this.autoWiringDAO = autoWiringDAO;
  }

  public void say(String word) {
    this.autoWiringDAO.say(word);
  }
}
