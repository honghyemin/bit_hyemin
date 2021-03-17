package kr.co.bitcamp.carddeck;

public class Deck {
    
    final int CARD_NUM = 52;    // 카드의 총 갯수 (13장 * 4)
    
    // 객체 배열(2차원 배열 타입)을 멤버로 추가 
    Card[] card = new Card[CARD_NUM];
    
    int i = 0;
    
    // 인스턴스 초기화 블럭
    {
        // 52번을 실행하면서 카드의 number를 초기화
        for(int k = Card.KIND_MAX; k>0; k--) {      // 4, 3, 2, 1 순서 : 무늬
            for(int n=1; n<Card.NUM_MAX+1/*1부터 시작했으므로*/; n++) {
                card[i++]/*카드가 계속 변경되어야 하므로*/ = new Card(k, n);     // 13개(카드번호는 1부터이므로 +1)
            }
        }
        
        // 위의 초기화 블럭에서 제대로 초기화가 이루어졌는지 확인하기 위하여 내용을 출력
        for(int j = 0; j<card.length;/*2차원 전체를 가리키는 참조 변수*/ j++) {
            System.out.printf("Card[%2d]의 무늬 : %d, Card[%2d]의 숫자 : %d \n", 
                                j, card[j].kind, j, card[j].number);
        }
    }
    
    public Deck() {
        //uper();
        System.out.println("Deck 기본생성자 호출");
    }
    
    // 지정된 위치(배열의 index)에 있는 카드 하나를 선택
    public Card  pick(int index) {
        if(0 <= index && index<CARD_NUM) {          // 예외 상황 처리
            return card[index]; // 해당번째 카드를 리턴
            
        }
        else {
            return pick();                          // 52개? 사이의 숫자가 아닐 경우 (오버로딩)
        }
              
        
    }
    // Deck에서 카드 하나를 임의로 선택 (오버로딩)
    public Card pick() {
        int index = (int)(Math.random()*CARD_NUM);
        System.out.print("임의로 뽑은 카드 > ");
        System.out.printf("%d번은 ", index);
        
        return pick(index);
    }
    
    // 카드를 단순히 섞는 기능
    
    public void shuffle() { 
        for(int n = 0; n<1000; n++ /*카드를 1000번 무작위로 섞음*/) {
            // 카드를 무작위로 섞음
            int i = (int)(Math.random()*CARD_NUM);
            Card temp = card[0];
            card[0] = card[i];
            card[i] = temp;
            
        }
        
        System.out.println();
        System.out.println("카드 섞은 후의 결과");
        for(int j = 0; j<card.length;/*2차원 전체를 가리키는 참조 변수*/ j++) {
            System.out.printf("Card[%2d]의 무늬 : %d, Card[%2d]의 숫자 : %d \n", 
                                j, card[j].kind, j, card[j].number);
        }
        
    }
    
  

}



















