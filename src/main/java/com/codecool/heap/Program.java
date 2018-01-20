package com.codecool.heap;

public class Program {

    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap(5);
        System.out.println(myHeap.getTakenSlots() + " TAKEN SLOTS");
        myHeap.add(10);
        myHeap.add(15);
        myHeap.add(20);
        myHeap.add(17);
        myHeap.add(25);
        System.out.println(myHeap.toString());
        myHeap.add(5);
        System.out.println(myHeap.toString());
        System.out.println(myHeap.peek());
    }
}
