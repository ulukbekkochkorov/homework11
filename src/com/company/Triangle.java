package com.company;

public class Triangle {
    int a;
    int b;
    int c;

    void area() {
        int p = (a + b + c) / 2;
        int i = (p * (p - a) * (p - b) * (p - c));
        double squer = Math.sqrt(i);
        System.out.println(squer);
    }
}
