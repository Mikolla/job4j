package ru.job4j.btcmp.abstractionSamp;

public class AbstracionSample {
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
    class Rectangle extends Figure
    {
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
}
/*
Ключевое слово enum создает новый тип с ограниченным набором именованных значений,
и работать с этими значениями можно как с обычными компонентами программы.

При создании перечисления компилятор генерирует соответствующий класс.
Этот класс автоматически наследует от класса java.lang.Enum.
 Элементы enum это статически доступные экземпляры enum-класса.

 Метод values() создает массив констант перечисления, следующих в порядке их объявления
 Метод ordinal() возвращает значение int, определяющее порядок объявления экземпляров перечисления начиная с нуля.

 Элементы enum Season (WINTER, SPRING и т.д.) - это статически доступные экземпляры enum-класса Season.



 В абстрактном классе также можно определить поля и методы, в то же время нельзя создать объект или экземпляр абстрактного класса.
 Кроме обычных методов абстрактный класс может содержать абстрактные методы.
 Такие методы определяются с помощью ключевого слова abstract и не имеют никакого функционала:

public abstract void display();

Производный класс обязан переопределить и реализовать все абстрактные методы, которые имеются в базовом абстрактном классе.
Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, то данный класс должен быть определен как абстрактный.
Абстрактные классы нужны, чтобы, например, иметь возможность нааписать метод фигура для все фигур.
Самой фигуры нет, но есть конкретные прямоугольники и квадраты, треугольники, которые могут быть наследниками фигуры,
где будут переопределены такие методы, как вычисление площади и периметра, например.
 */