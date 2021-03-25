package kr.co.bitcamp.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // Queue 인터페이스를 구현한 LinkedList클래스 생성 후 대입하고 있다.
        Queue<String> queue = new LinkedList<>();
        
        //후입선출(LIFO : Last In First Out) -- 복사기 용지
        stack.push("0");
        stack.push("1");
        stack.push("2");
        
        //선입선출(FIFO : First In First Out) -- 파이프, 수도호스
        queue.offer("0");
        queue.offer("1");
        queue.offer("2");
        
        System.out.println("__스택__");
        while(!stack.isEmpty()/*스택이 비어있지 않으면*/) {
            System.out.println(stack.pop());//pop : 꺼내기
        }
        
        System.out.println("__큐__");
        while(!queue.isEmpty()/*큐가 비어있지 않으면*/) {
            System.out.println(queue.poll());
        }

    }

}
