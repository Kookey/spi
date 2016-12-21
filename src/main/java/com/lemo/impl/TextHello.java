package com.lemo.impl;

import com.lemo.HelloInterface;

/**
 * TextHello
 *
 * @author 王兴岭
 * @create 2016-12-21 18:09
 */
public class TextHello implements HelloInterface {
  @Override
  public void sayHello() {
    System.out.println("hello text");
  }
}
