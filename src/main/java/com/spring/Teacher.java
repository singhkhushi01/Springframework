package com.spring;

public class Teacher implements School {
    public String course;
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }


    public void detail(){
        System.out.println("Teacher detail");
    }
}
