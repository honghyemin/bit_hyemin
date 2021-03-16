package day0225;
// 메뉴를 사용해서  

// 입력을 누르면 비어있는 학생의 정보 칸에 정보를 입력하고
// (입력 안됐으면 출력도 x)
// 출력하면 입력한 학생들만 출력이 되는 프로그램

import java.util.Scanner;

public class Ex04GradeBook02 {
    static final int ID_MIN = 1;
    static final int ID_MAX = 10;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int SUBJECT_SIZE = 3;
    static final int STUDENT_SIZE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열을 while(true)이전에 만들어줌!

        // id를 모아둔 int 배열 idArray
        int[] idArray = new int[STUDENT_SIZE];

        // 이름을 모아둔 String 배열 nameArray
        String[] nameArray = new String[STUDENT_SIZE];

        // 국어점수를 모아둔 int 배열 koreaArray
        int[] koreanArray = new int[STUDENT_SIZE];

        // 영어점수를 모아둔 int 배열 englishArray
        int[] englishArray = new int[STUDENT_SIZE];

        // 수학점수를 모아둔 int 배열 mathArray
        int[] mathArray = new int[STUDENT_SIZE];

        // 현재 정보를 저장할 index를 가진 int 변수 idx
        // 정보를 입력할 때 idx칸 번째의 정보 입력. idx를 이용해 몇번째까지 출력?을 컨트롤 해줄수 있음
        // ex) idx 가 0이면 아직 아무도 입력 안함. idx가 3이면 0번1번2번 입력됨.
        int idx = 0;

        while (true) {

            System.out.println("1. 입력 2.출력 3.종료 ");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // idx값에 따라 1명만 입력할지, 더 이상 입력할 수 없습니다를 띄울지!
                // 왜? idx가 5이상이 되면 유효하지 않은 크기...(크기를 벗어남)?
                if (idx < STUDENT_SIZE) {
                    // 아직 우리가 입력할 칸이 남아있다.
                    // idx번 칸에 입력을 시작한다.
                    System.out.println("=====" + (idx + 1) + "번째 학생 정보 입력=====");
                    
                    // idx 번째 학생의 번호 입력하기.
                    System.out.print("번호:  ");
                    idArray[idx] = scanner.nextInt();
                    
                    while(!(idArray[idx] >= ID_MIN && idArray[idx] <= ID_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.print("번호:  ");
                        idArray[idx] = scanner.nextInt();
                    }
                    
                    
                    
                    
                    
                    System.out.println("===================================");

                } else {
                    // 이미 STUDENT_SIZE만큼의 학생들을 다 입력했으므로
                    // 더 이상 입력할 수 없다 라는 경고메시지만 출력해준다.

                    System.out.println();
                    System.out.println("더이상 입력하실 수 없습니다.");
                    System.out.println();

                }

            } else if (userChoice == 2) {
                // idx값을 기준으로 idx=0; 은 한명도 입력x

                if (idx == 0) {
                    // 아직 한 명도 입력x
                    System.out.println();
                    System.out.println("'아직 입력된 정보가 없습니다.'");
                    System.out.println();

                } else {
                    // 적어도 한 명 이상 입력

                    for (int i = 0; i < idx; i++) {
                        // i< STUDENT_SIZE 를 하면 한명 출력하려고해도 다 출력됨
                        // 우리가 출력하고자 하는 것은 1명만 보고싶으면 1명만 출력되게끔.

                        System.out.println("--------" + (i + 1) + "번째 학생의 정보------------");
                        System.out.printf("번호 : %03d번 이름:%s \n", idArray[i], nameArray[i]);
                        System.out.printf("국어점수 : %03d점 영어점수: %03d점 수학점수: %03d점\n", koreanArray[i], englishArray[i],
                                mathArray[i]);
                        int sum = koreanArray[i] + englishArray[i] + mathArray[i];
                        double avg = sum / (double) SUBJECT_SIZE;
                        System.out.printf("총점: %03d점 평균: %6.2f점\n", sum, avg);

                        System.out.println("================================");
                    }

                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;

            }

        }

        scanner.close();
    }

}
