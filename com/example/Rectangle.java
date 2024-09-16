package com.example; 
public class Rectangle {
    private int width;
    private  int height;
    /*
     * Constructor de khoi tao doi tuong Rectangle voi chieu rong va chieu cao
     * @param width chieu rong cua hinh chu nhat
     * @param height chieu cao cua hinh chu nhat
     * 
     */
    public Rectangle (int width, int height){
        setWidth(width);
        setHeight(height);
    }
    /*
     * Getter cho thuoc tinh width 
     * @return chieu rong 
     */
    public int getWidth(){
        return width ;
    }
    /*
     * Setter cho thuoc tinh width kiem tra xem co phai la so nguyen duong khong
     * @param with chieu rong cua hinh nhu nhat
     */
    public void setWidth(int width){
        if (Common.isPositiveInteger(width)){
            this.width = width ;
        }else {
            System.out.println("Chieu rong phai la so nguyen duong");
        }
    }
    /*
     * Getter cho height 
     * 
     * @return chieu cao cua hinh chu nhat
     */
    public int getHeight(){
        return height;
    }
    public void setHeight(int height) {
        if (Common.isPositiveInteger(height)) {
            this.height = height;
        } else {
            System.out.println("Chiều cao phải là số nguyên dương.");
        }
    }

    /**
     * Phương thức tính chu vi của hình chữ nhật.
     * 
     * @return Chu vi hình chữ nhật
     */
    public int getPerimeter() {
        return 2 * (width + height);
    }

    /**
     * Phương thức tính diện tích của hình chữ nhật.
     * 
     * @return Diện tích hình chữ nhật
     */
    public int getArea() {
        return width * height;
    }

    // Chương trình chính để thử nghiệm
    public static void main(String[] args) {
        // Khởi tạo đối tượng Rectangle với width = 5 và height = 10
        Rectangle rectangle = new Rectangle(5, 10);

        // Hiển thị chu vi và diện tích
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
    }

}
