package ru.job4j.btcmp.isPowerOfTwo;

/**
 * Created by bondarenko.n on 27.07.2018.
 */
public class isPowerOfTwoClass {
  /*  public static boolean isPowerOfTwo(int value) {

        while (value!=2) {
         if( value % 2 != 0  ) {return false;}
         value = value / 2;
        }
        return true; // you implementation here
    } */

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value))==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
