package kr.co.bitcamp.object3;

public class MonitorTest {

    public static void main(String[] args) {

        // monitor 참조변수는 같은 것이라 할 수 있음. 참조번지.
        Monitor monitor = new Monitor();
        // System.out.println(monitor); -> 오버라이드를 하지 않았으므로 주소값이 나옴
        
        monitor.power(); // 토글형식(?)으로 진행
        monitor.power();
        monitor.power();
        
        monitor.channel = 5; // 기존 채널의 번호 5.
        monitor.channelUp();
        monitor.channelUp();
        
        monitor.channelDown();
        monitor.channelDown();
        
        
        monitor.volumeUp();
        monitor.volumeUp();
        
        monitor.volumeDown();
        
        
        System.out.println(monitor.toString());
        
        monitor.power();

    }

}
