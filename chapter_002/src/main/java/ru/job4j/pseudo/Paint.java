//c:\projects\job4j>java -classpath C:\projects\job4j\chapter_002\target\classes ru.job4j.pseudo.Paint

package ru.job4j.pseudo;


public class Paint {
    public void draw(Shape shape) {
         System.out.println(shape.draw());  
    }
	
	public static void main(String[] args) {
        Paint paint = new Paint();
	    paint.draw(new Square());
		paint.draw(new Triangle());
    }

}