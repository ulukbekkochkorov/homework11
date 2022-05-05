package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle();
        int a = 9;
        int b = 8;
        int c = 10;
    int p = (a+b+c)/2;
    int i = (p*(p-a)*(p-b)*(p-c));
     double squer = Math.sqrt(i);
        System.out.println(squer);

    }
}
