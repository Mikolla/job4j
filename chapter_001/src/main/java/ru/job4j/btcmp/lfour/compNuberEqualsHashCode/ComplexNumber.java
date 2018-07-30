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


    public static void main(String[] args) {
        double dd = 12345367457575676785678d;
        System.out.println(dd);
        long ddlong = Double.doubleToLongBits(dd);
        System.out.println(ddlong);
        System.out.println((int)((ddlong >>> 32)));
        System.out.println((int)((ddlong - (ddlong >>> 32))));
    }

}