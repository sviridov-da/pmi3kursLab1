package com.company;

public class Node<T> {
    Node<T> next;
    T value;
    public Node(T value){
        this.value = value;
        next = null;
    }

    public T getValue() {
        return value;
    }
    public Node<T> getNext(){
        return next;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }


}
