package com.example;

public class Circle {

    // Thuộc tính bán kính (radius)
    private int radius;

    /**
     * Constructor khởi tạo đối tượng Circle với bán kính.
     * 
     * @param radius bán kính của hình tròn
     */
    public Circle(int radius) {
        setRadius(radius); // Sử dụng setter để áp dụng kiểm tra
    }

    /**
     * Getter cho thuộc tính radius.
     * 
     * @return bán kính của hình tròn
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Setter cho thuộc tính radius, kiểm tra radius có phải là số nguyên dương hay
     * không.
     * 
     * @param radius bán kính của hình tròn
     */
    public void setRadius(int radius) {
        if (Common.isPositiveInteger(radius)) {
            this.radius = radius;
        } else {
            System.out.println("Bán kính phải là số nguyên dương.");
        }
    }

    /**
     * Phương thức tính chu vi hình tròn.
     * 
     * @return Chu vi của hình tròn
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Phương thức tính diện tích hình tròn.
     * 
     * @return Diện tích của hình tròn
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Chương trình chính để thử nghiệm
    public static void main(String[] args) {
        // Khởi tạo đối tượng Circle với bán kính 5
        Circle circle = new Circle(5);

        // Hiển thị chu vi và diện tích
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
        System.out.println("Diện tích hình tròn: " + circle.getArea());
    }
}
