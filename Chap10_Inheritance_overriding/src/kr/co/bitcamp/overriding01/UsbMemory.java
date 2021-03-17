package kr.co.bitcamp.overriding01;

public class UsbMemory extends HddDisk {

    // 멤버변수
    int capacity;
    int rmp;
    
    // 매개변수가 있는 생성자
    public UsbMemory(int capacity, int rpm) {
        this.capacity = capacity;
        this.rpm = rpm;
    }

    // 조상클래스의 메서드를 오버라이딩(재정의)함
    @Override
    public String status() {

        String str = "USB 디스크 용량 : " + this.capacity + "\n" + 
                    "USB 디스크 속도 : " + this.rpm + "(rpm)";
        return str;
    }
    
    // override를 오버로드 할 수 있음. override는 하나의 메서드이기 때문.
    // 오버로드
    public String status(int i) {
        String str = "USB 디스크 용량2 : " + i + "\n" + 
                "USB 디스크 속도2 : " + this.rpm + "(rpm)";
    return str;
    }
    
}
