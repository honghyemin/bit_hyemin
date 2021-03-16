package day0225;
// 5명의 번호, 이름, 국어점수, 영어점수, 수학점수를 

// 각각 배열에 입력해서 차례대로 출력하는 프로그램을 작성해보세요.

// 잘못된 값은 올바른 값이 입력될때까지 입력 받기

// 인덱스마다 학생의 정보를 입력해 줌 ex) 0번 학생의 정보가 다 나오게
import java.util.Scanner;

public class Ex03GradeBook {
    static final int ID_MIN = 1;
    static final int ID_MAX = 10;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int SUBJECT_SIZE = 3;
    static final int STUDENT_SIZE = 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

        // i가 0일때 1번째 학생출력, 1일때 2번째....
        for (int i = 0; i < STUDENT_SIZE; i++) {
            System.out.printf("-----%d번째 학생의 정보 입력하기\n", i + 1);
            
            
            
            // i번째 학생 번호 입력하기
            System.out.print("번호: ");
            idArray[i] = scanner.nextInt();
            while (!(idArray[i] >= ID_MIN && idArray[i] <= ID_MAX)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.print("번호: ");
                idArray[i] = scanner.nextInt();
            }
            // i번째 학생 이름 입력하기
            System.out.print("이름: ");
            scanner.nextLine();
            nameArray[i] = scanner.nextLine();
            
            // i번째 학생 국어 점수 입력하기
            
            System.out.print("국어점수 : ");
            koreanArray[i] = scanner.nextInt();
            while(!(koreanArray[i] >= SCORE_MIN && koreanArray[i]<=SCORE_MAX)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.print("국어점수 : ");
                koreanArray[i] = scanner.nextInt();
            }
            
            // i번째 학생 영어 점수 입력하기
            
            System.out.print("영어점수 : ");
            englishArray[i] = scanner.nextInt();
            while(!(englishArray[i] >= SCORE_MIN && englishArray[i]<=SCORE_MAX)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.print("영어점수 : ");
                englishArray[i] = scanner.nextInt();
            }
            
            
            
            // i번째 학생 수학 점수 입력하기
            
            System.out.print("수학점수 : ");
            mathArray[i] = scanner.nextInt();
            while(!(mathArray[i] >= SCORE_MIN && mathArray[i]<=SCORE_MAX)) {
                System.out.println("잘못 입력하셨습니다.");
                System.out.print("수학점수 : ");
                mathArray[i] = scanner.nextInt();
            }
        
        
        System.out.println("-----------------------------------------------");
        
        }
        
        // 학생을 차례대로 출력해준다.
        for(int i = 0; i < STUDENT_SIZE; i++) {
            System.out.println("--------" +(i+1)+"번째 학생의 정보------------");
            System.out.printf("번호 : %03d번 이름:%s \n", idArray[i], nameArray[i]);
            System.out.printf("국어점수 : %03d점 영어점수: %03d점 수학점수: %03d점\n",
                    koreanArray[i], englishArray[i], mathArray[i]);
            int sum = koreanArray[i] + englishArray[i] + mathArray[i];
            double avg = sum / (double)SUBJECT_SIZE;
            System.out.printf("총점: %03d점 평균: %6.2f점\n", sum,avg); 
           
            
            
            
            
            
            
            System.out.println("================================");
            
        }
        
        
        

        scanner.close();
    }

}
