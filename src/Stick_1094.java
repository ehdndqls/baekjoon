import java.util.Scanner;

public class Stick_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        sc.close();

        System.out.println(Integer.bitCount(num));

    }
}
