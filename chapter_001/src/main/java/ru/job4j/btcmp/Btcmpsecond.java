package ru.job4j.btcmp;

/**
 * Created by bondarenko.n on 25.07.2018.
 */
public class Btcmpsecond {
    void prin() {
        String string = "Хочешь - решай задачи, не хочешь - решай нехотя";
        for (int i = 0; i < 16; i++) {
            System.out.println(string);
        }
    }
    public static void main(String[] args) {
        new Btcmpsecond().prin();
    }

}
