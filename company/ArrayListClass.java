package com.company;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListClass {
    public static void main(String[] args) {

        // CREATE ARRAYLIST OBJECTS
        ArrayList<Integer> a = new ArrayList<>();

        // ADD ELEMENT TO ARRAYLIST
        a.add(10);

        // SEARCHING FOR ELEMENT IN  THE ARRAY
        System.out.println(a.contains(10));
        System.out.println(a.contains(50));

        // ARRAY LIST DISPLAY
        System.out.println(a.toString());

        // TO ADD ELEMENT IN ARRAY
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a.toString());

        //INDEX OF GIVEN ELEMENT
        System.out.println(a.lastIndexOf(50));

        // TO GET THE VALUE AT PERTICULLAR INDEX
        System.out.println(a.get(4));
        System.out.println(a.clone());

        // TO REMOVE ELEMENT
        System.out.println(a.remove(3));
        System.out.println(a.toString());

        // TO CHANGE THE VALUE OF ARRAY LIST AT GIVEN INDEX
        a.set(2,200);
        System.out.println((a.toString()));

        // To SORT ARRAY LIST
        java.util.Collections.sort(a);
        System.out.println(a.toString());

        //to find min and max in arraylist

        System.out.println(Collections.max(a));
        System.out.println(Collections.min(a));
    }
}
