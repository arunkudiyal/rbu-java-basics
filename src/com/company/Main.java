package com.company;
// POJO :- Plain Old Java Object
class Student {
    // Properties | Attributes
    // private -> data/methods value can not be used outside the scope of the class
     private int r_no;
     private int age;
     String name;
     private String standard;
    // Methods | Functions
    // Constructor
    Student(int r_no, int age, String name, String standard) {
        // data = parameter
        this.r_no = r_no;
        this.name = name;
        this.age = age;
        this.standard = standard;
    }
    Student(String name, String standard) {
        this.name = name;
        this.standard = standard;
    }
    Student(int r_no, int age) {
        this.r_no = r_no;
        this.age = age;
    }
    // Getters -> Functions which helps you to read any property of the class
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public int getR_no() { return this.r_no; }
    public String getStandard() { return this.standard; }
    // Setters
    public void setName(String newName) { this.name = newName; }
    public void setR_no(int r_no) {this.r_no = r_no;}
    public void setAge(int age) { this.age = age; }
    public void setStandard(String standard) { this.standard = standard; }
    // Polymorphism :- poly (many), morph (forms)
    public void display(int para1) {
        System.out.println("Student Name : " + this.name + " | Student Standard : " + this.standard);
    }
    public void display(String para2) {
        System.out.println("Student RNo : " + this.r_no + " | Student Age : " + this.age);
    }
}

class Main {
    public static void print() {
        System.out.println("Printing...");
    }
    public static void main(String[] args) {
        // ClassName objectName = new Constructor();
        String s;
        Student student1 = new Student(65, 21, "Student One", "10th");               // Heap Memory
        student1.name = "Student - 1";
        // student1.setName("Student - 1");
        System.out.println(student1.getName());

        Student student2 = new Student("Student Two", "12th");                                                                   // 0

        Student student3 = new Student(90, 19);

        student1.display(100);                      // name, standard
        student1.display("Hello");                  // rno, age
    }
}