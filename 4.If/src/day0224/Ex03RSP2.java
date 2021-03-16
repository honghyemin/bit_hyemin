package day0224;
// 가위바위보 게임 

// 1. 플레이하기
//    사용자로부터 가위바위보를 int로 입력받는다.
//    가위 : 1
//    바위 : 2
//    보 : 3
//    컴퓨터의 선택과 비교해서
//    승리, 무승부, 패배를 기록해준다.

// 2. 기록보기
//    사용자의 현재 전적을 보여준다.
//    ###전 ###승 ###패 (승률 ##,##%)

// 단 무한루프를 사용해서 사용자가 원하는 만큼 플레이 할 수 있도록 만들어보기.

import java.util.Scanner; 
import java.util.Random;

public class Ex03RSP2 {
    static final int SIS = 1;
    static final int ROCK = 2;
    static final int PAPER = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       
        int win = 0;
        int lose = 0;
        int draw = 0;
        

        while (true) {
            System.out.println("======가위바위보게임=====");
            System.out.println("--------------------");
            System.out.println("1. 플레이 2. 기록 3. 종료");
            System.out.print("> ");

            int menu = scanner.nextInt();

            if (menu == 1) {
                
                int com = random.nextInt();
                
                System.out.print("나 : ");
                int user = scanner.nextInt();
                // 가위 = 1, 바위 = 2, 보 = 3
                
                while (user!=7) {
                if (user == 1) {
                    if (com == 2) {
                        System.out.println("패배");
                        lose++;
                    } else if (com == 3) {
                        System.out.println("승리");
                        win++;
                    } else {
                        System.out.println("무승부");
                        draw++;
                    }
                } else if (user == 2) {
                    if (com == 1) {
                        System.out.println("승리");
                        win++;
                    } else if (com == 3) {
                        System.out.println("패배");
                        lose++;
                    } else {
                        System.out.println("무승부");
                        draw++;
                    }
                }else if (user == 3) {
                    if (com == 1) {
                        System.out.println("패배");
                    } else if (com == 2) {
                        System.out.println("승리");
                    } else {
                        System.out.println("무승부");
                    }
                } else {
                    System.out.println("게임을 종료합니다.");
                    break;
                }
                }
                
             

            } else if (menu == 2) {

            } else {
                System.out.println("프로그램을 종료합니다.");
            }

        }

    
    }

}
