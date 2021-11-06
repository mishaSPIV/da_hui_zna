package com.company.lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        int num1 = Integer.parseInt(reader.readLine());
        closeToFive(num,num1);






    /*    if (num <= (-1)){
            System.out.println(num + 10);
        }else if (num >= 1 ){
            System.out.println(num * 2);
        }else {
            System.out.println("poprobuy che ras loh");*/
        }
    /*    System.out.println("Enter two numbers: ");
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());


        if (num1 > num2 && num1 < num3 ){
            System.out.println(num1);


        }else if (num1 < num2 && num2 < num3 ) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
        capaire(num);*/


 /*   public static int capaire(int a) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        if (num < 5 ){
            System.out.println("число менше 5");
        }else if(num > 5 ){
            System.out.println("число больше 5");
        }else if (num == 5){
            System.out.println("число равно 5");
        }
        return num;
    }*/
  /*  public static int checkInterval (int a){
        if (a >= 20 && a <= 50){
            System.out.println("chislo sodershitsa v intervale");
        }else {
            System.out.println("chislo ne sodershitsa v intervale ");
        }
        return a;
    }*/
    public  static void closeToFive (int a,int b){
        if (abc(a-10)<(10-b)){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

    }
    public static int abc(int a){
        if (a < 0){
            return  -a;

        }
        else {
            return a;
        }
    }
}

