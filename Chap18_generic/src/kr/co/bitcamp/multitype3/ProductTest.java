package kr.co.bitcamp.multitype3;

public class ProductTest {

    public static void main(String[] args) {
        // 멀티 타입 파라미터
        Product<Tv, String>/*클래스도 하나의 타입으로 정의할 수 있음*/ p1 = new Product<>();
        p1.setT(new Tv(2021, 3));
        p1.setM("LG OLED AI TV");
        System.out.println(" 나의 TV는 " + p1.getT().getYear() + "년 " +
                                        p1.getT().getMonth() +"월 식이며 " +
                                        p1.getM() + "입니다.");
        System.out.println("****************************************************");
        
        // 나의 차는 2021년 7월 출시될 현대의 펠리세이드 캘리그래피이다.
        Product<Car, String> p2 = new Product<>();
        p2.setT(new Car("현대", 2021, 7));
        p2.setM("펠리세이드 캘리그라피");
        
        Car car = p2.getT();
        String str = p2.getM();
        
        System.out.println("나의 차는 " + car.getYear() + "년 " +
                                        car.getMonth() + "월 출시될 " +
                                        car.getBrand() + "의 " + str + "입니다.");
        System.out.println();
//        System.out.println("나의 차는 " + p2.getT().getYear() + "년 " +
//                                        p2.getT().getMonth() + "월 출시될 " +
//                                        p2.getT().getBrand()+ "의 " + p2.getM() + "입니다.");
//        
        
        
    }

}
