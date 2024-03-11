import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to add (+) your numbers then press 1");
        System.out.println("You want to Subtract (-) your numbers then press 2");
        System.out.println("You want to Multiply (*) your numbers then press 3");
        System.out.println("You want to Divide (/) your numbers then press 4");
        System.out.println("You want to Modulus (%) your numbers then press 5");
        int a = sc.nextInt();
        if (a == 1 && a == 2 && a == 3 && a == 4 && a == 5) {
        } else {
            System.out.println("Your Choice is invalid");
        }
        System.out.println("Enter Your First No");
        int i = sc.nextInt();
        System.out.println("Enter Your Second No");
        int j = sc.nextInt();
        int z = i + j;
        int f = i - j;
        int b = i * j;
        int c = i / j;
        int d = i % j;
        if (a == 1) {
            System.out.println("Your Answer is: " + z);
        } else if (a == 2) {
            System.out.println("Your Answer is: " + f);
        } else if (a == 3) {
            System.out.println("Your Answer is: " + b);
        } else if (a == 4) {
            System.out.println("Your Answer is: " + c);
        } else if (a == 5) {
            System.out.println("Your Answer is: " + d);
        } else {
            System.out.println("Thanks for Using");
        }
        sc.close();
    }

}
