package com.company.lesson02;

public class User {
    private   int age;
    private String name;
    private String passwortDate;

    public User(int age, String name, String passwortDate) {
        this.age = age;
        this.name = name;
        this.passwortDate = passwortDate;
    }

    public User(int age, String name){
       this.age  = age;
        this.name = name;
    }
    public int getAge(){

        return age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public  void talk (String str) {
        System.out.println(str);
    }

}
