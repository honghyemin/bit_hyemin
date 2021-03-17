package kr.co.bitcamp.polymorphism05;

// 상품 관리 프로그램
// 조상클래스
public class Product {
    
    private int productId; // 품번
    private String description; // 상품설명
    private String maker; // 상품만든곳
    private int price; // 가격  
        
    // 생성자
     public Product(int productId, String description, String maker, int price) {
        super(); // object의 기본생성자를 호출함
        this.productId = productId;
        this.description = description;
        this.maker = maker;
        this.price = price;
               
        }
     // getter() 제공
    public int getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    } 
    
    public void showInfo() {
        System.out.println("[상품ID] > " + (this.getProductId()+1)); // default값을 0이아닌 1로 만들어줌. (상품번호가 1부터 시작)
        System.out.println("[상품설명] > " + (this.getDescription()));
        System.out.println("[생산자] > " + (this.getMaker()));
        System.out.println("[가격] > " + (this.getPrice()));
        
    }
     
     

}

























