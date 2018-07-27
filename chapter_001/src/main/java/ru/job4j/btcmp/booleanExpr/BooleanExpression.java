package ru.job4j.btcmp.booleanExpr;

public class BooleanExpression {
  /*  public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean[] booleans = {a,b,c,d};
        int count=0;
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i] == true) {
                count+=1;
            }
        }
        return count == 2 ? true : false;
    } */

   /* public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return ( (!a)&&(!b)&&(c)&&(d) )  ^
           ( (!a)&&(b)&&(!c)&&(d) )  ^
           ( (!a)&&(b)&&(c)&&(!d) )  ^
           ( (a)&&(!b)&&(!c)&&(d) )  ^
           ( (a)&&(!b)&&(c)&&(!d) )  ^
           ( (a)&&(b)&&(!c)&&(!d) );
    } */

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
      //  return ((a^b)&&(c^d))|((a^c)&&(b^d));
        return (a ^ b) & (c ^ d) | (a ^ c) & (b ^ d);


    }


    public static void main(String[] args) {
        System.out.println(booleanExpression(true,true,true, true));
        System.out.println(booleanExpression(true,true,false, false));
        System.out.println(booleanExpression(true,false,true, true));
        System.out.println(booleanExpression(false,false,false, true));

    }
}
