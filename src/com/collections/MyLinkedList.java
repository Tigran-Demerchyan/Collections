package com.collections;

public class MyLinkedList<T> {
    private MyNode<T> first;
    private MyNode<T> last;
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    public void add(T data) {
        linkLast(data);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("MyLinked List [ ");

        MyNode cur = this.first;

        while (cur != null) {
            sb.append(cur.getData());
            sb.append(" ");
            cur = cur.getNext();
        }
        sb.append("]");

        return sb.toString();
    }

    private void linkLast(T data) {
        MyNode oldLast = this.last;
        MyNode newNode = new MyNode(oldLast, data, null);
        this.last = newNode;
        if (oldLast == null) {
            this.first = newNode;
        } else {
            oldLast.setNext(newNode);
        }
        ++this.size;


    }

    private MyNode<T> node(int index) {
        MyNode<T> x;
        x = this.first;
        for (int i = 0; i < index; ++i) {
            x = x.getNext();
        }
        return x;
    }

    public T get(int index) {
        return this.node(index).getData();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean equals(Object ob) {
        if (!(ob instanceof MyLinkedList)) {
            return false;
        }
        MyLinkedList list = (MyLinkedList) ob;

        if (list.size != this.size) {
            return false;
        }
        MyNode f1 = this.first;
        MyNode f2 = list.first;

        while (f1 != null) {
            if (!f1.getData().equals(f2.getData())) {
                return false;
            }
            f1 = f1.getNext();
            f2 = f2.getNext();
        }
        return true;
    }

    public boolean contains(T item) {

        MyNode cur = this.first;

        while (cur != null) {

            if (cur.getData().equals(item)) {
                return true;
            }
            cur = cur.getNext();
        }

        return false;
    }

}
