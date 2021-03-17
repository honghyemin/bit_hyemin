package kr.co.bitcamp.polymorphism04;

public class TV extends Product{ 
    
    public TV() {
        // 조상클래스의 매개변수가 있는 생성자 Product(int price) {}를 호출
        super(300); // 조상클래스인 product에 기본생성자를 추가하거나 tv생성자를 만들어 그 안에super(값)을 넣어줘야함
    }
    
    @Override
    public String toString() {
        return "TV";
    }
    

}
