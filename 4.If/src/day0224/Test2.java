package day0224;
//가위바위보 게임  

//1. 플레이하기
// 사용자로부터 가위바위보를 int로 입력받는다.
// 가위 : 1
// 바위 : 2
// 보 : 3
// 컴퓨터의 선택과 비교해서
// 승리, 무승부, 패배를 기록해준다.

//2. 기록보기
// 사용자의 현재 전적을 보여준다.
// ###전 ###승 ###패 (승률 ##,##%)

//단 무한루프를 사용해서 사용자가 원하는 만큼 플레이 할 수 있도록 만들어보기.

import java.util.Scanner;
import java.util.Random;
public class Test2 {
    static final int SCI = 1;
    static final int ROCK = 2;
    static final int PAPER = 3;
    static final int ZAM = 3;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        
        int win = 0;
        int lose = 0;
        int draw = 0;
        
        
        while(true) {
            
            System.out.println("======가위바위보======");
            System.out.println("1.플레이 2. 기록 3.종료");
            System.out.print("> ");
            int menu = scanner.nextInt();
            
            
            if (menu == 1 ) {
                int comnum = random.nextInt(ZAM);
                
                System.out.println("1. 가위 2. 바위 3. 보" );
                System.out.print("> ");
                int user = scanner.nextInt();
                
                while (!(user>=SCI && user <= PAPER)) {
                    System.out.println("잘못 입력하였습니다.");
                    System.out.println("1. 가위 2. 바위 3. 보" );
                    System.out.print("> ");
                    user = scanner.nextInt();
                }
                
                String userMessage = new String("사용자의 선택: ");
                switch(user) {
                case 1:
                    userMessage += "가위";
                    break;
                case 2:
                    userMessage += "바위";
                    break;
                case 3:
                    userMessage += "보";
                    break;
                }
                
                String computerMessage = new String("컴퓨터의 선택: ");
                switch(comnum) {
                case 1:
                
                    computerMessage += "가위";
                    break;
                case 2:
                    computerMessage += "바위";
                    break;
                case 3:
                    computerMessage += "보";
                    break;
                }
               
                System.out.println(userMessage);
                System.out.println(computerMessage);
              
                
                if (comnum==user) {
                    System.out.println("ㅋ 무승부 ㅋ");
                    draw++;
                } else {
                    
                    if(user==SCI) {
                        if(comnum==ROCK) {
                        System.out.println("패배......");
                        lose++;
                    } else {
                        System.out.println("승리ㅎㅎㅎㅎㅎㅎㅎ");
                        win++;
                    }
                    
                    
                    } else if(user==ROCK) {
                        if(comnum==PAPER) {
                            System.out.println("패배......");
                            lose++;
                        } else {
                            System.out.println("승리ㅎㅎㅎㅎㅎㅎㅎ");
                            win++;
                        }
                    } else if(user==PAPER ) {
                        if(comnum==SCI) {
                            System.out.println("패배......");
                            lose++;
                        } else {
                            System.out.println("승리ㅎㅎㅎㅎㅎㅎㅎ");
                            win++;
                        }
                    } 
                    
                }
                
            } else if ( menu == 2) {
               
                int total = win + lose + draw;
                System.out.printf("[%3d]전 [%3d]승 [%3d]패 무승부: [%3d]번 승률: [%5.2f%%]\n", total, win, lose, draw, (double)win/total*100);
                
                
                
                
            } else {
                System.out.println("프로그램 종료");
                break;
            }
            
            
            
           
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        scanner.close();
    }

}

















