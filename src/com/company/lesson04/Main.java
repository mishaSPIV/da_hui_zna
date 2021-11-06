package com.company.lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you're age");
        int num1  = Integer.parseInt(reader.readLine());
        int num2  = Integer.parseInt(reader.readLine());


       if (num1 < num2 ){
           System.out.println(num1);
       }else if (num1 > num2){
           System.out.println(num2);
       }else {
           System.out.println("ravny");
       }

    }
}
