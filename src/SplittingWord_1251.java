import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SplittingWord_1251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        sc.close();

        int strLen = str.length();
        List<String> list = new ArrayList<>();


        for(int a=1;a<strLen-1;a++){
            for(int b=a+1;b<strLen;b++){
                //나누기
                String part1 = new StringBuilder(str.substring(0, a)).reverse().toString();
                String part2 = new StringBuilder(str.substring(a, b)).reverse().toString();
                String part3 = new StringBuilder(str.substring(b)).reverse().toString();

                list.add(part1 + part2 + part3);
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
