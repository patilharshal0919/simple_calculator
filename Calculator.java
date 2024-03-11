import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to add (+) your numbers then press 1");
        System.out.println("You want to Subtract (-) your numbers then press 2");
        System.out.println("You want to Multiply (*) your numbers then press 3");
        System.out.println("You want to Divide (/) your numbers then press 4");
        System.out.println("You want to Modulus (%) your numbers then press 5");
        int a = sc.nextInt();
        System.out.println("Enter Your First No");
        int i = sc.nextInt();
        System.out.println("Enter Your Second No");
        int j = sc.nextInt();
        switch (a) {
            case 1:
                a = 1;
                int z = i + j;
                System.out.println("Your Answer is: " + z);
                break;
            case 2:
                a = 2;
                int f = i - j;
                System.out.println("Your Answer is: " + f);
                break;
            case 3:
                a = 3;
                int b = i * j;
                System.out.println("Your Answer is: " + b);
                break;
            case 4:
                a = 4;
                int c = i / j;
                System.out.println("Your Answer is: " + c);
                break;
            case 5:
                a = 5;
                int d = i % j;
                System.out.println("Your Answer is: " + d);
                break;
            default:
                System.out.println("Your Choice is Invalid");
                break;
        }
        sc.close();
    }
}
