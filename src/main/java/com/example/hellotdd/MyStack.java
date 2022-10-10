package com.example.hellotdd;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

  public static class StackUnderflowException extends RuntimeException{

  }

  private int size = 0;
  private List<Integer> elements = new ArrayList<>();

  public boolean isEmpty() {
    return 0 == size;
  }

  public void push(int element) {
    elements.add(element);
    size++;
  }

  public int pop() {
    if (0 == size)
      throw new StackUnderflowException();
    return elements.remove(--size);
  }

  public int size() {
    return size;
  }
}
