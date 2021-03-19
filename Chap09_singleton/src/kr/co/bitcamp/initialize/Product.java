package kr.co.bitcamp.initialize;

public class Product {
    
    static int number = 0;          // 공유
    int countNo;                    // 인스턴스별 개별생성
    int[] arr = new int[10];
    
    // 인스턴스 초기화 블럭(정적멤버가 사용가능)
    {
        System.out.println("인스턴스 초기화 블럭 호출됨.");
        ++number;
        this.countNo = Product.number;
        
        // 복잡한 초기화같은 경우는 초기화 블럭 실행문에서 작성하면 가독성이 좋아짐.
        for(int i = 0; i<arr.length; i++) {
            this.arr[i] = (int)(Math.random()*10) +1;
        }
        
    }
    
    // 정적 초기화 블럭(단 한번만 실행됨.)
    static {
        System.out.println("정적 초기화 블럭 실행 호출됨.");
    }
    
    
    public Product() {
        System.out.println("기본생성자 호출됨.");
    }

}
