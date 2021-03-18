package day0223;
// 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 차례대로 입력받아
// 형식에 맞추어 출력하는 프로그램

// 단 번호는 1~10 사이이다.
// 국어, 영어, 수학 점수 모두 0~100 사이이다
// 만약 사용자가 잘못된 번호 혹은 점수를 입력하면
// 올바른 값이 입력될때까지 다시 입력을 받도록
// 프로그램을 작성

import java.util.Scanner;
public class Ex18GradeBook {
static final int ID_MIN = 1;
static final int ID_MAX = 10;
static final int SCORE_MIN = 0;
static final int SCORE_MAX = 100;
static final int SUBJECT_SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("번호 : ");
        int num = scanner.nextInt();
        
        while (num < ID_MIN || num > ID_MAX) {
            System.out.println(" 다시 입력해주세요");
            System.out.println("번호 : ");
            num = scanner.nextInt();
        }
        
        System.out.print("이름 : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        
        System.out.print("국어 : ");
        int kor = scanner.nextInt();
        
        while (kor < SCORE_MIN || kor > SCORE_MAX) {
            System.out.println("다시 입력해주세요");
            System.out.println("국어 : ");
            kor = scanner.nextInt();
        }
        
        System.out.print("영어 : ");
        int eng = scanner.nextInt();
        
        while (eng < SCORE_MIN || eng > SCORE_MAX) {
            System.out.println("다시 입력해주세요");
            System.out.println("영어 : ");
            eng = scanner.nextInt();
        }
        
        System.out.print("수학 : ");
        int math = scanner.nextInt();
        
        while (math < SCORE_MIN || math > SCORE_MAX) {
            System.out.println("다시 입력해주세요");
            System.out.println("수학 : ");
            math = scanner.nextInt();
        }
        //총점과 평균 계산
        int sum = kor + eng + math;
        double avg = sum / (double)SUBJECT_SIZE;
        
        
        System.out.printf("번호 : %03d, 이름: %s\n",  num, name);
        System.out.printf("국어 : %03d, 영어: %03d, 수학: %03d \n",  kor, eng, math);
        System.out.printf("총점 : %03d, 평균: %06.2f\n",  sum, avg);
        
        
        scanner.close();



    }

}
