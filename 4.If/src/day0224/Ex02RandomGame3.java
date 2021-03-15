package day0224;
// 숫자 맞추기 게임  

// 메뉴를 만들어서
// 1. 플레이 2. 기록보기 3. 종료
// 1번을 누를 경우
// 컴퓨터가 만든 난수를 사용자가 몇번만에 맞추는지 
// 기록해서 최고기록과 비교해서 
// 더 낮은 횟수가 최고기록이 되게 만들기
// 2번을 누를 경우
// 현재 최고기록을 보기
// 3번을 누를 경우
// 종료

// 11시 10분까지

import java.util.Scanner; 
import java.util.Random;

public class Ex02RandomGame3 {
    static final int COMP_NUM_MAX = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int bestScore = 0;

        while (true) {
            System.out.println();
            System.out.println("1. 플레이 2. 기록보기 3. 종료");
            System.out.println("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // 플레이 코드 구현

                // 1. 컴퓨터의 난수 생성
                int computerNumber = random.nextInt(COMP_NUM_MAX) + 1;

                // 2. 사용자로부터 숫자 입력 후
                // 컴퓨터 난수와 비교해서
                // 같을때까지 사용자로부터 숫자를 입력 받는다.
                // 입력 받을때마다 현재 점수는 1씩 올라간다.
                int currentScore = 1;
                System.out.print("숫자: ");
                int userNumber = scanner.nextInt();

                while (userNumber != computerNumber) {
                    System.out.println("땡!!");
                    System.out.print("숫자: ");
                    userNumber = scanner.nextInt();
                    currentScore++;
                }

                // 3. 최고기록과 비교해서
                // 필요하다면 현재점수를 최고기록에 저장
                // 최고기록을 갱신하는 2가지 경우
                // 1. 현재 스코어가 최고기록보다 작으면
                // 2. 최고기록이 0일때
                System.out.printf("사용자의 이번 라운드 스코어: [%3d]회\n", currentScore);
                System.out.printf("       기존의 최고 스코어: [%3d]회\n", bestScore);

                if (bestScore == 0 || currentScore < bestScore) {
                    bestScore = currentScore;
                    System.out.println("짝짝짝 현재 스코어가 새로운 최고기록입니다 짝짝짝");
                }

            } else if (userChoice == 2) {
                // 기록 보기 코드 구현
                // 만약 최고 점수가 0이다 -> 아직 플레이 기록이 없다.
                // 그외다 -> 최고기록을 보여준다.

                if (bestScore == 0) {
                    System.out.println();
                    System.out.println("아직 플레이 기록이 없습니다.");
                    System.out.println();
                } else {
                    System.out.printf("현재 최고 기록: [%3d]회 \n", bestScore);
                }

            } else if (userChoice == 3) {
                System.out.println("플레이해주셔서 감사합니다.");
                break;
            }

        }

        scanner.close();
    }
}