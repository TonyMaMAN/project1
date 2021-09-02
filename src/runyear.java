import java.util.Scanner;

    public class runyear {


        public static void main(String[] args) {
            Scanner year1 = new Scanner(System.in);
            int a = year1.nextInt();
            int b = 0;
            int c=a+100;
            while (a<=c){
                if (a % 4 == 0 | a % 400 == 0) {
                    b=b+1;
                    System.out.println(a);
                }
                a=a+1;
            }
            System.out.println("可以度过"+b+"个闰年");
        }
    }

