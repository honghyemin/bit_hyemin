package kr.co.bitcamp.inheritance02;

public class Circle extends Shape {

    Point center;       // 원점
    int radius;         // 반지름
    
    public Circle() { // 기본생성자
        this(new Point(0, 0), 100);
    }
    
    public Circle(Point center, int radius) { // 오버로드 생성자
        System.out.println("Circle클래스의 매개변수가 있는 생성자 호출");
        this.center = center; // 초기화
        this.radius = radius; // 초기화
    }
    
    @Override
    public void draw() {           // 상속관계에서 재정의가 이루어 질 수 있음을 나타냄
        System.out.println("색깔 : " + this.color);
        System.out.println("원점 : ( x : " + this.center.x + 
                            ", y : " + this.center.y +
                            ", 반지름 : " + this.radius + ")");
    }
    
}
