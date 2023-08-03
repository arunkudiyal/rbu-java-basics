package com.company;

class First {
    private int data1; private String data2;
    First(int data1, String data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
    public int getData1() { return data1; }
    public String getData2() { return data2; }
    public void showDetails() {
        System.out.println("Data 1 - " + this.getData1() + " | Data 2 - " + this.getData2());
    }
}

interface Second {
    String data2 = "Hello World";
    public void showDetails();
}
interface Third {
    public void display();
}
class Demo extends First implements Second, Third {
    Demo(int data1, String data2) {
        super(data1, data2);
    }
    public void showDetails() {
        System.out.println("Demo implemented Second");
    }
    public void display() { System.out.println("Demo implemented Third"); }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Demo demoObj = new Demo(20, "Hello");
        demoObj.showDetails();
    }
}
