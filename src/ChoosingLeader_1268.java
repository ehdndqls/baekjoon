import java.util.Scanner;

public class ChoosingLeader_1268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 학생 수
        int[][] classes = new int[N][5]; // 학생별 학년별 반 정보 저장

        // 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                classes[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int maxFriends = 0;  // 가장 많은 친구 수
        int temporaryLeader = 0; // 임시 반장 번호

        // 학생 i와 학생 j 비교
        for (int i = 0; i < N; i++) {
            int friendCount = 0;

            for (int j = 0; j < N; j++) {
                if (i == j) continue; // 자기 자신 제외

                // 한 학년이라도 같은 반이 있으면 친구 수 증가
                for (int k = 0; k < 5; k++) {
                    if (classes[i][k] == classes[j][k]) {
                        friendCount++;
                        break; // 같은 반 확인되면 추가 비교 필요 없음
                    }
                }
            }

            // 가장 많은 친구를 가진 학생 업데이트 (동점이면 번호 작은 학생 우선)
            if (friendCount > maxFriends) {
                maxFriends = friendCount;
                temporaryLeader = i;
            }
        }

        // 학생 번호는 1부터 시작하므로 +1
        System.out.println(temporaryLeader + 1);
    }
}
