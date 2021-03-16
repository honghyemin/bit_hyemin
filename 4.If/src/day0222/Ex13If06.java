package day0222;
//5. 사용자로부터 숫자를 입력 받아서 해당 숫자가 한자리 자연수일 경우
//" 한자리 자연수 입니다" 가 출력되게 코드를 작성하세요.
import java.util.Scanner;

public class Ex13If06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("값 : ");
        int number = scanner.nextInt();
        if (number>0 && number<10 ) {
            System.out.println("값은 한자리 자연수입니다.");
            
        }
        
        System.out.println("프로그램 종료");

    }

}
