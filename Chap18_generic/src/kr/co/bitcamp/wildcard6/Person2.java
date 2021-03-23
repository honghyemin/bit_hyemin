package kr.co.bitcamp.wildcard6;

// 조상클래스 용도로 사용
public class Person2 {
    
    private String name;
    
    public Person2(String name) {
        super();
        this.name= name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        
        return this.name;
    }

}
