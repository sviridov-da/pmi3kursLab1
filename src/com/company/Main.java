package com.company;

public class Main {
    public static void main(String[] args) throws Exception {
        Container<Integer> container = new Container<>();
        for(int i = 1; i<=10; i++)
            container.addElement(i);
        //part1
        System.out.println(container.isEmpty()); //check isEmpty method,
        //check getIndexByValue method
        System.out.println(container.getIndexByValue(0));
        System.out.println(container.getIndexByValue(1));
        System.out.println(container.getIndexByValue(5));
        System.out.println(container.getIndexByValue(10));
        System.out.println(container.getIndexByValue(11));
        //check getElementByIndex method
        System.out.println(container.getElementByIndex(0));
        System.out.println(container.getElementByIndex(5));
        System.out.println(container.getElementByIndex(9));
        //check hasElement method
        System.out.println(container.hasElement(5));
        System.out.println(container.hasElement(1));
        System.out.println(container.hasElement(10));
        System.out.println(container.hasElement(0));
        System.out.println("___________");
        //part2
        Container<Integer> container2 = new Container<>();
        for(int i = 1; i<=10; i++)
            container2.addElement(i);
        for(int i = 0; i<container2.getLength(); i++){
            System.out.println(container2.getElementByIndex(i));
        }
        //check delElementByIndex method
        System.out.println("___________");
        container2.delElementByIndex(0);
        for(int i = 0; i<container2.getLength(); i++){
            System.out.println(container2.getElementByIndex(i));
        }
        System.out.println("___________");
        container2.delElementByIndex(container2.getLength()-1);
        for(int i = 0; i<container2.getLength(); i++){
            System.out.println(container2.getElementByIndex(i));
        }
        System.out.println("___________");
        container2.delElementByIndex(container2.getIndexByValue(3));
        for(int i = 0; i<container2.getLength(); i++){
            System.out.println(container2.getElementByIndex(i));
        }

    }
}
