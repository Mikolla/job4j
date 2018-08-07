package ru.job4j.btcmp.doubleParserAndSummer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by bondarenko.n on 07.08.2018.
 * -1e3
 18 .111 11bbb
 */
public class ParserSummer {
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("en"));
        double sum = 0;
        while(scanner.hasNext()) {
            String scanned = scanner.next();
           try { double a = Double.parseDouble(scanned);
            sum += a; }
            catch (Exception e) {}
        }
        System.out.printf("%f", sum);
    } */


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringBuilder sb = new StringBuilder(str);
        while ((str = reader.readLine())!=null)
        {
            sb.append(str).append(System.lineSeparator());
        }
        String[] strings = sb.toString().split("\\s+");
       double sum = 0;
        for (String s : strings) {
            try {
                sum += Double.parseDouble(s);
            } catch (Exception e) {
                // ignore
            }
            System.out.println(s);
        }
        System.out.printf("%f", sum);
    }

}
