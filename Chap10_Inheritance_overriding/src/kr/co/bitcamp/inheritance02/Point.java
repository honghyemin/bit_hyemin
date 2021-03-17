package kr.co.bitcamp.inheritance02;

// 독립클래스
public class Point {

    int x;
    int y;
    
    // 기본생성자
    public Point() {
        this(0,0);          // 생성자에서 또다른 생성자를 호출할 때 사용
        
    }
    
   

    public Point(int x, int y) {
       System.out.println("Point클래스의 매개변수가 있는 생성자 호출");
       this.x = x;
       this.y = y;
    }
    
    
}
