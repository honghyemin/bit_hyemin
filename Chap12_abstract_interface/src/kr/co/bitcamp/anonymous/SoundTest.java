package kr.co.bitcamp.anonymous;

public class SoundTest {

    public static void main(String[] args) {
        
        
        // 인터페이스는 객체 생성 불가능, 그러나 익명 구현 객체(no name)의 생성자를 만듦.
        //      -> 'UI이벤트처리나 스레드객체 간편하게 생성 시' 등에 주로 사용.(잠깐 사용할 목적)
        Soundable soundable = new Soundable() {    // 원래 타입이 인터페이스임.
                                                   // 익명구현객체 안에 있는 생성자를 호출함.
            
            // 클래스이므로 내부적으로 멤버들을 선언(정의)할 수 있음.
            // 대신 외부에서 접근 불가
            int a  = 10;
            
            public void method() {
                System.out.println("익명구현객체의 메서드");
            }
            
            @Override
            public void sound() {
                String str = "냄비";
                System.out.println("첫번째 익명구현객체 : " + str); 
                System.out.println(str + "에 물을 담습니다.");
                System.out.println(str + "에 숟가락으로 소리를 냅니다.");
                
                this.method();
                System.out.println(this.a);
                
                
            }
        };
        
        soundable.sound();
       // soundable.a();           내부적으로만 정의할수 있으므로 블럭을 벗어나 외부에서는 호출할 수 없음.
       // soundable.method();

    }

}
