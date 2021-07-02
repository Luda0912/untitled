package com.company;

public class Main {

    public static void myMethod(int a) {

        int b=3;
        int d=a%b;
        if (d == 0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static void main(String[] args){
        myMethod(9);
        myMethod(25);
        myMethod(102);
    }
}
