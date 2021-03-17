package kr.co.bitcamp.abstractt2;

public class phoneTest {

    public static void main(String[] args) {
        
        // 조상클래스는 추상클래스이므로 객체생성을 할 수 없음.
        // Phone phone = new Phone(11, "홍길동", "갤럭시" );

        
        // 자식 관계에서 객체 생성
        SmartPhone smartphone = new SmartPhone(4523, "애플", "홍혜민");
        smartphone.showInfo();
        smartphone.turnOn();
        smartphone.turnOff();
        smartphone.internetSerch();
        System.out.println("--------------------------------");
        
        
        // 자식 관계에서 객체 생성2
        TripleCameraPhone triplecameraphone = new TripleCameraPhone(7388, "갤럭시", "두부");
        triplecameraphone.showInfo();
        triplecameraphone.turnOn();
        triplecameraphone.turnOff();
        triplecameraphone.cameraOn();
        triplecameraphone.cameraOff();
        System.out.println("--------------------------------");

        //필드의 다형성을 이용해 배열객체 생성
        Phone[] phone = new Phone[10];
        phone[0] = new SmartPhone(201106, "샤오미", "홍길동");
        phone[1] = new TripleCameraPhone(201112, "LG", "콩");
        // 조상클래스에 대한 멤버만 보임.
        
        phone[0].turnOn();
        phone[0].turnOff();
        phone[1].turnOn();
        phone[1].showInfo();
        
    }

}

















