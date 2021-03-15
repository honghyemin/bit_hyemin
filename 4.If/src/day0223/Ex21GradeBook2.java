package day0223;
// 사용자로부터 학생의 정보를 입력 받고 

// 출력하는 프로그램

// 단 학생의 정보(번호, 이름, 국어점수, 영어점수, 수학점수)는 
// 사용자가 메뉴에서 입력을 선택해야 입력이 가능하다

// 입력 시 잘못된 정보(1~10을 벗어나는 번호나 0~100을 벗어나는 점수)를 
// 입력할 시에는 올바른 정보가 입력될 때까지 다시 입력을 받아야 한다.

// 학생 정보의 출력은
// 사용자가 메뉴에서 출력을 선택해야 출력이 가능하다.

// 고려해볼것 :
// 변수의 선언 위치
import java.util.Scanner;

public class Ex21GradeBook2 {
    static final int ID_MIN = 1;
    static final int ID_MAX = 10;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int SUBJECT_SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = 0;
        String name = new String();
        int kor = 0;
        int eng = 0;
        int math = 0;
        
        boolean inputSwitch = false;
        

        while (true) {
            System.out.println("=========================");
            System.out.println("   비트 고등학교 성적관리 프로그램");
            System.out.println("=========================");
            System.out.println("   1. 입력 2. 출력 3. 종료");
            System.out.print("> ");

            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // 성적을 입력하는 코드를 여기에 구현
                
                // 사용자가 입력을 한번이라도 했다는 의미이므로
                // inputSwitch 의 값을 true로 바꿔준다
                inputSwitch = true;
                
                System.out.print("번호: ");
                id = scanner.nextInt();
                while (id > ID_MAX || id < ID_MIN) {
                    System.out.println("다시 입력해주세요.");
                    System.out.println("번호 : ");
                    id = scanner.nextInt();
                }
                
                scanner.nextLine();
                System.out.print("이름 : ");
                name = scanner.nextLine();

                System.out.print("국어점수: ");
                kor = scanner.nextInt();
                while (kor > SCORE_MAX || kor < SCORE_MIN) {
                    System.out.println("다시 입력해주세요.");
                    System.out.print("국어점수 : ");
                    kor = scanner.nextInt();
                }

                System.out.print("영어점수: ");
                eng = scanner.nextInt();
                while (eng > SCORE_MAX || eng < SCORE_MIN) {
                    System.out.println("다시 입력해주세요.");
                    System.out.print("영어점수 : ");
                    eng = scanner.nextInt();
                }

                System.out.print("수학점수: ");
                math = scanner.nextInt();
                while (math > SCORE_MAX || math < SCORE_MIN) {
                    System.out.println("다시 입력해주세요.");
                    System.out.print("수학점수 : ");
                    math = scanner.nextInt();

                }

            } else if (userChoice == 2) {
                // 성적을 출력하는 코드를 여기에 구현
                
                // inputSwitch의 값이 false인 경우 : 아직 사용자가 입력을 한 번도 안함
                // inputSwitch의 값이 true인 경우 : 사용자가 한번이라도 입력을 함
                
                if(inputSwitch) {
                    // inputSwitch가 true일 때 사용
                    int sum = kor + eng + math;
                    double avg = sum / (double) SUBJECT_SIZE;

                    System.out.printf("번호 : %03d 이름: %s\n", id, name);
                    System.out.printf("국어점수 : %03d점 영어점수 : %03d점 수학점수 : %03d점\n", kor, eng, math);
                    System.out.printf("총점 : %03d점, 평균: %06.2f점\n", sum, avg);
                                        
                } else {
                    // inputSwitch가 false일 때 사용
                    
                    System.out.println("아직 입력된 정보가 존재하지 않습니다.2");
                    
                    
                    
                }
               
                

            } else if (userChoice == 3) {
                // 메시지 출력 후 break를 사용하여 무한루프 종료
                System.out.println("사용해 주셔서 감사합니다.");
                break;

            }
        }

        scanner.close();

    }

}
