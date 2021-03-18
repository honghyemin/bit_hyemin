package kr.co.bitcamp.object1;


public class FieldInit{ // public class FieldInit extends Object // object는 모든 클래스가 자동적으로 상속을 받음

    // [멤버변수]
    // >기본형 변수
    byte byteField;     // 1byte
    short shortField;   // 2byte
    int intField;       // 4byte - 디폴트타입
    long longField;     // 8byte
    
    boolean booleanField; // 1byte
    char charField;       // 2byte - 유니코드
    
    float floatField;     // 4byte
    double doubleField;   // 8byte
    
    
    // >참조형 변수
    int[] arrField;       // 4byte
    String strField;      // 4byte
    
    
    // toString() : 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할때나 
    //              원하는 포맷으로 원하는 멤버변수들을 출력하고자 할 때 많이 사용.
    
    public String toString() { // 멤버들의 값을 확인하는 용도로 사용
        
        // 재정의(오버라이드)
         String str = "byteField : " + byteField + 
                      ", shortField : " + shortField +
                      ", intField : " + intField +
                      ", booleanField : " + booleanField +
                      ", strField : " + strField; 
         
        
        
        return str;
        
    }
    
    
    
}
