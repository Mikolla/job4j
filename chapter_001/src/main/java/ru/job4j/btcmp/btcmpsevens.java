package ru.job4j.btcmp;

import java.util.Scanner;

public class btcmpsevens {
    void quad() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(Math.pow(a,2));
    }

    public static void main(String[] args) {
        new btcmpsevens().quad();
    }
}
