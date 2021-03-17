package kr.co.bitcamp.abstractt;

public abstract class KakaoSender02 extends ContentSender {
    
    private String content;

    public KakaoSender02(String title, String name, String content) {
        super(title, name);
        this.content = content;
    }

    // 상속을 받되 하나라도 오버라이드를 하지 않았으면 추상클래스가 됨.
    // 추상클래스인 조상클래스가 두 개의 추상메서드가 있으면 두개 다 오버라이드를 실행해야함. 그렇지 않으면 추상클래스가 됨.
    @Override
    public void sendMessage(String content) {
        
        
    }

    
        
        
    
     
    

}
