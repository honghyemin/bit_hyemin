package kr.co.bitcamp.hashset01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>(); // 오버라이드는 호출되나 부모타입만 보임
        System.out.println("사이즈 : " + set.size());
        
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add("Java");
        
        System.out.println("사이즈 : " + set.size()); // 중복허용이 되지 않으므로 같은 값은 사이즈1개로 나옴
        System.out.println("---------------------------------------------");
        
        // Set 계열은 중복 저장이 안된다.
        // 인덱스 정보가 없음(주머니 하나에 다 넣음) -> 순서 유지를 하지 않음.
        // Set 계열에는 null값도 저장가능하지만, 오직 1개만 저장된다.
        
        set.add("JDBC");
        set.add("JSP");
        set.add("myBATIS");
        set.add("MySQL");
        set.add(null);
        set.add(null);
        
        System.out.println("사이즈 : " + set.size());
        System.out.println("---------------------------------------------");
        
        // 반복자를 통해서 set객체를 얻는다.
        Iterator<String> iterator = set.iterator();
        
        while(iterator.hasNext()/*다음으로 가져올 것이 있는 가 있으면:true 없으면 false를 리턴*/) {
            String element = iterator.next(); // 객체를 가져오세요
            System.out.println(element);
            System.out.println("사이즈 : " + set.size()); // 변경이 없으면 6이 찍힐 것임
        }
        System.out.println("---------------------------------------------");

        set.remove("JDBC"); // 객체 삭제
        set.remove("JSP");  // 객체 삭제
        System.out.println("사이즈 : " + set.size());
        System.out.println("---------------------------------------------");

        for(String str : set) {
            System.out.println(str);
        }
        System.out.println("---------------------------------------------");

        // 전체삭제        
        set.clear();
        if(set.isEmpty())
            System.out.println("객체가 없습니다.");
        else
            System.out.println("객체가 존재합니다.");
    }

}


















