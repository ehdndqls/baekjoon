import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        int i = 1, sum = 0;

        while(true){
            if(sum + i >= n) {
                break;
            }
            sum += i;
            i++;
        }

        int numerator, denominator;

        if(i % 2 == 0){
            numerator = n-sum;
            denominator = i + 1 - numerator;
        }
        else{
            denominator = n-sum;
            numerator = i + 1 - denominator;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
