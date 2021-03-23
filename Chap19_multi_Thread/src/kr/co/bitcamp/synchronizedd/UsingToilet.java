package kr.co.bitcamp.synchronizedd;

public class UsingToilet extends Thread {
    
    // 공유객체 멤버로 추가
    private Toilet toilet;

    // 오버로드된 생성자로 정의
    public UsingToilet(Toilet toilet, String name) {
        this.toilet = toilet;
        this.setName(name);
        
    }
    
    @Override
    public void run() {
        try {
            this.toilet.use();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
      
    }
    

}























