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

public class Ex03RSP {
    static final int VALUE_SCI = 1;
    static final int VALUE_ROCK = 2;
    static final int VALUE_PAPER = 3;
    static final int OPTION_MAX= 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int win = 0;
        int lose = 0;
        int draw = 0;
        
        while (true) {
            System.out.println("======[가위바위보게임]=====");
            System.out.println("----------------------");
            System.out.println(" 1. 플레이 2. 기록 3. 종료 ");
            System.out.print("> ");
            
            int menu = scanner.nextInt();
            
            if (menu == 1) {
                
                // 1. 컴퓨터가 가위 바위 보 중 하나를 선택하도록 한다.
                int computerNumber = random.nextInt(OPTION_MAX) + 1; // 이렇게 해야 1,2,3 중에 하나가 나옴.
                
                // 2. 사용자가 가위 바위 보 중 하나를 선택하도록 한다.
                System.out.println("1. 가위 2. 바위 3. 보");
                System.out.print("> ");
                int userNumber = scanner.nextInt();
                
                while(!(userNumber >= VALUE_SCI && userNumber <= VALUE_PAPER)) {
                    // 사용자가 만들 수 있는 최소값 VALUE_SCI , 최대 값 VALUE_PAPER
                    System.out.println("잘못 입력하셨습니다.");
                    // 사용자가 선택한 값이 1~3이 아닐 때 (VALUE_SIC~VALUE_PAPER사이의 값이 아닐 때)
                    System.out.println("1. 가위 2. 바위 3. 보");
                    System.out.print("> ");
                    userNumber = scanner.nextInt(); // 다시 입력하라는 메세지
                    
                    //while(userNumber)의 마지막 줄
                } // while문이 끝났다는 것은 사용자와 컴퓨터의 선택이 끝났다는 것.
                
                // 3. 사용자의 선택과 컴퓨터의 선택을 각각 출력해준다.
                String userMessage = new String("사용자의 선택: ");
                switch(userNumber) {
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
                switch(computerNumber) {
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
                // 사용자와 컴퓨터의 결과?값? 출력
                
                // 4. 사용자의 값과 컴퓨터의 값을 비교한다.
                //    '승리, 패배, 무승부' 셋 중 해당하는 값을 1 증가 시킨다.
                
                if(computerNumber==userNumber) {
                    //무승부
                    System.out.println("무승부ㅋ");
                    draw++;
                } else {
                    // 승리 혹은 패배 - 이걸 동시에 할 수 있다고?
                    if (userNumber == VALUE_SCI) {
                        // 사용자가 가위를 골랐을 경우
                        if (computerNumber == VALUE_ROCK) {
                            // 컴퓨터가 바위를 골랐을 경우
                            System.out.println("패배ㅠ");
                            lose++;
                        } else {
                            // 컴퓨터가 보를 골랐을 경우
                            System.out.println("승리ㅎ");
                            win++;
                        }
                        
                    } else if (userNumber == VALUE_ROCK) {
                        // 사용자가 바위를 골랐을 경우
                        if (computerNumber == VALUE_SCI) {
                            // 컴퓨터가 가위를 골랐을 경우
                            System.out.println("승리ㅎ");
                            win++;
                        } else {
                            // 컴퓨터가 보를 골랐을 경우
                            System.out.println("패배ㅠ");
                            lose++;
                        }
                        
                    } else if (userNumber == VALUE_PAPER) {
                        // 사용자가 보를 골랐을 경우
                        if (computerNumber == VALUE_ROCK) {
                            // 컴퓨터가 바위를 골랐을 경우
                            System.out.println("승리ㅎ");
                            win++;
                        } else {
                            // 컴퓨터가 가위를 골랐을 경우
                            System.out.println("패배ㅠ");
                            lose++;
                        }
                    } 
                    
                }
                
                // 5. 결과를 출력한다.(누가 승리하였는지 ex)컴퓨터 승!!)
                
                
                //if(menu==1)의 마지막 줄
            }else if (menu == 2) {
                // 현재 결과를 출력한다.
                // 단, 총 전적(승, 무, 패의 합)이 0이면
                // "아직 플레이 기록이 없습니다."를 출력해준다.
                
                int total = win + lose + draw;
                if (total==0) {
                    // 아직 플레이 기록이 없으므로 경고메세지만 출력
                    System.out.println("아직 플레이한 기록이 없습니다.");
                    
                } else {
                    // 플레이 기록이 있으므로 출력해준다.
                    System.out.printf("%03d전 %03d승 %03d패 (%5.2f%%)\n", total, win, lose, (double)win/total*100);
                    System.out.println();
                }
                
                
                // else if(munu==2)의 마지막줄
            } else if (menu == 3){
                
                System.out.println("프로그램을 종료합니다.");
                break;
                
                
                // else if(menu==3)의 마지막 줄
            }

        
        
      // while(true) 마지막 줄
        }  
        
        scanner.close();
    }
    
}











