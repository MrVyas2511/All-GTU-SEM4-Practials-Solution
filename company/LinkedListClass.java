package com.company;

import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        System.out.println(ll.toString());
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        System.out.println(ll.toString());
        ll.remove(2);
        System.out.println(ll.toString());
        ll.addLast(100);
        System.out.println(ll.toString());
        System.out.println(ll.indexOf(50));

    }
}
