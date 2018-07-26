package ru.job4j.btcmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bondarenko.n on 26.07.2018.
 * 3) Прочитайте из консоли BuffereReader’ом массив чисел переданных через запятую в одну строку. Из этого массива выведете только чётный.
 */
public class ReadNumbers {
    public void readToArrayAndPrint() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] strings = string.split(",");
        for (String str: strings) {
            int number = Integer.parseInt(str);
if(number%2 == 0) {
    System.out.print((number + " "));
                  }
                                  }
                                                          }

    public static void main(String[] args) throws IOException {
        new ReadNumbers().readToArrayAndPrint();
    }
}
