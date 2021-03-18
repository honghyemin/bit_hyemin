package day0222;
// Scanner
// 자바에서 입력을 담당하는 클래스
// 여러가지 입력을 처리해주는 Scanner클래스이지만 
// 우리는 키보드 입력을 처리하기 위해 Scanner를 사용하게 될 것이다.
// 다만 Scanner는 자바에서 기본적으로 제공해주는 클래스가 아니라
// 자바의 라이브러리에서 불러와야하는 크래스이므로
// 우리가 "수입"해야한다.

import java.util.Scanner;

public class Ex09Scanner {

    public static void main(String[] args) {
        // 스캐너 클래스 변수를 초기화 할때는
        // ()안에 반드시 어디서 읽어올지를 지정해주어야 한다.
        // 우리는 키보드 입력을 할 것이므로
        // System.in 이라고 적어주면 된다.
               
        Scanner scanner = new Scanner(System.in);
        
        // 1. 사용자로부터 int 입력을 받기 위해서는
        //    Scanner 객체의 nextInt() 메소드를 실행하면 된다.
        
        System.out.print("숫자: ");
        int number = scanner.nextInt();
        // 위의 int number = scanner.nextInt(); 코드의 의미는
        // int변수 number를 선언하고
        // 사용자로부터 입력받은 int값으로 number를 초기화해라 하는 의미.
        System.out.println("사용자가 입력한 숫자: " + number);
        
        // 2. 사용자로부터 double 입력을 받을 때에는
        //    scanner 객채의 nextDouble() 을 실행하면 된다.
        System.out.print("실수: ");
        double d = scanner.nextDouble();
        System.out.println("사용자가 입력한 숫자: " + d);
        
        // 3. 사용자로부터 String 입력을 받을 때에는
        //    Scanner 객체의 nextLine()을 실행하면 된다.
        System.out.print("이름: ");
        // Scanner의 경우 nextInt, nextDouble 등의 숫자를 입력하는 메소드를 실행하면
        // 버퍼메모리에 엔터키가 남아있게 된다.
        // 그 후에 nextLine()을 사용하게 된다면
        // 그 버퍼메모리에 남아있는 엔터키때문에
        // 스캐너는 사용자가 아무런 내용 없는 스트링을 입력했다고 착각하ㅁ여
        // 실제 스트링입력은 불가능해지는 버그가 있다.
        // 해당 버그를 해결하기 위해서
        // nextInt(). nextDouble()을 쓰고 "나서는"
        // 반드시
        // Scanner.nextLine()을 한 번 적고
        // 다시 scanner.nextLine()을 실행시켜서 스트링 입력을 받도록 해야한다.
        
        // 시작하자마자 String을 사용한다면 굳이 두 번 입력할 필요 없음.
        scanner.nextLine(); // 엔터키(버퍼의 공백을 없애주는 용도)
        String name = scanner.nextLine(); // 실행용도(진짜 입력을 할 수 있게.)
        System.out.printf("사용자의 이름: [%s]\n", name);
      
        
        
        
        /* Scanner의 경우 우리가 키보드에 입력한 데이터를
         곧장 읽어오는 것이 아니라
         버퍼 메모리라는 임시 저장소에 키보드 입력값을 저장하고
         해당 키보드값이 유효한지 체크해서 유효하면 데이터를 읽어오는 구조이다.
         이렇게 버퍼메모리를 읽어오는 클래스 변수의 경우
         프로그램의 맨 마지막에 close() 메소드를 호출해주는 것이 좋다.*/
        scanner.close();

    }
}





















