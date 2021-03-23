package kr.co.bitcamp.typeparameter5;

public class Compare {
    
    // 매개변수 T타입을 Number(추상클래스) 타입이거나  Number클래스를 상속받는
    // 자손 클래스만 T타입으로 들어올 수 있다.(상위타입은 제한함(Number클래스 위의 타입))
    public static<T extends Number> int compare(T t1, T t2) {
        
        // Number클래스의 doubleValue()는 원래 추상메서드이지만,
        // 이를 상속받은 자손클래스(Integer, Double, long 등)가 doubleValue()를 
        // 오버라이딩 했으므로 문제가 되지않음.
        
        double value1 = t1.doubleValue();
        double value2 = t2.doubleValue();
        
        
        return Double.compare(value1, value2);
    }


}
