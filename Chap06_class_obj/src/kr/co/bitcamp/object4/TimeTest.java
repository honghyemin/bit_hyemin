package kr.co.bitcamp.object4;

public class TimeTest {

    public static void main(String[] args) {

        Time time = new Time();
        // time.hour = 10; (private로 불가)

        System.out.println(time.getHour());
        System.out.println(time); // 오버라이드된게 호출됨.
        
        // '시'를 설정
        time.setHour(10);
        time.setMinute(55);
        time.setSecond(54);
        System.out.println(time);

        time.setHour(223);
        System.out.println(time);

    }

}
