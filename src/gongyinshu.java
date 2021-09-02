import java.util.Scanner;

public class gongyinshu {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner =new Scanner(System.in);
        a= scanner.nextInt();
        b= scanner.nextInt();
        while (a%b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        System.out.println("最大公因数为"+b);
    }
}
