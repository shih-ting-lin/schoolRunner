package com.tina.student;

public class SchoolRunner {
    public static void main(String[] args) {
        //改Student.pass就可以直接改pass
        Student.pass = 20;
        Student s = new Student("1","Tommy",35,73);
        s.print();
    }

}
