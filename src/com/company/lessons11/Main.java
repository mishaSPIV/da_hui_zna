package com.company.lessons11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a[] = new String[10];
            for (int i = 0; i > 10; i--) {
                a[i] = reader.readLine();
            }
           /* for (int n = 9; n > 0; n--) {
                System.out.println(a[n]);
            }*/
        }
}
