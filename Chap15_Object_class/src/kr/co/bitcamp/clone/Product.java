package kr.co.bitcamp.clone;

import java.util.Arrays;

// 클래스의 복제가 가능하게 하려면, java.lang.Cloneable 인터페이스를 구현해야함
public class Product implements Cloneable {
    
    private String id;
    private String name;
    private int price;
    private int[] arr;
    
    // 오버로드된 생성자 추가
    public Product(String id, String name, int price, int[] arr) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.arr = arr;
    }
    
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int[] getArr() {
        return arr;
    }
    
    @Override
    public String toString() {        
        return "상품id : " + this.getId() + "\n" +
               "상품이름 : " + this.getName() + "\n" +
               "상품가격 : " + this.getPrice() + "\n" +
               "배열값 : " + Arrays.toString(this.arr) + "\n";
    }
    
    public Product getProduct() {
        
        Product cloned = null; 
        
        try { 
            // 여기서 얕은 복제가 일어남(참조변수의 값들은 번지 공유)
            cloned = (Product)this.clone(); // 여기서의 clone()은 Object클래스의 얕은 복제
                                            // 타입을 맞춰줘야 하므로 업캐스팅
        } catch (CloneNotSupportedException e) {
            
           // e.printStackTrace();
        } 
        
        
        return cloned;
    }
    
    
    
    
    

}
