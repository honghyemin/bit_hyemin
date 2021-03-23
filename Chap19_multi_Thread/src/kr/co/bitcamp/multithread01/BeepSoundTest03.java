package kr.co.bitcamp.multithread01;

import java.awt.Toolkit;

public class BeepSoundTest03 {

    // main()은 JVM이 실행
    public static void main(String[] args) {
        
        // 직접 스레드를 생성하는 방법 3가지
        // [방법 3] - 람다식(함수적 인터페이스) : JDK1.8부터 제공. 코드 절약, 가독성좋음
        Thread thread = new Thread(/*매개변수가 없을 때*/()->{
            Toolkit toolkit = Toolkit.getDefaultToolkit(); // 객체 생성
            for(int i=0; i<5; i++) {
                System.out.println("비프음 실행하는 스레드 명 : " +
                                    Thread.currentThread().getName());  
            }
            
            toolkit.beep();
            
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            
        });
        thread.start();
        for(int i=0; i<5; i++) {
            System.out.println("비프음 실행하는 스레드 명 : " +
                    Thread.currentThread().getName()); 
            
            System.out.println("삐융~~");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
