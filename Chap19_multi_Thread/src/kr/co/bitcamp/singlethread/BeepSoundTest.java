package kr.co.bitcamp.singlethread;

import java.awt.Toolkit;

// 싱글스레드를 멀티스레드로 바꿔서 프로그램을 멀티태스크하게 만드는 것이 우리가 지향하는 부분.
public class BeepSoundTest {

    
    // main()은 JVM이 실행한다.
    public static void main(String[] args) {
        // 현재 실행중인 스레드명을 출력함.
        System.out.println(Thread.currentThread().getName());
        
        // Toolkit은 추상클래스.
        // GUI 관련된 메서드들로 구성됨.
        // getDefaultToolkit()를 통해서 Toolkit 클래스의 참조를 얻어냄.
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        for(int i =0; i<5; i++) {
            System.out.println("for문을 실행하는 스레드 이름 : " + 
                                Thread.currentThread().getName());
            toolkit.beep(); // 비프음 출력
            
            try {
                Thread.sleep(900/*0.9초*/);  // 스레드가 너무 빨리 실행되므로 0.9초 동안 순간 멈추게 함.
            } catch (InterruptedException e) { // 예외처리를 해주어야 함.
                
                e.printStackTrace();
            } 
            
            
        }
        

    }

}
