package com.example.hellotdd;

public class MyStack {

  public static class StackUnderflowException extends RuntimeException{

  }

  private int size = 0;
  private int[] elements = new int[2];

  public boolean isEmpty() {
    return 0 == size;
  }

  public void push(int element) {
    elements[size++] = element;
  }

  public int pop() {
    if (0 == size)
      throw new StackUnderflowException();
    return elements[--size];
  }

  public int size() {
    return size;
  }
}
