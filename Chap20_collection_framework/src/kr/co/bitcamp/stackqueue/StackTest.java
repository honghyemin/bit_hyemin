package kr.co.bitcamp.stackqueue;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
       
        Stack<Coin> coinBox = new Stack<>(); // 기본 데이터타입으로 클래스를 사용함.
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(10));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(500));
        
        while(!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue());
        }
    }

}
