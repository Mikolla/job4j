package ru.job4j.condition;

/**
 * Метод вычисления площади треугольника по формуле Герона.
 * @author Bondarenko Nikolay.
 * @sinse 8.6.18.
 */


public class Triangle {
  private Point a;
  private Point b;
  private Point c;

    /**
     * @param Point A.
     * @param Point B.
     * @param Point C.
     */

    public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }


    /**
     * Метод вычисления полупериметра по длинам сторон.
     * Формула (ab + ac + bc) / 2.
     * @param ab расстояние между точками a b.
     * @param ac расстояние между точками a c.
     * @param bc расстояние между точками b c.
     * @return Периметр/2.
     */

    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод проверка существования треугольника.
     * Любая сторона не более суммы 2-х других.
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return true or false.
     */

    public boolean exist(double ab, double ac, double bc) {
        return   ab < (ac + bc) && ac < (ab + bc) && bc < (ab + ac);
    }


 /**
  * Метод расчета площади треугольника.
  * @return double Площадь треугольника.
  */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {

            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }



    public static void main(String[] args) {
        System.out.println("triangle");

        Point a = new Point(0, 3);
        Point b = new Point(4, 0);
        Point c = new Point(0, 0);

        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.area());

    }
  
}