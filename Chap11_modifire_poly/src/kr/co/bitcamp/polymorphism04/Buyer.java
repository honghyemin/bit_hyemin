package kr.co.bitcamp.polymorphism04; // 매개변수의 다형성

public class Buyer {
    
    int money = 1000;       // 소유금액
    int bonusPoint = 0;     // 보너스점수
    
//    public void buy(TV tv) {
//        if(this.money < tv.price) {
//            System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
//            return; // 메서드가 진행되지 않고 끝남
//        } 
//        
//        this.money -= tv.price;
//        this.bonusPoint += tv.bonusPoint;
//        
//    }
//    
//    public void buy(Audio audio) {
//        if(this.money < audio.price) {
//            System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
//            return; // 메서드가 진행되지 않고 끝남
//        } 
//        
//        this.money -= audio.price;
//        this.bonusPoint += audio.bonusPoint;
//        
//    }
//    
//    public void buy(Computer com) {
//        if(this.money < com.price) {
//            System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
//            return; // 메서드가 진행되지 않고 끝남
//        } 
//        
//        this.money -= com.price;
//        this.bonusPoint += com.bonusPoint;
//        
//    }
    // Product이거나 Product의 자손들은 이 매개변수에 다 들어올 수 있다는 것을 의미함.
    // = 매개변수의 다형성 
    public void buy(Product product) {
        if(this.money < product.price) {
            System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
            return; // 메서드가 진행되지 않고 끝남
        } 
        
        this.money -= product.price;
        this.bonusPoint += product.bonusPoint;
        
    }
    
    
    

}






















