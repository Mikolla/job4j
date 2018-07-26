package ru.job4j.btcmp;

/**
 * Created by bondarenko.n on 26.07.2018.
 * 2) Создай-те класс Human в котором опишите основные свойства человека. А так же реализуйте метод sayHello у человека,
 * который выводит “Привет” на экран.
 * Создайте 10 экземпляров человека, добавьте их в массив. И с помощью цикла у каждого экземпляра человека вызовите метод sayHello
 */
public class Human {
    int age;
    int height;
    String name;

    public Human(int age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    void sayHello() {
        System.out.println("Привет мне лет - " + age + "рост - " + height);
    }




    public static void main(String[] args) {

        Human[] H = new Human[10];
        H[0] = new Human(10, 151, "Vasya1");
        H[1] = new Human(11, 152, "Vasya2");
        H[2] = new Human(12, 153, "Vasya3");
        H[3] = new Human(13, 154, "Vasya4");
        H[4] = new Human(14, 155, "Vasya5");
        H[5] = new Human(15, 156, "Vasya6");
        H[6] = new Human(16, 157, "Vasya7");
        H[7] = new Human(17, 158, "Vasya8");
        H[8] = new Human(18, 159, "Vasya9");
        H[9] = new Human(19, 160, "Vasya10");

        for (Human h : H) {
            h.sayHello();
        }

        int[] h2 = {1,2,3,4,5,6};

    }
}
