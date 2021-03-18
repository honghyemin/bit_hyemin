package kr.co.bitcamp.boxing;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingTest {

    public static void main(String[] args) {
        
        // 자동 방식
        Integer obj1 = 100;
        Integer obj2 = 300;
        
        List list = new Vector(); // java.lang에 있는 것이 아니라서 import해주어야 함
        list.add(obj1);
        list.add(obj2);
        list.add(500); // 원래는 오류가 나야함 (원래는 참조형으로 들어가야하지만 오류가 안남 = 자동박싱)
                       // list.add(new Integer(500)) - 원래 들어가야 하는 코드
        System.out.println(list);
        
        // 자동 언박싱
        int value1 = (Integer)list.get(0); // 0번째 인덱스의 값. 리턴타입 object. 기본형타입으로 초기화못하므로 타입변환해줘야함
        System.out.println(value1);
        
       
        int value2 = obj2.intValue(); // 정상코드
        int value3 = obj2;/*obj2는 참조번지이지만 값으로 자동언박싱이 됨*/
        System.out.println(value2);
        System.out.println(value3);
        
        // 객체 + 기본타입은 문법상 에러지만 포장클래스(wrapper)이기 때문에 컴파일러가 알아서 
        // 자동 언박싱을 해서 아래 코드가 가능하게 함.
        int result = obj1 + 500; // 문제없이 연산 가능
                                 // 원래는 obj1.intValue()가 정상
        System.out.println(result);

    }

}
