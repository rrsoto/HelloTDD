package com.example.hellotdd;

public class MyStack {
  private int size = 0;

  public boolean isEmpty() {
    return 0 == size;
  }

  public void push(int element) {
    size++;
  }

  public int pop() {
    size--;
    return -1;
  }

  public int size() {
    return size;
  }
}
