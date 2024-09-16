package com.examplee;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo đối tượng Rectangle
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Hình chữ nhật:");
        System.out.println("Chu vi: " + rectangle.getPerimeter());
        System.out.println("Diện tích: " + rectangle.getArea());

        // Khởi tạo đối tượng Circle
        Shape circle = new Circle(7);
        System.out.println("Hình tròn:");
        System.out.println("Chu vi: " + circle.getPerimeter());
        System.out.println("Diện tích: " + circle.getArea());
    }
}
