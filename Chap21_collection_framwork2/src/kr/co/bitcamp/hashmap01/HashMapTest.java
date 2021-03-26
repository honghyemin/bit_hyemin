package kr.co.bitcamp.hashmap01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        
        // 키가 String , 값이 Integer. 둘다 객체라는 것에 주목
        Map<String, Integer> map = new HashMap<>();
        System.out.println("사이즈 : " + map.size());
        
        map.put("최지만", 95);
        map.put("류현진", 90);
        map.put("추신수", 80);
        map.put("류현진", 95);
        map.put("추신수", 100);
        
        // map은 중복된 키는 저장하지 않는다. 류현진과 추신수가 2번씩 저장되었다.
        System.out.println("사이즈 : " + map.size());

        // 중복저장이 될 경우 마지막에 저장된 값으로 대처가 된다.
        System.out.println("류현진 : " + map.get("류현진"));
        System.out.println("추신수 : " + map.get("추신수"));
        System.out.println("--------------------------------------------");
        
        // map컬렉션에 있는 key값만 Set계열로 바꾼다.
        Set<String> set = map.keySet(); 
        System.out.println("keySet()을 이용해서 출력함");
        
        // 반복자 얻기
        Iterator<String> iterator = set.iterator();
        
        while(iterator.hasNext()) {
            String key = iterator.next();
            
            //value값 저장
            int value = map.get(key); // 반복자를 통해서 얻은 key값을 가지고 value값을 얻어옴(리턴)
            System.out.println(key + " : " + value);
        }
        System.out.println("--------------------------------------------");
        
        // Map 컬렉션의 Map.Entry객체를 대상으로 Set계열로 바꾼다.
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("entrySet()을 이용해서 출력함");
        
        // 반복자 얻기
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            // 키값과 value값을 entry를 통해 얻을 수 있음
            String key = entry.getKey(); //키 값을 얻는다
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println("--------------------------------------------");

        // 전체 객체 삭제
        map.clear();
        System.out.println("사이즈 : " + map.size());

        
        
        
        
        
        
    }

}

















