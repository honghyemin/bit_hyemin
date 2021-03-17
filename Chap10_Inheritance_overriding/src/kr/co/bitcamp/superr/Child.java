package kr.co.bitcamp.superr;

public class Child extends Parent{ // 부모클래스인 Parent와 같은 매개변수명

    int x = 20;
 
    public Child() {
     // super();    // 조상클래스의 기본생성자를 호출, 기본생성자에 한해서만 생략하더라도 컴파일러가 알아서 추가함.
        super(200); // 조상클래스의 매개변수가 있는 '생성자'를 호출함(자식클래스가 생성이 되려면 부모클래스가 먼저 생성이 되어야 하므로), 절대 생략 x
    }
    
    public void show() {
        System.out.println("현재 인스턴스의 x값 : " + x);
        System.out.println("자손 클래스의 this.x  : " + this.x);
        System.out.println("조상 클래스의 this.x  : " + super.x);

    }
}
