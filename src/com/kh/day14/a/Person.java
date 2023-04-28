package com.kh.day14.a;

import javax.management.PersistentMBean;
import java.util.Objects;

public class Person implements Cloneable {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;

  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    boolean flag = false;
    Person p = (Person) obj;
    if (this.name.equals(p.name) && this.age == p.age) {
      flag = true;
    }
    return flag;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

