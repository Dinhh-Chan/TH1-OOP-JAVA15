package com.exampleee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách chứa các đối tượng Shape
        ArrayList<Shape> shapes = new ArrayList<>();

        // Thêm các đối tượng hình chữ nhật và hình tròn vào danh sách
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Circle(7));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Circle(2));

        // Biến để lưu tổng diện tích và chu vi
        double totalPerimeter = 0;
        double totalArea = 0;

        // Duyệt qua danh sách và tính tổng diện tích và chu vi
        for (Shape shape : shapes) {
            totalPerimeter += shape.getPerimeter();
            totalArea += shape.getArea();
        }

        // Hiển thị kết quả
        System.out.println("Tổng chu vi của tất cả các hình: " + totalPerimeter);
        System.out.println("Tổng diện tích của tất cả các hình: " + totalArea);
    }
}
