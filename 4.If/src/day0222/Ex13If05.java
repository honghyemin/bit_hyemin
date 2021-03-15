package day0222;
//4. 사용자로부터 나이를 입력 받아서 미성년자일 경우 "미성년자입니다"가 출력되게 코드를 작성하세요.
import java.util.Scanner;

public class Ex13If05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("나이: ");
        int age = scanner.nextInt();
        if (age < 20) {
            System.out.println("미성년자입니다.");
            
        }
        System.out.println("프로그램 종료");

    }

}
