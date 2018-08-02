package ru.job4j.btcmp.lfour.compNuberEqualsHashCode;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        //1
        if (this == o) return true;
        //2

        if (o == null || getClass() != o.getClass()) return false;
        //3
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 &&
                Double.compare(that.im, im) == 0;
    }

   /* @Override
    public int hashCode() {

        return Objects.hash(re, im);
    }*/

    @Override
    public int hashCode() {
        int result = 17;
        long imlong = Double.doubleToLongBits(im);
        long relong = Double.doubleToLongBits(re);
        result = 37 * result + (int)(imlong - (imlong >>> 32));
        result = 37 * result + (int)(relong - (relong >>> 32));
       return result;

    }


    class B {

    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        int b = 4;
        System.out.println( a.equals(b));


      //  System.out.println(a.hashCode() == b.hashCode());
    }

}