package com.akshit.mydbsqlite;

public class StudentRec {
    int id;
    String name;
    String course;
    //############PARAMETRIZED CONSTRUTOR##############################
    public StudentRec(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
//#############################GETTER AND SETTERS########################3

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public StudentRec(int id) {
        this.id = id;
    }
    //#########DEFAULT CONSTRUCTOR#############
    public StudentRec()
    {

    }


}
