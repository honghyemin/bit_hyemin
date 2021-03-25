package kr.co.bitcamp.arraylist;

import java.util.ArrayList;

// - 자바 배열은 크기를 미리 지정하고 사용함. -> 넉넉하게 크기를 지정해놓고 사용함.
// - ArrayList는 필요 시 언제든지 추가, 삭제가 가능함.
// - List 인터페이스를 상속하므로 인덱스가 있고, 저장 순서가 유지되고, 데이터 중복이 가능함.
// - 또한 제네릭 문법을 사용할 수 있다. -> 만약 제네릭을 사용하지 않는다면 내부적으로 Object타입(다형성 적용)으로 처리된다.

public class ArrayListTest01 {

    public static void main(String[] args) {
        
        // ArrayList를 제네릭이 아닌 Object타입으로 사용하는 경우.
        ArrayList list = new ArrayList();   // 기본적으로 10개의 방을 생성하고 있다.
        System.out.println("총 크기 : " + list.size());
        
        // 객체 추가
        list.add("111");    // 순차적으로 추가가 된다.
        list.add("222");
        list.add("333");
        list.add("222");
        
        list.add(333);  // list.add(new Integer(333))
        System.out.println("총 크기 : " + list.size());
        System.out.println("ArrayList의 주소 : " + list.hashCode());
        System.out.println("ArrayList에 있는 값 : " + list.toString());
        
        // 특정 인덱스에 값 추가 (ex.0번째 인덱스에 "333"추가)
        list.add(0, "333");
        System.out.println("ArrayList에 있는 값 : " + list.toString());
        System.out.println();
        
        // 객체 삭제하기
        // - 앞에서부터 검색하여 해당 되는 값(ex."333")을 삭제.
        // - 앞에서부터 가까운 것 한 개만 삭제.
        list.remove("333");
        System.out.println("ArrayList에 있는 값 : " + list.toString());
        
        System.out.println(list.remove("333")); // boolean타입 출력
        System.out.println("ArrayList에 있는 값 : " + list.toString());
        
        // 문자열이 존재하는지 찾음
        // 지정된 객체의 인덱스를 찾아오기 ( 없다면 -1 값을 리턴, 존재한다면 해당 인덱스의 번호를 리턴)
        System.out.println("index = " + list.indexOf("333"));
        System.out.println("index = " + list.indexOf(333));

        // 객체를 전부 삭제하기
//        list.clear();
//        System.out.println("ArrayList에 있는 값 : " + list.toString());
            
        // 앞에서부터 삭제
        // 인덱스 0을 삭제할 때, i가 0이므로 당연히 0인덱스에 있는 객체가 삭제됨.
        // 이후 i값이 증가하면서 제대로 삭제가 되지 않음.
//        for(int i=0; i<list.size(); i++) {
//            list.remove(i);
//            System.out.println("ArrayList에 있는 값 : " + list.toString());
//        }
        
        // 삭제를 시키려면 항상 뒤에서부터 삭제를 해주는 것임.
        
        // 뒤에서부터 삭제
        for(int i=list.size()-1 /*int i=list.size()로만 사용하면 out of Bounds발생*/; i>=0; i--) {
            list.remove(i);
            System.out.println("ArrayList에 있는 값 : " + list.toString());
        }


    }

}


















