package kr.co.bitcamp.abstractt;

public class SenderTest {

    public static void main(String[] args) {
        // 추상클래스이니 절대 인스턴스를 생성할 수가 없음.
        //ContentSender contentSender = new ContentSender("","");

        // 조상클래스도 추상클래스이므로 필드의 다형성 적용됨.
        // 그냥 클래스이므로 객체 생성가능
        ContentSender contentSender = new KakaoSender("카카오톡", "홍혜민", "안녕");
        contentSender.sendMessage("하하");
        
        ContentSender contentSender2 = new SmsSender("SMS", "두부", "잘가");
        contentSender2.sendMessage("홍혜민");
                
        
    }

}
