package com.company.lessons10_1;

public class Human extends Object{


        private String name;
    private int age;
    private String pol;
    private String mather;
    private String father;


    public Human(String name, int age, String pol ,String mather, String father) {
        this.name = name;
        this.age = age;
        this.pol = pol;
        this.mather = mather;
        this.father = father;

    }

    public Human(String name, int age,String pol) {
        this.name = name;
        this.age = age;
        this.pol = pol;
    }

    public Human() {

    }

    @Override
    public String toString() {
        return name + " pol " + pol + " vozrast" + age  ;
    }
}
