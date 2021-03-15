package kr.co.bitcamp.ifSwitch;

/*
 * switch 조건문의 사용법을 설명해보자.
 * 
 * 사용자가 자신의 연령대를 입력하면 해당 연령대에 맞는 책을 추천하는 코드를 만들어보자.
 */
import java.util.Scanner;
public class SwitchBasic {
    public static void main(String[] args) {
        
        // 사용자 입력을 위한 객체 생성
        Scanner scan = new Scanner(System.in);
        
        System.out.print(" 자신의 연령대를 입력하세요 : ");
        int age = scan.nextInt();

        // 사용자 입력 예외처리
        if(age > 10 && age<20) {  // 11~19세
            System.out.println("10이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0);
            } 
        else if(age>20 && age<30) { // 21~29세
            System.out.println("20이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0);
            
        }
        else if(age>30 && age<40) { // 31~39세
            System.out.println("30이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0);
            
        }
        else if(age>40 && age<50) { // 41~49세
            System.out.println("40이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0);
            
        }
        else if(age>50 && age<60) { // 51~59세
            System.out.println("50이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
            System.exit(0);
            
        } else {
            if(age<10) {
                System.out.println("최소 10이상만 입력해주세요. 프로그램을 종료합니다.");
                System.exit(0);

            }
            
        }
        
        // Switch 조건문
        
        // 변수조건 : 정수형이어야 함 : byte, short, int
        //                       그러나 long타입은 안됌
        //                       char타입 가능 --> 'A'
        // break, default 빼먹지 않도록 주의.
        
        switch(age) {
            case 10 : 
                System.out.println(age + "대입니다. 참고서 코너는 A 구역입니다.");
                break;
            case 20 : 
                System.out.println(age + "대입니다. 취업 서적 코너는 B 구역입니다.");
                break;
            case 30 :
                System.out.println(age + "대입니다. 자기 개발 코너는 C 구역입니다.");
                break;
            case 40 :
                System.out.println(age + "대입니다. 재태크 코너는 D 구역입니다.");
                break;    
            case 50 :
                System.out.println(age + "대입니다. 재취업 코너는 코너는 E 구역입니다.");
                break;    
            default:
                System.out.println("60대 이상입니다. 건강/장수 코너는 F 구역입니다.");
                break;
        }
        
        
        
        scan.close();

    }

}
