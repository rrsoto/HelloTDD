package com.example.hellotdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyStackTest {

  @Test
  void test_create_stack() {
    MyStack myStack = new MyStack();
    assertTrue(myStack.isEmpty());
  }

  @Test
  void test_push() {
    MyStack myStack = new MyStack();
    myStack.push(0);
  }
}
