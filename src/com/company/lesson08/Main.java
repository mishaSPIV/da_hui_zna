package com.company.lesson08;

public class Main {



    public static void main(String[] args) {
        Robot MAN = new Robot("hh",1,5);
        Robot MAN1 = new Robot("gt",2,7);
         System.out.println(MAN1.fight(MAN));
        System.out.println(MAN.name);
    }
}
