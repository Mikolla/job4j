package ru.job4j.btcmp;

/**
 * Created by bondarenko.n on 26.07.2018.
 * 2) Создай-те класс Human в котором опишите основные свойства человека. А так же реализуйте метод sayHello у человека,
 * который выводит “Привет” на экран.
 * Создайте 10 экземпляров человека, добавьте их в массив. И с помощью цикла у каждого экземпляра человека вызовите метод sayHello
 */
public class HumanSayHello {

    private class Human {
        int age;
        int height;
        String name;

        public Human(int age, int height, String name) {
            this.age = age;
            this.height = height;
            this.name = name;
        }

        void sayHello() {
            System.out.println("Привет");
        }

    }

    public void main(String[] args) {
        Human human = new Human(1,3, "Vasya");
    }

}
