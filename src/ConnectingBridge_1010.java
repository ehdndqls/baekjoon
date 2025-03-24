import java.util.Scanner;

public class ConnectingBridge_1010 {

    int westSide, eastSide;

    public ConnectingBridge_1010(int westSide, int eastSide) {
        this.westSide = westSide;
        this.eastSide = eastSide;
    }

    public long calCase(){
        if(westSide == eastSide){
            return 1;
        }
        if(westSide < eastSide - westSide){
            return combination(eastSide, eastSide - westSide);
        }
        else
            return combination(eastSide, westSide);
    }

    private long combination(int m, int n) {

        long num = 1, denom = 1;

       for(int i = m; i > n; i--){
           num *= i;
       }
       for(int j = m-n; j > 1; j--){
           denom *= j;
       }
        return num / denom;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        ConnectingBridge_1010[] obj = new ConnectingBridge_1010[testCases];

        for (int i = 0; i < testCases; i++) {
            int westSide = sc.nextInt();
            int eastSide = sc.nextInt();
            obj[i] = new ConnectingBridge_1010(westSide, eastSide);
        }

        sc.close();

        for (int i = 0; i < testCases; i++) {
            System.out.println(obj[i].calCase());
        }
    }
}
