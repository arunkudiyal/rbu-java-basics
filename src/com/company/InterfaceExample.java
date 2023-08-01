package com.company;

interface Test {
    // data of the interface is always static (does not change)
    int data1 = 100;
    // No constructors allowed in Interfaces :- Test() {}
    // No method in the interface can have a body i.e, method can only have signatures.
    // Methods :- Abstract Method
    public void display();
}

public class InterfaceExample {
    public static void main(String[] args) {

    }
}
