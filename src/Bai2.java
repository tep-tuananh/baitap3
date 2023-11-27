import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=1;
        int sum=0;
        do{
            System.out.println("Nhập số nguyen: ");
            number=Integer.parseInt(sc.nextLine());
            if(number%2!=0){
                sum+=number;
            }
        }while (number!=0);
        System.out.println(" TỔng các số lẻ: "+sum);

    }
}
