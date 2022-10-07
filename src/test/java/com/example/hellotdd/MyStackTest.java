package com.example.hellotdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyStackTest {

  MyStack myStack;

  @BeforeEach
  void setup() {
    myStack = new MyStack();
  }

  @Test
  void after_create_stack_is_empty() {
    assertTrue(myStack.isEmpty());
  }

  @Test
  void after_push_stack_is_not_empty() {
    myStack.push(0);
    assertFalse(myStack.isEmpty());
  }

  @Test
  void after_push_and_pop_stack_is_empty() {
    myStack.push(0);
    myStack.pop();
    assertThat(myStack.isEmpty()).isTrue();
    assertThat(myStack.size()).isZero();
  }

  @Test
  void after_two_pushes_size_is_two() {
    myStack.push(0);
    myStack.push(0);
    assertThat(myStack.size()).isEqualTo(2);
  }

}
