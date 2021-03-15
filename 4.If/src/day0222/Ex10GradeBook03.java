package day0222;
// 사용자로부터 
// 번호, 이름, 국어, 영어, 수학 점수 순으로 입력받아서
// 다음과 같은 양식대로 출력되게 프로그램 작성

// 번호 : 003번 이름 : 김땡땡
// 국어 : 080점 영어 : 079점 수학 : 080점
// 총점 : 239점 평균 : 080.67점
import java.util.Scanner;

public class Ex10GradeBook03 {
    static final int SUBJECT_SIZE = 3;
    // ^ 소프트코딩 방법
    // static : 해당 코드를 java의 메소드 영역에 등록하라는 의미.
    // static이 붙어있는 메소드가 다른 메소드 혹은 상수를 호출할 때에는
    // 그 다른 메소드나 상수에도 반드시 static이 붙어있어야만 한다.
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("번호 : ");
        int id = scanner.nextInt();
        System.out.print("이름 : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.print("국어 : ");
        int kor = scanner.nextInt();
        System.out.print("영어 : ");
        int eng = scanner.nextInt();
        System.out.print("수학 : ");
        int math = scanner.nextInt();
        
        int sum = kor + eng + math;
        //double avg = sum / 3.0;
        double avg = sum / (double)SUBJECT_SIZE;
        // 3.0... 매직넘버... 하드코딩..? hard : 딱딱한, 경직된
        // 쉬운 난이도를 할 때는 하드코딩이 쉬움.
        // 지금은 내가 작성하고 나눌게 많지 않지만 나중에 수주를 받거나 굉장히 길 때는?
        // <-> 소프트코딩 
        // 난이도는 올라가고 코딩시간이 오래걸림. but 유지보수하기에는 쉬움.
        // 매직넘버들을 상수 or 변수로 만듦.
        // 전부다 변수 혹은 상수를 만들어서 매직넘버를 코딩에서 없애는 법.
        
        System.out.printf("번호 : %03d번 이름 : %s\n", id, name );
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", kor, eng, math );
        System.out.printf("총점 : %03d점 총점 : %06.2f점\n", sum, avg );
        
        scanner.close();
        
        
        
        
        
        
        

    }

}
