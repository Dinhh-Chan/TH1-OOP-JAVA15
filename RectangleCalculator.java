public class RectangleCalculator {
    /*
     * Kiem tra xem 1 so co phai la so nguyen duong hay khong
     * @param number so can kiem tra
     * @return true neu number la so nguyen duong, nguoc lai la false 
     */
    public static boolean isPositiveInteger(int number){
        return number > 0;
    }
    public static void main(String[] args) {
        if (args.length !=2 ){
            System.out.println("Nhap 2 so chieu rong va chieu cao");
            return ;
        }
        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);
            if (isPositiveInteger(height) && isPositiveInteger(width)){
                int perimeter = 2* (width + height);
                int area = width* height;
                System.out.println("Chu vi hinh chu nhat: " + perimeter);
                System.out.println("Dien tich hinh chu nhat: " + area);

            }
            else {
                System.out.println("Chieu rong va chieu cao phai la cac so nguyen duong");
            }
            
        } catch(NumberFormatException e) {
            System.out.println("nhap so nguyen hop le");
        }
        
    }
        

}