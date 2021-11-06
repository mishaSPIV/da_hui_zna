package com.company.lesson01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "KALYKULATOR";

        System.out.println(s);


        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(sum(a,b));


        }

    public static int sum (int b,int a) {
        int res1 = a + b;
        return res1;
    }
}
