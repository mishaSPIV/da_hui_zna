package com.company.lessons11_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int num  = Integer.parseInt(reader.readLine());
            int num1  = Integer.parseInt(reader.readLine());
            int num2  = Integer.parseInt(reader.readLine());
            int num3  = Integer.parseInt(reader.readLine());
            int num4  = Integer.parseInt(reader.readLine());
            int[] arr = new int [5];
            String[] arra = new String[5];
            arr[0] = arra[0].length();
            arr[1] = arra[1].length();
            arr[2] = arra[2].length();
            arr[3] = arra[3].length();
            arr[4] = arra[4].length();
            System.out.println(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                
            }
         /**   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a[] = new String[4];
            for (int i = 0; i < 3; i++) {
                a[i] = reader.readLine();
            }
            for (int n = 4; n > 0; n--) {
                System.out.println(a[n]);
            }**/
        }
    }}
