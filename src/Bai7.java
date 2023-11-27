import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1=0, number2=0,number3=0;
        do {
            System.out.println("------CACULATOR-----------");
            System.out.println("1. Tổng 3 số nguyên");
            System.out.println("2. Trung bình cộng của 3 số nguyên");
            System.out.println("3. Số lớn nhất nhỏ nhất trong 3 số nguyên");
            System.out.println("4. Thoát");
            System.out.println("Nhập số thứ 1: ");
            number1=Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số thứ 2: ");
            number2=Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số thứ 3: ");
            number3=Integer.parseInt(sc.nextLine());
            System.out.println("Mới bạn nhập lựa chọn:  ");
            int choise=Integer.parseInt(sc.nextLine());
            switch (choise){
                case 1:
                    int sum=0;
                    sum=number1+number2+number3;
                    System.out.println("Tổng 3 số:"+sum);
                    break;
                case 2:
                    float avgMark=0;
                    avgMark=(float) (number1+number2+number3)/3;
                    System.out.println("Trung bình cộng 2 số: "+avgMark);
                    break;
                case 3:
                    int max=number1,min=number1;
                    if(max<number2){
                        max=number2;
                    }
                    if(max<number3){
                        max=number3;
                    }
                    if(min>number2)
                    {
                        min=number2;
                    }
                    if(min>number3){
                        min=number3;
                    }
                    System.out.println("giá trị lớn nhất: "+max+" giá trị nhỏ nhất: "+min);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1-4:");
            }
        }while (true);
    }
}
