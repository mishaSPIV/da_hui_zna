package com.company.lesson04;

public class HomeWork {
    public static void main(String[] args) {
        int res1 = sum(23,23);
        int res2 = multy(23,23);
        int res3 = sublt(23,23);
        int res4 = div(23,23);
        System.out.println(res1 +" "+ res2 + " " + res3 + " " + res4 );

        double ris = convert(43);
        double ris1 = percent(23);
        System.out.println(ris);
        System.out.println(ris1);
        print("eblan");

    }




    public static int sum (int b,int a) {
        int res1 = a + b;
        return res1;
    }
    public static int multy (int b,int a) {
        int res2 = a * b;
        return res2;
    }
    public static int sublt (int b,int a) {
        int res3 = a - b;
        return res3;
    }
    public static int div (int b,int a) {
        int res4 = a / b;
        return res4;
    }
    public static double convert (int a) {
        double res4 = a * 0.85;
        return res4;
    }
    public static double percent (int a){
        double res =  a * 1.10;
        return res;
    }
    public static void print (String s){
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

    }
}
