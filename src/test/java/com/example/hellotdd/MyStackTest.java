package com.example.hellotdd;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import com.example.hellotdd.MyStack.StackUnderflowException;
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
    assertThatExceptionOfType(StackUnderflowException.class).isThrownBy(()->myStack.pop());
  }

  @Test
  void after_push_x_will_pop_x() {
    myStack.push(99);
    int actualPoppedElement = myStack.pop();
    assertThat(actualPoppedElement).isEqualTo(99);
  }
}
