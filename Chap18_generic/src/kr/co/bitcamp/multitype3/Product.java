package kr.co.bitcamp.multitype3;

// 제네릭 클래스인데 타입 파라미터가 2개. (설계클래스)
public class Product<T, M>  {
    
    private T t;
    private M m;
    
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public M getM() {
        return m;
    }
    public void setM(M m) {
        this.m = m;
    }
    
    // 어떤 타입이 들어올 지 모르기 때문에 toString 들어오기는 애매함.
    

}
