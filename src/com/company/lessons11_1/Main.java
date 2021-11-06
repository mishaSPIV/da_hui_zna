package com.company.lessons11_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] seasons  = new String[] {"1", "2", "3", "4","5","6","7","8","9","10"};
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(seasons[i]);
        }
    }
}
