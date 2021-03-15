package day0223;
// 사용자로부터 나이를 입력 받아서
// 성인인지 미성년자인지를 출력하는 프로그램을 작성
import java.util.Scanner;

public class Ex02IfElse02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("나이 : ");
        int age = scanner.nextInt();
        
        if (age < 19) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
        
        scanner.close();        

    }

}
