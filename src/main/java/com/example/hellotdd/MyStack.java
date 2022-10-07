package com.example.hellotdd;

public class MyStack {
  private boolean empty = true;

  public boolean isEmpty() {
    return empty;
  }

  public void push(int element) {
    empty = false;
  }

  public int pop() {
    empty = true;
    return -1;
  }

  public int size() {
    return 2;
  }
}
