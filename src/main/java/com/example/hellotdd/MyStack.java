package com.example.hellotdd;

public class MyStack {

  public static class StackUnderflowException extends RuntimeException{

  }

  private int size = 0;
  private int pushedElement;

  public boolean isEmpty() {
    return 0 == size;
  }

  public void push(int element) {
    size++;
    pushedElement = element;
  }

  public int pop() {
    if (0 == size)
      throw new StackUnderflowException();
    size--;
    return pushedElement;
  }

  public int size() {
    return size;
  }
}
