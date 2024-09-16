public class Rectangle {
    private int width;
    private  int height;
    /*
     * Constructor de khoi tao doi tuong Rectangle voi chieu rong va chieu cao
     * 
     * @param width chieu rong cua hinh chu nhat
     * @param height chieu cao cua hinh chu nhat
     */
    public Rectangle (int width, int height){
        this.width= width;
        this.height= height;
    }
    /*
     * Phuong thuc tinh chu vi hinh chu nhat
     * @return Chu vi hinh chu nhat
     */
    public int getPerimeter(){
        return 2 *(width + height);
    }
    /*
     * Phuong thuc tinh dien tich hinh chu nhat
     * @return dien tich hinh chu nhat
     */
    public int getArea(){
        return width * height ;
    }
    // ham kiem tra so nguyen duong
    public static boolean  isPositiveInteger(int number){
        return number >0 ;
    }
    public static void main(String[] args) {
        //kiem tra xem co du 2 tham so truyen vao tu dong lenh hay khong
        if (args.length != 2 ){
            System.out.println("Nhap 2 tham so");
            return ;
        }
        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);
            if (isPositiveInteger(width)&& isPositiveInteger(height)){
                Rectangle rectangle = new Rectangle(width, height); 
                System.out.println("Chu vi hinh chu nhat: "+ rectangle.getPerimeter());
                System.out.println("Dien tich hinh chu nhat: "+ rectangle.getArea());
            }
        } catch (NumberFormatException e) {
                // Bắt lỗi nếu các tham số không phải là số nguyên hợp lệ
                System.out.println("Vui lòng nhập các số nguyên hợp lệ cho chiều rộng và chiều cao.");
      
        }
    }
    
}
