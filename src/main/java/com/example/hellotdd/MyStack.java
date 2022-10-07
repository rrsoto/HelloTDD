package com.example.hellotdd;

public class MyStack {

  public static class StackUnderflowException extends RuntimeException{

  }

  private int size = 0;

  public boolean isEmpty() {
    return 0 == size;
  }

  public void push(int element) {
    size++;
  }

  public int pop() {
    if (0 == size)
      throw new StackUnderflowException();
    size--;
    return -1;
  }

  public int size() {
    return size;
  }
}
