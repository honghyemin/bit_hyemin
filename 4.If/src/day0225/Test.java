package day0225;
//5명의 번호, 이름, 국어점수, 영어점수, 수학점수를

//각각 배열에 입력해서 차례대로 출력하는 프로그램을 작성해보세요.

//잘못된 값은 올바른 값이 입력될때까지 입력 받기

//인덱스마다 학생의 정보를 입력해 줌 ex) 0번 학생의 정보가 다 나오게

import java.util.Scanner;

public class Test {
    static final int STUDENT = 5;
    static final int SCORE_MAX = 100;
    static final int SCORE_MIN = 0;
    static final int ID_MAX = 10;
    static final int ID_MIN = 1;
    static final int SUBJECT_SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idArray = new int[STUDENT];
        String[] nameArray = new String[STUDENT];
        int[] korArray = new int[SUBJECT_SIZE];
        int[] engArray = new int[SUBJECT_SIZE];
        int[] mathArray = new int[SUBJECT_SIZE];

        for (int i = 0; i < STUDENT; i++) {
            System.out.printf("--------%d번째 학생의 정보 입력하기--------\n", (i + 1));

            // i번째 학생 정보 입력하기
            System.out.print("번호 : ");
            idArray[i] = scanner.nextInt();
            while (!(idArray[i] >= ID_MIN && idArray[i] <= ID_MAX)) {
                System.out.println("다시 입력해주세요.");
                System.out.print("번호 : ");
                idArray[i] = scanner.nextInt();

            }

            System.out.print("이름: ");
            scanner.nextLine();
            nameArray[i] = scanner.nextLine();

            System.out.print("국어점수 : ");
            korArray[i] = scanner.nextInt();
            while (!(korArray[i] >= SCORE_MIN && korArray[i] <= SCORE_MAX)) {
                System.out.println("다시 입력해주세요.");
                System.out.print("국어점수 : ");
                korArray[i] = scanner.nextInt();
            }

            System.out.print("영어점수 : ");
            engArray[i] = scanner.nextInt();
            while (!(engArray[i] >= SCORE_MIN && engArray[i] <= SCORE_MAX)) {
                System.out.println("다시 입력해주세요.");
                System.out.print("영어점수 : ");
                engArray[i] = scanner.nextInt();
            }

            System.out.print("수학점수 : ");
            mathArray[i] = scanner.nextInt();
            while (!(mathArray[i] >= SCORE_MIN && mathArray[i] <= SCORE_MAX)) {
                System.out.println("다시 입력해주세요.");
                System.out.print("수학점수 : ");
                mathArray[i] = scanner.nextInt();
            }

            System.out.println("-------------------------------------");

        }

        for (int i = 0; i < STUDENT; i++) {
            System.out.printf("%d번째 학생의 입력정보,\n", i + 1);
            System.out.printf("번호 : %3d 이름 : %s\n", idArray[i], nameArray[i]);
            System.out.printf("국어점수: %3d점 수학점수: %3d점 영어점수: %3d점\n", korArray[i], engArray[i], mathArray[i]);
            int sum = korArray[i] + engArray[i] + mathArray[i];
            double avg = sum / (double) SUBJECT_SIZE;
            System.out.printf("총점: %3d 평균:%6.2f\n", sum, avg);

        }

        scanner.close();
    }

}
