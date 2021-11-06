package com.company.lesson09;

public class Main {
    public static void main(String[] args) {
        int a  = 40;
        int [] arr = new int [10];
        arr[0]= 30;
        arr[4] = 23;
        arr[2]= 124;
        System.out.println(arr.toString());
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        int [][] array = new int[2][3];
        for (int i = 0; i <  array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][i]);

            }
            
        }


    }
}
