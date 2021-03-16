package day0223;
// 사용자로부 터
// 성별, 나이, 신체등급 순으로 입력 받아서
// 신체등급 1~3 : 현역
// 신체등급 4 : 공익
// 그 외 : 면제가 출력되는 프로그램

// 단, 성별을 입력받을 시에는 int로 입력받아
// 1이면 남자 2면 여자로 판단

// 또한 여자일 경우에는
// 추가적인 정보 입력 대신
// " 여성에게는 국방의 의무가 없습니다." 가 출력\

// 또한 남자이지만 미성년자일 경우
// 추가적인 정보 입력 대신
// " 미성년자에게는 아직 신체등급이 부여되지 않습니다"가 출력

import java.util.Scanner;
public class Ex09NestedIf2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("성별(1은 남자, 2는 여자) : ");
        int gender = scanner.nextInt();
        
       
        
        
        if (gender == 1) {
            
            System.out.println("남자입니다.");
             
            System.out.print("나이 : ");
            int age = scanner.nextInt();
            if (age >= 19) {
                System.out.println("성인입니다.");
                
                System.out.print("신체등급 : ");
                int level = scanner.nextInt();
                if (level <= 3) {
                    System.out.println("현역입니다");
                } else if(level > 3) {
                    System.out.println("공익입니다");
                } else {
                    System.out.println("면제입니다");
                }
            } else {
                System.out.println("미성년자에게는 아직 신체등급이 부여되지 않습니다.");
            } 
            
        } else {
            System.out.println("여성에게는 국방의 의무가 없습니다.");
        }
        
        scanner.close();

    }

}
















