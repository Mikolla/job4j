package ru.job4j.btcmp.checkTheSum;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by bondarenko.n on 06.08.2018.
 */
public class SumChecker {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // your implementation here
      /*  int bytes, sum = 0;
        while ((bytes = inputStream.read())!=-1) {
            sum = Integer.rotateLeft(sum,1)^bytes;
        }
        return sum; */

        int a = inputStream.read();
        int b = inputStream.read();
        int c = inputStream.read();

        int d = Integer.rotateLeft(0,1)^a;
        int e = Integer.rotateLeft(d,1)^b;
        int f = Integer.rotateLeft(e,1)^c;

        return f;


    }

    public static void main(String[] args) throws IOException {
        byte[] byteArr = new byte[] { 0x33, 0x45, 0x01 };
        InputStream is = new ByteArrayInputStream(byteArr);
        System.out.println(checkSumOfStream(is));
    }

}

