package kr.co.bitcamp.object4;

public class Time {
    
    // *접근제어자 (Access Modifier)의 종류
    //  - private : 같은 클래스 내에서만 접근(호출) 가능함
    //  - protected : 같은 패키지, 자손클래스에서만(상속의 경우에만) 접근가능함
    //  - (default) : 같은 패키지에서만 접근 가능
    //  - public : 누구나 다 접근 가능함
    
    private int hour;
    private int minute;
    private int second;
    
    // getter() : 멤버변수의 값(ex)hour,minute,second...)을 읽어가는 메서드(확인하는 용도)
    public int/*리턴타입*/ getHour() {          
             
       return this.hour;
    }
    // setter() : 멤버변수의 값을 수정(세팅)하는 메서드
    public void/*리턴타입 굳이 필요 없음*/ setHour(int hour) { //hour값을 설정해야해서 매개변수가 있어야 함
        // '시'에 대한 예외처리 코드를 작성(값의 범위 지정. 0~23시)
        if(hour<0 || hour>23) {
            System.out.println("시간을 잘못 입력했습니다.");
            return; // 다음 코드로 넘어가지 않게해줌
        }
        
        this.hour = hour;
        
    }
    // getter()
    public int getMinute() {
        return this.minute;
    }
    // setter()
    public void setMinute(int minute) {
        
        if(minute<0 || minute > 59) {
            System.out.println("분을 잘못 입력했습니다.");
            return;            
        }           
        this.minute = minute;
    }
    public int getSecond() {
        return this.second;
    }
    public  void setSecond(int second) {
        if(second<0 || second > 59) {
            System.out.println("초를 잘못 입력했습니다.");
            return;
        }
        this.second = second;
    }
    
    
    public String toString() {
        return this.getHour() + "시 입니다." +
               this.getMinute() + "분 입니다." + 
               this.getSecond() + "초 입니다."; 
        
    }

}

















