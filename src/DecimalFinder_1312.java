import java.util.Scanner;

public class DecimalFinder_1312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        int decimalPlace = sc.nextInt();

        sc.close();

        int remainder = numerator % denominator;

        // N번째 소수점 자리 찾기
        for (int i = 0; i < decimalPlace; i++) {
            remainder *= 10;  // 자리 이동
            int digit = remainder / denominator; // 현재 자리 숫자
            remainder %= denominator; // 새로운 나머지 업데이트

            if (i == decimalPlace - 1) {
                System.out.println(digit);
            }
        }
    }
}
