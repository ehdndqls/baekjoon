import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class SortingWord_1181 {

    // compare 메서드: 길이가 같으면 사전순으로, 아니면 길이에 따라 비교
    public static class WordComparator implements Comparator<String> {
        @Override
        public int compare(String word1, String word2) {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2); // 길이가 같으면 사전순으로 비교
            } else if (word1.length() < word2.length()) {
                return -1; // word1이 더 짧으면 먼저
            } else {
                return 1; // word2가 더 짧으면 먼저
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 단어의 개수 입력
        int n = sc.nextInt();
        String[] words = new String[n];

        // 단어 입력 받기
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // 정렬: Comparator를 사용하여 compare 기준으로 정렬
        Arrays.sort(words, new WordComparator());

        // 중복된 단어를 제거하면서 출력
        String lastWord = "";
        for (String word : words) {
            if (!word.equals(lastWord)) {
                System.out.println(word);
                lastWord = word;
            }
        }

        sc.close();
    }
}
