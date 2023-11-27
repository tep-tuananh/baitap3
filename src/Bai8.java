import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("\n-------PRACTICE-----------");
            System.out.println("1. In dãy số chia hết cho 2 và giảm dần");
            System.out.println("2. In các số nhỏ hơn n và tính tổng");
            System.out.println("3.In ra các ước chẵn của n");
            System.out.println("4.  In ra các ước lẻ và số lượng ước lẻ của n");
            System.out.println("5. In ra ước số lẻ lớn nhất của n");
            System.out.println("6. Thoát");
            System.out.println("Nhập số n: ");
            number = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập lựa chọn: ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    for (int i = number; i >= 0; i--) {
                        if (i % 2 == 0) {
                            System.out.printf(" %d \t", i);
                        }
                    }
                    break;
                case 2:
                    int sum = 0;
                    for (int i = 0; i < number; i++) {
                        System.out.printf("%d\t", i);
                        sum += i;
                    }
                    System.out.println("tổng giá trị nhỏ hơn n là:  " + sum);
                    break;
                case 3:
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0 && i % 2 == 0) {
                            System.out.printf("%d\t", i);
                        }
                    }
                    break;
                case 4:
                    int count = 0;
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0 && i % 2 != 0) {
                            count += 1;
                            System.out.printf("%d\t", i);
                        }
                    }
                    System.out.println(" Số lượng ước số lẻ là:  " + count);
                    break;
                case 5:
                    int USLLN = 1;// USLLN: Ước số lẻ lớn nhất
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0 && i % 2 == 1) {
                            USLLN = i;
                        }
                    }
                    System.out.println("Ước số lẻ  lớn nhất là : " + USLLN);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1-6");
            }
        } while (true);
    }
}
