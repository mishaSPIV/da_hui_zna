package com.company.lesson08_1;

public class Main {
    public static void main(String[] args) {
        Woman wom = new Woman("Toma",25);
       Cat cat = new Cat("lug",11,"ksdf;jdsl");
        System.out.println(cat.name  + " owner " +  wom.name);
        Dog dog = new Dog("Dshon",4,"");
        System.out.println(dog.name + " owner " + wom.name);
        Fish fish = new Fish("hui",23,"sad");
        System.out.println(fish.name + " owner " +wom.name);




    }

}
