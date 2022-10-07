package com.example.hellotdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyStackTest {

  MyStack myStack;

  @BeforeEach
  void setup() {
    myStack = new MyStack();
  }

  @Test
  void test_create_stack() {
    assertTrue(myStack.isEmpty());
  }

  @Test
  void test_push() {
    myStack.push(0);
  }
}
