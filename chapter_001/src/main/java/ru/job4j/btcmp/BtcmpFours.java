package ru.job4j.btcmp;

/**
 * Created by bondarenko.n on 25.07.2018.
 * 5)Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия.
 * Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
 Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
 TC = (TF – 32) * 5/9. F = Цельсий х 1,8 + 32
 Пример:
 В метод convertCelsiumToFahrenheit на вход подается значение 40.
 Пример вывода:
 104.0
 Требования:
 1. Метод convertCelsiumToFahrenheit(int) должен быть публичным и статическим.
 2. Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
 3. Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
 4. Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия в градусы Фаренгейта и возвращать это число.
 */
public class BtcmpFours {
    int celsium;
    public static Double convertCelsiumToFahrenheit(int celsium) {
        return  celsium * 1.8 + 32;
    }

    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

}
