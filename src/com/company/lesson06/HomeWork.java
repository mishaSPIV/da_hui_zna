package com.company.lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int i = 0;


            if (m <=  (-1)){
                System.out.println(a + b + (-1));

            }else if (m >= 0 ) {
                System.out.println(a + b);
            }

    }
}

    /*     for (int i = 0;i <= m;i++){
        for (int j = 0;j <= n;j++){
            System.out.print(10+" " );
            j++;

        System.out.println(10+ " " );
        i++;*/



    /* for (int i = 0; i <= 100 ; i++) {
            System.out.println(i++);

        }*/
    /*int i = 0;
        while (i < n){
            System.out.print("pro ");
            i++;

     }*/
  /* for (int i = 0;i <= m;i++){
        for (int j = 0;j <= n;j++){
            System.out.print(10 );
            j++;
        }
        System.out.println(10 );
        i++;*/



