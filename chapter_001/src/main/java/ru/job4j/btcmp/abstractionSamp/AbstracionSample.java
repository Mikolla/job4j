package ru.job4j.btcmp.abstractionSamp;

import javafx.scene.shape.Circle;
import ru.job4j.condition.Triangle;

public class AbstracionSample {

    static int staticInt = 5;
    static int changeInt(int a) {
        return a + a;
    }
    // абстрактный класс фигуры
    abstract class Figure{

        float x; // x-координата точки
        float y; // y-координата точки

        Figure(float x, float y){

            this.x=x;
            this.y=y;
        }
        // абстрактный метод для получения периметра
        public abstract float getPerimeter();
        // абстрактный метод для получения площади
        public abstract float getArea();
    }
    // производный класс прямоугольника
    class Rectangle extends Figure    {
        private float width;
        private float height;
        // конструктор с обращением к конструктору класса Figure
        Rectangle(float x, float y, float width, float height){
            super(x,y);
            this.width = width;
            this.height = height;
        }
        public float getPerimeter(){
            return width * 2 + height * 2;
        }

        public float getArea(){
            return width * height;
        }
    }

    public  class Triangle extends Figure {
        private float side;
        public Triangle(float x, float y, float side) {
            super(x, y);
            this.side = side;
        }

        @Override
        public float getPerimeter() {
            return 3 * side;
        }

        @Override
        public float getArea() {
            return side * side / 4 * (float) Math.cbrt( side );
        }
    }

    public class UserCircle extends Figure implements figureLocator {
        private float rad;

        public UserCircle(float x, float y, float rad) {
            super(x, y);
            this.rad = rad;
        }

        @Override
        public float getPerimeter() {
            return (float) (2 * Math.PI * rad);
        }

        @Override
        public float getArea() {
            return (float) (Math.PI * rad * rad);
        }

        @Override
        public void printLocation() {
            System.out.println("расположение окружности x = " + this.x + " y = " + this.y);
        }
    }

    public void abstractionTester() {
        Triangle triangle = new Triangle(0, 0, 4);
        System.out.println("Площадь треугольника = " + triangle.getArea() + System.lineSeparator() +
                           "Периметр треугольника = " + triangle.getPerimeter());
        Rectangle rectangle = new Rectangle(0, 0, 4, 5);
        System.out.println("Площадь прямоугольника = " + rectangle.getArea() + System.lineSeparator() +
                "Периметр прямоугольника = " + rectangle.getPerimeter());
        UserCircle circle = new UserCircle(3 , 6, 10);
        System.out.println("Площадь круга = " + circle.getArea() + System.lineSeparator() +
                "Периметр круга = " + circle.getPerimeter());
        circle.printLocation();
        System.out.println("static variable test print = " + staticInt);
        System.out.println("static method test = " + changeInt(3));

    }

    public interface figureLocator {
        void printLocation();
    }

    public static void main(String[] args) {
          new AbstracionSample().abstractionTester();
        System.out.println(staticInt);
        System.out.println(changeInt(3));
    }

}
/*

 */