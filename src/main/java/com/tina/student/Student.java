package com.tina.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

    public Student(String id,String name,int english,int math){
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        int average = getAverage();
        System.out.print(name+"\t"+id+"\t"+english+"\t"+math+
                "\t"+((getAverage()>=pass)? "pass": "failed"));
        char grading = 'A';
        switch (average/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.print("\t"+grading);
    }

    public int getAverage(){
        return ((english+math)/2);
    }
}

