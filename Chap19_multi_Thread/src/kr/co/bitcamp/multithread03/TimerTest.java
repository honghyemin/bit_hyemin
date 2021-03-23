package kr.co.bitcamp.multithread03;

import javax.swing.JOptionPane;

public class TimerTest {

    public static void main(String[] args) throws Exception {
       
        Thread thread = new TimerThread(); // start를 하기위해 객체 생성
        thread.start();
        
        String input = JOptionPane.showInputDialog("10초 안에 값을 입력하시오.");
        //System.out.println(input); // cancel을 누르면 null이 출력됨
        
        if(input != null) {
            System.out.println("입력 값 : " + input);
            System.exit(0); // 값이 출력이 되면서 끝남
            
        } else /*값이 null일 경우*/{
            Thread.sleep(10000); //10초를 대기한다. (10초동안 일시정지)
            System.out.println("입력하지 못하였습니다. 펑펑!!");
            System.exit(0);
        }

    }

}
