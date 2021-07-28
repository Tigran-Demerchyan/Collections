package com.collections;

public class MyNode<T> {
    private MyNode<T> prev;
    private T data;
    private MyNode<T> next;

    public MyNode(MyNode<T> prev, T item, MyNode<T> next) {
        this.prev = prev;
        this.data = item;
        this.next = next;
    }

    public MyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(MyNode prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}
