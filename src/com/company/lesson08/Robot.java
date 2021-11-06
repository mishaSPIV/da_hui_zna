package com.company.lesson08;

public class Robot {
    String name;
    int age;
    int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }
    public Robot(){

    }

    public boolean fight(Robot Robot){
if(power>Robot.power){
    return true;
}
else {
    return false;
}


    }
}

