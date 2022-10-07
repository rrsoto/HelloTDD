package com.example.hellotdd;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStackTest {

  MyStack myStack;

  @BeforeEach
  void setup() {
    myStack = new MyStack();
  }

  @Test
  void after_create_stack_is_empty() {
    assertThat(myStack.isEmpty()).isTrue();
    assertThat(myStack.size()).isZero();
  }

  @Test
  void after_push_stack_is_not_empty() {
    myStack.push(0);
    assertThat(myStack.isEmpty()).isFalse();
    assertThat(myStack.size()).isEqualTo(1);
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

  @Test
  void pop_with_empty_stack_throws_underflow(){
    assertThatExceptionOfType(MyStack.Underflow.class).isThrownBy(myStack.pop());
  }

}
