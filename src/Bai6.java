import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int number1 = 0, number2 = 0;
            System.out.println("\n-------CACULATOR----------");
            System.out.println("1.Tổng 2 số: ");
            System.out.println("2. Hiệu 2 số: ");
            System.out.println("3.Tích 2 số");
            System.out.println("4. Thương 2 sô");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7.Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.println("Nhập số nguyên thứ 1: ");
            number1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số nguyên thứ 2: ");
            number2 = Integer.parseInt(sc.nextLine());
            System.out.println("Lựa chọn của bạn: ");
            int luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    int tong = number1 + number2;
                    System.out.println("tong 2 số: " + tong);
                    break;
                case 2:
                    int hieu = number1 - number2;
                    System.out.println("Hiệu 2 số: " + hieu);
                    break;
                case 3:
                    int tich = number1 * number2;
                    break;
                case 4:
                    int thuong;
                    if (number2 == 0) {
                        System.out.println(" số b =0 : Nhập lại: ");
                        number2 = Integer.parseInt(sc.nextLine());
                    }
                    thuong = (number1 / number2);

                    System.out.println("số dư 2 số " + thuong);
                    break;
                case 5:
                        int soDu=number1/number2;
                    System.out.printf("số dư khi chia %d cho %d là : %d ",number1,number2,soDu);
                    break;
                case 6:
                    int UCLN;
                    if (number1 == 0 || number2 == 0) {
                        UCLN = number1 + number2;
                    } else {
                        while (number1 != number2) {
                            if (number1 > number2) {
                                number1 = number1 - number2;
                            } else {
                                number2 = number2 - number1;
                            }
                        }
                        UCLN = number1;
                    }
                    System.out.println("Ước chung lớn nhất: " + UCLN);
                    break;
                case 7:
                    int i=1;
                    while (true){
                        if(i%number1==0 && i%number2==0)
                        {
                            System.out.printf(" %d là bội chung nhỏ nhất của  %d và %d ",i,number1,number2);
                            break;
                        }
                        i=i+1;
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập t 1 đến 7");
            }
        } while (true);
    }
}

