package com.tina.student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 70;

    public GraduateStudent(String id, String name, int english, int math, int thesis){
        super(id, name, english, math);
        this.thesis = thesis;
    }


}
