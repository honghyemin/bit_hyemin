package kr.co.bitcamp.carddeck;

public class Card {
    
    // JVM 메모리상 클래스영역에 클래스 로딩됨과 동시에 올라감. 공용데이터로 활용
    
    static final int KIND_MAX = 4; // 카드 종류
    static final int NUM_MAX = 13; // 해당 종류의 카드의 총 갯수
    
    // 무늬를 상수로 지정
    static final int SPACE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    
    int kind;
    int number;
    
    // 생성자
    public Card(int kind, int number) {
        // super(); (컴파일러가 자동으로 넣어주므로 생략 가능) // Object class의 기본생성자를 호출
        this.kind = kind;
        this.number = number;
        
        
        
    }
    
    @Override
    public String toString() {
        
        // 지역변수는 반드시 초기화.
        String kind = "";
        String number = "";
        
        // 무늬
        switch(this.kind) {
        
            case 4 : 
                kind = "스페이드"; 
                break;            
            case 3 :
                kind = "다이아몬드";
                break;            
            case 2 :
                kind = "하트";
                break;            
            case 1 :
                kind = "클로버";
                break;
        }
        
        // 숫자 설정
        switch(this.number) {
        
        case 13 :
            number = "K";
            break;
        case 12 :
            number = "Q";
            break;
        case 11 :
            number = "J";
            break;
        case 10 :
            number = "10";
            break;
        default : number = this.number + ""/*문자열 변환 연산자""를 써줌으로써 문자열로 변환시킴.*/;
        }
        
        
        
        return "무늬 : " + kind + ", 숫자 : " + number;
        
    }
}






















