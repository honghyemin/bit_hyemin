package kr.co.bitcamp.abstractt;

public class SmsSender extends ContentSender {

    private String content;

    public SmsSender(String title, String name, String content) {
        super(title, name);
        this.content = content;
    }
    
    public String getContent() {
        return this.content;
        
    }

    @Override
    public void sendMessage(String recipient) { //로컬내에서만 사용하는 것이라서 다른 클래스의 변수명과 같아도 상관이 없음.
        System.out.println("제목 : " + this.getTitle());
        System.out.println("이름 : " + this.getName());
        System.out.println("내용 : " + this.getContent());
        System.out.println("받는 사람2 : " + recipient);
        
        
    }

    @Override
    public void sendMessage2(String content) {
        
        
    }
    
    
}
