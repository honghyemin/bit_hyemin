package kr.co.bitcamp.object3;

public class Monitor {

    // 멤버변수 (필드)
    String color; // 모니터 색상
    int channel; // 채널
    int volume; // 볼륨
    boolean power; // 전원(on/off)

    // 멤버메서드
    // 모니터를 켜거나 끄는 기능을 하는 메서드
    public void power() {

        if (!this.power) {
            System.out.println("모니터가 켜졌습니다.");
            this.power = !power; // power에 true값이 들어가 있는 상태. 원래 this.power의 값은 false
        } else {
            System.out.println("모니터가 꺼졌습니다.");
            this.power = !power;
        }

    }
    // channelUp() +1

    public void channelUp() {

        this.channel++;
        System.out.println("현재 채널 : " + this.channel);

    }

    // channelDowm() -1

    public void channelDown() {

        this.channel--;
        System.out.println("현재 채널 : " + this.channel);

    }

    // volumeUp()

    public void volumeUp() {

        this.volume++;
        System.out.println("현재 볼륨 : " + this.volume);
        
        // this.volume++; 선언 하지 않고 
        // System.out.println("현재 볼륨(v) : " + (++this.volume));으로 선언할 수도 있음.
    }

    // volumeDown()
    public void volumeDown() {

        this.volume--;
        System.out.println("현재 볼륨 : " + this.volume);
     // System.out.println("현재 볼륨(v) : " + (--this.volume));으로 선언할 수도 있음.
    }
    
    
    // toString()
    public String toString() {
        return "현재 채널 : " + this.channel+
                ", 현재 볼륨 : " + this.volume;
                
    }
    
    

}


















