package com.company.lessons09_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int [] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;


        int [] arra = new int[10];
        arra[0] = 10;
        arra[1] = 9;
        arra[2] = 8;
        arra[3] = 7;
        arra[4] = 6;
        arra[5] = 5;
        arra[6] = 4;
        arra[7] = 3;
        arra[8] = 2;
        arra[9] = 1;

        int [] arre = new int[10];
        arre[0] = 10;
        arre[1] = 11;
        arre[2] = 12;
        arre[3] = 13;
        arre[4] = 14;
        arre[5] = 15;
        arre[6] = 16;
        arre[7] = 17;
        arre[8] = 18;
        arre[9] = 19;

        int [] arrw = new int[10];
        arrw[0] = 29;
        arrw[1] = 28;
        arrw[2] = 27;
        arrw[3] = 26;
        arrw[4] = 25;
        arrw[5] = 24;
        arrw[6] = 23;
        arrw[7] = 22;
        arrw[8] = 21;
        arrw[9] = 20;


    /**    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

       int [] arru = new int[5];
         arru[0] = num;
         arru[1] = num1;
         arru[2] = num2;
         arru[3] = num3;
         arru[4] = num4;
        System.out.println(arru[0]);
        System.out.println(arru[1]);
        System.out.println(arru[2]);
        System.out.println(arru[3]);
        System.out.println(arru[4]);**/



        int myArray[] = {3, 5, 7, 12};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);


        int[] nums = new int[]{1, 4, 2, 3};
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);


     /*   public static void initializeArray(int ) {
            int [] arrka = new int[10];
            arrka[0] = 1;
            arrka[1] = 2;
            arrka[2] = 3;
            arrka[3] = 4;
            arrka[4] = 5;
            arrka[5] = 6;
            arrka[6] = 7;
            arrka[7] = 8;
            arrka[8] = 9;
            arrka[9] = 10;


            int suma = 0;
            for (int i = 0; i < myArray.length; i++) {
                suma = suma + arrka[i];

        }
            System.out.println(suma);*/





    }
}
