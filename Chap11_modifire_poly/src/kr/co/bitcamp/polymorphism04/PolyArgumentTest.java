package kr.co.bitcamp.polymorphism04;

public class PolyArgumentTest {

    public static void main(String[] args) {
        
        Buyer buyer = new Buyer();
        
        buyer.buy(new TV());
        
        System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
        System.out.println("현재 보너스 포인트 : " + buyer.bonusPoint + "점입니다.");
        
        buyer.buy(new Audio());
        buyer.buy(new Computer());
        System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
        System.out.println("현재 보너스 포인트 : " + buyer.bonusPoint + "점입니다.");

        // Apple클래스는 Product클래스와 상속관계에 있지 않으므로 컴파일에러가 발생.
        // buyer.buy(new Apple()); 
        
        // 필드의 다형성 - 부모타입으로 여러 자식타입을 제어할 수 있다.
        Product product1 = new TV();
        Product product2 = new Computer();
        Product product3 = new Audio();
        Product[] pArray = new Product[10];

    }

}
