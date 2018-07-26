package ru.job4j.btcmp;

public class BtcmpFours {
    int celsium;
    public static Double convertCelsiumToFahrenheit(int celsium) {
        return  celsium * 1.8 + 32;
    }

    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }
}
