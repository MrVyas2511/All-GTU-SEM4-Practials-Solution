package com.company;

class stack {
    private int[] s;
    private int top = -1;

    stack() {
        s = new int[16];
        System.out.println("--> Stack is created");
    }

    stack(int x) {
        s = new int[x];
        System.out.println("--> Stack is created");
    }

    public boolean ISempty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public void push(int x) {
        if (top == s.length)
            System.out.println("--> Stack is overflow!!");
        else
            top++;

        s[top] = x;
        System.out.println("--> Push operation execute successfully");
    }

    public void pop() {
        if (top == -1)
            System.out.println("--> Stack is Underflow!!");
        else
            top--;
        System.out.println("--> pop operation execute successfully");

    }

    public void display() {
        System.out.print("--> Element in Stack is :  ");
        if (top == -1)
            System.out.println("--> Stack is Empty");
        else
            for (int i = 0; i <= top; i++)
                System.out.print(s[i] + " ");
        System.out.println();
    }

    public void peep() {
        System.out.println("--> peek value is " + s[top]);
    }

    public void getsize() {
        System.out.println("--> Size of stack is " + top);
    }

}

public class OOP_Stack {

    public static void main(String[] args) {
        stack s = new stack();

        s.display();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        s.peep();
        System.out.println("--> Is stack is emplty ?  " + s.ISempty());
        s.getsize();
    }
}
