import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("--------------Menu-------");
        System.out.println("1. Phở tôm hùm");
        System.out.println("2. Phở bò Kobe");
        System.out.println("3.Phở gà Việt Nam");
        System.out.println("4. Xôi trứng thịt");
        System.out.println("5. Bánh mì trứng");
        System.out.println("6.Mì tôm không nguười lái");
        System.out.println("7. Thoát");
        System.out.println("Nhập lựa chọn món: ");
        int n = Integer.parseInt(sc.nextLine());
        switch (n) {
            case 1:
                System.out.println(" Bạn vừa chọn món Phở tôm hùm, Vui lòng đợi");
                break;
            case 2:
                System.out.println(" Bạn vừa chọn món Phở bò Kobe, Vui lòng đợi");
                break;
            case 3:
                System.out.println(" Bạn vừa chọn món Phở gà Việt Nam, Vui lòng đợi");
                break;
            case 4:
                System.out.println(" Bạn vừa chọn món Xôi trứng thịt, Vui lòng đợi");
                break;
            case 5:
                System.out.println(" Bạn vừa chọn món XBánh mì trứng, Vui lòng đợi");
                break;
            case 6:
                System.out.println(" Bạn vừa chọn món Mì tôm không nguười lái, Vui lòng đợi");
                break;
            case 7:
                System.exit(0);
            default:
                System.err.println("Bạn nhập sai! hãy chọn từ 1-7");
        }
    }
}
