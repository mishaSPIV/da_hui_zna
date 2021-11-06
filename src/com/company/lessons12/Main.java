package com.company.lessons12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num  = Integer.parseInt(reader.readLine());
        int num1  = Integer.parseInt(reader.readLine());
        int num2  = Integer.parseInt(reader.readLine());
        int num3  = Integer.parseInt(reader.readLine());
        int num4  = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());
        int num6  = Integer.parseInt(reader.readLine());
        int num7  = Integer.parseInt(reader.readLine());
        int num8  = Integer.parseInt(reader.readLine());
        int num9  = Integer.parseInt(reader.readLine());
        int[] arr = new int [10];
        arr[0]= num;
        arr[1]= num1;
        arr[2]= num2;
        arr[3]= num3;
        arr[4]= num4;
        arr[5]= num5;
        arr[6]= num6;
        arr[7]= num7;
        arr[8]= num8;
        arr[9]= num9;

        int[] wor = new int []{arr[0], arr[1], arr[2], arr[3], arr[4]};

        int[] wop =  new int []{arr[5], arr[6], arr[7], arr[8], arr[9]};


        System.out.println();

        for (int i = 0; i < wop.length; i++) {

            System.out.println(wop[i]);

        }
    }
}
