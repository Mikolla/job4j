package ru.job4j.btcmp;

public class Btcmptherd {
    double radius;
    void printCircleLength(double radius) {
        System.out.println(2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        new Btcmptherd().printCircleLength(5);
    }
}
