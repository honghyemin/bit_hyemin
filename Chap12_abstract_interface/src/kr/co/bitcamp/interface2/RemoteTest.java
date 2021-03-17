package kr.co.bitcamp.interface2;

public class RemoteTest {

    public static void main(String[] args) {
        
        // 인터페이스도 일종의 조상으로 필드의 다형성이 허용된다. 
        RemoteControl rContol = new Television();
        rContol.turnOn();
        rContol.setVolume(15);
        rContol.setVolume(-10);
        rContol.turnOff();
        System.out.println();
        
        
        rContol = new Audio();
        rContol.turnOn();
        rContol.setVolume(15);
        rContol.setVolume(-50);
        rContol.turnOff();
        
        
    }

}
