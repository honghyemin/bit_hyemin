package kr.co.bitcamp.anonymous;

public class ChildTest {

    public static void main(String[] args) {
       
        // 클래스를 익명자손객체로 만듦..?
        Parent parent = new Parent() {  // 원래타입이 클래스. parent의 내용만 보임
         
            int b = 20;
            
            public void method1() {
                System.out.println("익명 자손 객체의 메서드");
            }
            
           @Override
        public void method() {
            int a = 10;
            System.out.println("a : " + a);
            System.out.println(this.b);
            this.method1();
            
        }
           
           
       };
       parent.method();
       //parent.b;      // 부모타입으로 정의가 되었기때문에 호출할 수 없음.
       //parent.method1(); 
    }

    // 원래 타입이 parent타입이므로?? 익명자손객체내에서 생성한 것은 보이지 않음.
}
