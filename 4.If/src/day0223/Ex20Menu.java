package day0223;
// 만약 우리가 반복문을 만들었는데
// 의도치 않게 무한루프에 들어가는 경우에는
// 잘못된 것이 맞지만
// 우리가 의도적으로 무한루프를 만들어서
// 우리가 원하는 코드를 실행되게 만들어줄수 있다.

// 가장 대표적인 무한루프를 이용한 프로그램이 바로
// 우리가 지금 만들 메뉴 프로그램이 된다.

import java.util.Scanner;
public class Ex20Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("=========================");
            System.out.println("   비트 고등학교 성적관리 프로그램");
            System.out.println("=========================");
            System.out.println("   1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 성적을 입력하는 코드를 여기에 구현
                
              
                
                
            } else if (userChoice == 2) {
                // 성적을 출력하는 코드를 여기에 구현
                
                
                
                
            } else if (userChoice == 3) {
                // 메시지 출력 후 break를 사용하여 무한루프 종료
                System.out.println("사용해 주셔서 감사합니다.");
                break;
                
            }
        }
        
        
        
        scanner.close();
        // 경우에 따라서는 접근 가능한 코드가 됐으므로 빨간줄 없어짐.
        // 언제? 사용자가 3이라고 입력하면.
 
    }

}








