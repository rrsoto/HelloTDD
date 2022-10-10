package com.example.hellotdd;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import com.example.hellotdd.MyStack.StackUnderflowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

  @ParameterizedTest
  @ValueSource(ints = {0, 50, 99})
  void after_push_x_will_pop_x(int element) {
    myStack.push(element);
    int actualPoppedElement = myStack.pop();
    assertThat(actualPoppedElement).isEqualTo(element);
  }
  @Test
  void after_push_x_and_y_will_pop_y_and_x() {
    myStack.push(99);
    myStack.push(88);
    assertThat(myStack.pop()).isEqualTo(88);
    assertThat(myStack.pop()).isEqualTo(99);
  }

  @Test
  void after_push_x_elements_will_pop_inverted_elements() {
    EasyRandom easyRandom = new EasyRandom();
    final var randomElements = easyRandom.objects(Integer.class, 25).collect(Collectors.toList());

    randomElements.forEach( element -> myStack.push(element) );

    List<Integer> poppedElements = new ArrayList<>();
    for (int i = 0 ; i < randomElements.size(); i++) {
      poppedElements.add(myStack.pop());
    }

    Collections.reverse(randomElements);
    assertThat(poppedElements).isEqualTo(randomElements);
  }
}
