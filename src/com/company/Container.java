package com.company;

import org.w3c.dom.ranges.RangeException;

public class Container<T> {
    Node<T> head;
    Node<T> tail;
    int length;
    public Container(){
        head = null;
        tail = null;
        length = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void addElement(T value){
        if(isEmpty()) {
            head = new Node<T>(value);
            tail = head;
        } else{
            tail.setNext(new Node<T>(value));
            tail = tail.getNext();
        }
        length++;
    }
    public boolean hasElement(T value){
        Node<T> current = head;
        while(current!=null){
            if(current.getValue()==value){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    public T getElementByIndex(int index) throws Exception {
        if(index>=length || index < 0){
            throw new Exception("Out of range");
        }
        Node<T> current = head;
        for(int i = 0; i<index; i++){
            current = current.getNext();
        }
        return current.getValue();
    }
    public void delElementByIndex(int index) throws Exception {
        if(index>=length || index < 0){
            throw new Exception("Out of range");
        }
        if(index == 0){
            head = head.getNext();
        }else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        length--;
    }
    public int getIndexByValue(T value){
        int index = 0;
        Node<T> current = head;
        while(current != null){
            if(current.getValue()==value){
                return index;
            }
            current=current.getNext();
            index++;
        }
        return -1;
    }

    public int getLength() {
        return length;
    }
}
