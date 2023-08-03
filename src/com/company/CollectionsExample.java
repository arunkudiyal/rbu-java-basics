package com.company;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        // ArrayList<Type(WrapperClass)> objectName = new constructor<>();
        // ArrayList<Integer> al = new ArrayList<>();               // size = 10
        //        ArrayList<Integer> al = new ArrayList<>(5);     // size = 5
        //        // List<String> al3 = new Vector<>();
        //        ArrayList<Integer> al2 = new ArrayList<>();
        //
        //        // ArrayList Object -> Methods
        //        System.out.println(al.add(100));                        // i = 0
        //        al.add(200);
        //        al.add(300);
        //        al.add(400);                        // i = 3
        //        al.add(500);
        //        al.add(600);                        // i = 5
        //        System.out.println(al);
        //
        //        // Iterator Class
        //        Iterator itr = al.iterator();
        //        //        for(; itr.hasNext();) {
        //        //
        //        //        }
        //        while(itr.hasNext()) {
        //            System.out.print(itr.next() + " ");
        //        }
        //        System.out.println();
        //
        //        al.add(3, 350);
        //        System.out.println(al);
        //
        //        // al.add(10, 1000);               // Not possible
        //        // System.out.println(al);
        //        System.out.println(al2);
        //        al2.add(1);
        //        al2.add(2);
        //        al2.add(3);
        //        System.out.println(al2);
        //
        //        // al2.addAll(al);
        //        al2.addAll(1, al);
        //        System.out.println(al2);
        //
        //        System.out.println(al.size());
        //        System.out.println(al2.size());
        //
        //        // Remove
        //        // Integer toRemove = new Integer(100);
        //        System.out.println(al.remove(new Integer(100)));
        //        System.out.println(al);
        //
        //        System.out.println(al.remove(3));
        //        System.out.println(al);
        //
        //        System.out.println(al.contains(100));
        //        System.out.println(al.contains(200));
        //
        //        ArrayList<Integer> demo = new ArrayList<>();
        //        demo.add(350);
        //        demo.add(500);
        //        al.retainAll(demo);
        //        System.out.println(al);
        //
        //        // Vectors
        //        List<String> v = new Vector<>(6);
        //        v.add("First");
        //        v.add("Second");
        //        v.add("Third");
        //        v.add("Fourth");
        //        System.out.println(v);


        // STACK :- LIFO (Last In, First Out)
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        System.out.println(stack);
        System.out.println("Element popped - " +  stack.pop());
        System.out.println(stack);
        System.out.println("Element on the top of the stack - " +stack.peek());
        System.out.println(stack);
    }
}
