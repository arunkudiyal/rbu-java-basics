package com.company;

class A {
    private int data1; private String data2;
    A(int data1, String data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
    public int getData1() { return data1; }
    public String getData2() { return data2; }
    public void showDetails() {
        System.out.println("Data 1 - " + this.getData1() + " | Data 2 - " + this.getData2());
    }
}

class B extends A {
    boolean data3; float data4;
    B(int data1, String data2, boolean data3, float data4) {
        // this.data1 = data1;
        // this.data2 = data2;
        // super() :- To call the constructor of the parent
        super(data1, data2);
        this.data3 = data3;
        this.data4 = data4;
    }
    public void showDetails() {
        System.out.println("Data 1 - " + this.getData1() + " | Data 2 - " + this.getData2() + "| Data 3 - " + this.data3 + "| Data 4 - " + this.data4);
    }
}

class C extends B {
    int data5; int data6;
    C(int data1, String data2, boolean data3, float data4, int data5, int data6) {
        super(data1, data2, data3, data4);
        this.data5 = data5;
        this.data6 = data6;
    }
    public void showDetails() {
        System.out.println("Data 1 - " + this.getData1() + " | Data 2 - " + this.getData2() + "| Data 3 - " + this.data3 + "| Data 4 - " + this.data4 + "| Data 5 - " + this.data5 + "| Data 6 - " + this.data6);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        B objB = new B(10, "Object B", true, 3.14f);
        System.out.println(objB);                                               // Memory Address (Ref.)
        objB.showDetails();
        // Child Object -> Parent Properties / Parent Method
        System.out.println("Value of data 1 is - " + objB.getData1());
        System.out.println("Value of data 2 is - " + objB.getData2());

        C objC = new C(20, "Object C", false, 10.29f, 100, 200);
        objC.showDetails();

        A objA = new A(30, "objectA");
        objA.showDetails();

        // Upcasting
        A demoObj = new B(10, "Hello", true, 3.14f);
        A demoObj2 = new C(10, "Hello", true, 3.14f, 100, 200);
        demoObj.showDetails();
        demoObj2.showDetails();
    }
}
