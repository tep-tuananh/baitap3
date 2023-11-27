import java.util.Enumeration;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=0;
        do {
            System.out.println("Nhập các s nguyên: ");
             number=Integer.parseInt(sc.nextLine());
            if(number%3 == 0){
                System.err.printf(" %d là số chia hết cho 3 \n",number);
            }
        }while (number!=0);

    }
}
