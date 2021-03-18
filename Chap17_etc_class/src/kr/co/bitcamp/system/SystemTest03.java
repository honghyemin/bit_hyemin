package kr.co.bitcamp.system;

import java.util.Properties;
import java.util.Set;

public class SystemTest03 {

    public static void main(String[] args) {
        
        String osName = System.getProperty("os.name");
        System.out.println("현재 운영체제 : " + osName);
        
        String userName = System.getProperty("user.name");
        System.out.println("사용자 계정 : " + userName);
        
        // Properties 클래스는 Map계열의 컬렉션이다.
        // key 값 : String / value 값 : String 
        
        
        // key 값 value 값
        
        Properties properties = System.getProperties();
        
        // Map컬렉션에서 키값만 Set계열로 가져오는 메서드 : keySet()
        Set set = properties.keySet();
        
        System.out.println("Key                                              value");
        System.out.println("------------------------------------------------------------");
        for(Object objkey : set) {  // key값을 set에 참조변수로 정의..?
            String key = (String) objkey;
            String value = System.getProperty(key); // 위에서 하나하나 받은 키 값을 넣음
            System.out.println(key +"                            " + value);
            
        }

    }

}
