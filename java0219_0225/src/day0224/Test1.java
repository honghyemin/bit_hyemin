package day0224;
//숫자 맞추기 게임  

//메뉴를 만들어서
//1. 플레이 2. 기록보기 3. 종료
//1번을 누를 경우
//컴퓨터가 만든 난수를 사용자가 몇번만에 맞추는지 
//기록해서 최고기록과 비교해서 
//더 낮은 횟수가 최고기록이 되게 만들기
//2번을 누를 경우
//현재 최고기록을 보기
//3번을 누를 경우
//종료

import java.util.Scanner;
import java.util.Random;
public class Test1 {
    static final int NUMBER = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int bestScore = 0;
        
        while(true) {
            System.out.println("========숫자 맞추기 게임=========");
            System.out.println("===1. 플레이 2. 기록보기 3. 종료===");
            System.out.print("> ");
            
            int menu = scanner.nextInt();
            
            if(menu == 1) {
                int comnum = random.nextInt(NUMBER)+1;
                
                int currentScore = 1;
                System.out.print("숫자: ");
                int num = scanner.nextInt();
                
                
                
                
               while (num != comnum) {
                    System.out.println("땡!");
                    System.out.print("숫자: ");
                    num = scanner.nextInt();
                    currentScore++;
                } 
                
               System.out.printf("사용자의 이번 라운드 스코어 : [%3d]\n", currentScore);
               System.out.printf("     기존의 최고 스코어: [%3d]\n", bestScore);
                
               if (bestScore==0 || currentScore<bestScore) {
                   bestScore= currentScore;
                   System.out.println("짝짝짝! 기록 갱신입니다!");
               }
                
                
                
            } else if(menu ==2) {
                if (bestScore == 0) {
                    System.out.println();
                    System.out.println("아직 플레이 기록이 없습니다.");
                    System.out.println();
                } else {
                    System.out.printf("현재 최고 기록: [%3d]회 \n", bestScore);
                }
                
            } else {
                
                System.out.println("프로그램 종료");
                break;
            }
            
            
        }
        scanner.close();
    }

}
