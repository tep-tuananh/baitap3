import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int tich=1;
       do {
           System.out.println("Nhập n từ 1-> 9: ");
           number=Integer.parseInt(sc.nextLine());
       }while (1<=number && number>=9);

       for(int i=1;i<number;i++){
           System.out.printf("bảng cửu chương số %d \n",i);
           for(int j=1;j<=10;j++)
           {
               tich=i*j;
               System.out.printf(" %d x %d = %d \n",i,j,tich);
           }
           System.out.println("\t");
       }

    }
}
