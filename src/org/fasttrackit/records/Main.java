package org.fasttrackit.records;

public class Main {
    public static void main(String[] args) {
        ExchangeStudent exchangeStudent = new ExchangeStudent(new Student("John", 20), "Canada");
        exchangeStudent.student().age();
        Student student = new Student("John", 20);
        student = birthday(student);

        System.out.println(student.name() + " has age " + student.age());
        System.out.println(student);

//        int a = 10;
//        a = increment(a);
//        System.out.println("outside " + a);
//        a++;
//        System.out.println("outside " + a);
//        SimpleObject simpleObject = new SimpleObject(10);
//        incrementObject(simpleObject);
//        System.out.println("outside " + simpleObject);
    }

    public static Student birthday(Student s){
        Student newStudent = new Student(s.name(), s.age()+1);
        System.out.println(newStudent.age());
        return newStudent;
    }

    public static int increment(int a) {
        a++;
        System.out.println("inside " + a);
        return a;
    }

    public static void incrementObject(SimpleObject b) {
        b.setA(11);
        System.out.println("inside " + b);
    }
}
