package com.collections;


import java.util.Arrays;

public class MyArrayList<T> {
    private static final int INITIAL_SIZE = 10;
    private Object[] data;
    private int index;

    public MyArrayList() {
        this.data = new Object[INITIAL_SIZE];
        this.index = 0;

    }

    public T get(int i) {
        if (i >= this.index) {
            throw new IllegalArgumentException("your index is too big");
        }
        if (i < 0) {
            throw new IllegalArgumentException("your index could not be negative");
        }
        return (T) this.data[i];

    }

    public void add(T element) {
        if (this.index == this.data.length) {
            Object[] newArray = new Object[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                newArray[i] = this.data[i];
            }
            this.data = newArray;
        }
        this.data[this.index] = element;
        this.index++;

    }

    public int size() {
        return this.index;

    }

    public boolean isEmpty() {
        return this.index == 0;

    }

    public void remove(int removeIndex) {
        for (int i = removeIndex; i < this.index - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[index - 1] = null;
        this.index--;

    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "data=" + Arrays.toString(data) +
                ", index=" + index +
                '}';
    }

    public boolean contains(T item) {
        for (int i = 0; i < this.size(); i++) {
            if (this.data[i].equals(item)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean equals(Object obj) {
        MyArrayList myArrayList = (MyArrayList) obj;

        return Arrays.equals(this.data, myArrayList.data);

    }
}