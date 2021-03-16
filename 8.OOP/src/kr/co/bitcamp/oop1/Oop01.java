package kr.co.bitcamp.oop1;

// 클래스란 무엇이며 어떤 역할을 하는가.

// [1] 클래스란 무엇인가?
//     : 클래스란 객체(또는 인스턴스)를 생성하는 하나의 공장(= 틀, 프레임, 판형 등등).
//       - 예를 들어 자동차class(공장), 동물 class(공장), AI로봇 class(공장)..모든 것이 대상이 됨.

// [2] 클래스 공장을 통해서 객체를 어떻게 만드는가?
//     - 2개 정도로 압축해 봤을때 "특징"과 "동작"이 된다.
//     - 객체의 특징 : 속성(attribute, field)
//     - 객체의 동작 : 메서드(method), 함수

// [3] 클래스는 왜 나왔을까?
//     - 클래스 없이도 객체의 특징들을 변수로 정의할 수 있을 것이고, 동작은 함수로 정의할 수 있을 것이다.
//       그러나 프로그램 규모가 커지고 여러사람이 협업을 하는 과정에서 좀 더 체계적이고 분업화된 시스템으로
//       개발하고 확장해나갈 필요성이 있다.
//       그런 일련의 과정에서 OOP(객체 지향 프로그래밍)가 만들어지고 발전해왔음.
//       거의 모든 프로그래밍 언어에서 OOP 문법을 지원하고 있고 
//       하나의 언어로 OOP문법을 공부하면 다른 언어에서도 거의 동일하다.
//       즉, 자바 언어로 OOP를 개발하고 python, java script를 접할 때 상당히 용이하다.

// FarmMachine의 속성과 동작들을 가지는 클래스를 코드로 구현하고 객체를 생성하여 동작시키기.

class FarmMachine {
    // [1] 속성(특징)
   
    int price; // 가격
    int year;  // 연식
    String color; // 색상
    
    // [2] 동작/기능/행동(method) -> 농기계마다 동작이 다양할 것이므로 공통적인 동작을 생각해본다.
    
    public void move() {
        System.out.println("FarmMachine is moving");
        
    }
    public void dig() {
        System.out.println("FarmMachine is digging");

    }
    
    public void grind() {
        System.out.println("FarmMachine is grinding");

    }
    
    
}

public class Oop01 {
    public static void main(String[] args) {
        
        // 객체 생성
        FarmMachine fMachine = new FarmMachine();
        System.out.println(fMachine);
        
        // 생성된 객체 속성 값 입력하기
        fMachine.price = 1000000;
        fMachine.year = 2021;
        fMachine.color = "blue";
        
        // 속성 값 출력
        
        System.out.println("기계의 가격: " + String.format("%,d",fMachine.price) + "원"); // 천단위로 나누는 코드식 String.formet("%,d...)
        System.out.println("기계의 연식: " + fMachine.year + "년");
        System.out.println("기계의 색상: " + fMachine.color );

        // 동작 수행하기
        fMachine.move();
        fMachine.dig();
        fMachine.grind();
        
        
    }

}














