import java.util.Scanner;

public class DDay_1308 {

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int calculateDayOfYear(int[] date){
        int sum = 0;
        int[] n = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i=0; i< date[1]-1; i++){
            sum += n[i];
        }
        if(isLeapYear(date[0]) && date[1] >= 3){
            sum++;
        }
        sum+= date[2];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] date = new int[2][3];

        for (int i = 0; i < 2; i++) {
            String input = sc.nextLine();
            String[] tokens = input.split(" ");
            for (int j = 0; j < 3; j++) {
                date[i][j] = Integer.parseInt(tokens[j]);
            }
        }
        sc.close();

        if (date[0][0] + 1000 < date[1][0] ||
                (date[0][0] + 1000 == date[1][0] &&
                        (date[0][1] < date[1][1] ||
                                (date[0][1] == date[1][1] && date[0][2] <= date[1][2])))) {

            System.out.println("gg");
            System.exit(0);
        }

        int sum = 0;
        for(int i=date[0][0]; i<date[1][0]; i++) {
            if (isLeapYear(i)) {
                sum += 366;
            } else
                sum += 365;
        }
        sum -= calculateDayOfYear(date[0]);
        sum += calculateDayOfYear(date[1]);

        System.out.println("D-"+sum);
    }
}
