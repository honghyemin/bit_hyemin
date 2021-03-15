package day0222;
//1. number에 값을 할당하고 해당 값이 0보다 크면 출력하세요

//2. 사용자로부터 숫자를 입력 받아서 해당 값이 0보다 작으면 출력하세요
//3. 사용자로부터 숫자를 입력 받아서 해당 값이 짝수이면 출력하세요
//4. 사용자로부터 나이를 입력 받아서 미성년자일 경우 "미성년자입니다"가 출력되게 코드를 작성하세요.
//5. 사용자로부터 숫자를 입력 받아서 해당 숫자가 한자리 자연수일 경우
//" 한자리 자연수 입니다" 가 출력되게 코드를 작성하세요.
import java.util.Scanner;
public class Ex13If07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("========== 1번 =========");
        System.out.print("값 : " );
        int number1 = scanner.nextInt();
        if (number1>0) {
            System.out.println(number1);
        }
        System.out.println("========== 2번 =========");
        System.out.print("값 : " );
        int number2 = scanner.nextInt();
        if (number2 < 0) {
            System.out.println(number2);
        }
        System.out.println("========== 3번 =========");
        System.out.print("값 : " );
        int number3 = scanner.nextInt();
        if (number3 %2 ==0) {
            System.out.println(number3);
        }
        System.out.println("========== 4번 =========");
        System.out.print("나이 : " );
        int number4 = scanner.nextInt();
        if (number4 <19) {
            System.out.println("미성년자입니다.");
                    }
        System.out.println("========== 5번 =========");
        System.out.print("값 : " );
        int number5 = scanner.nextInt();
        if (number5 >=0 && number5<10) {
            System.out.println("한자리 자연수 입니다.");
        }
        
        System.out.println("프로그램 종료");
        
        scanner.close();

    }

}
