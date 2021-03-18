package kr.co.bitcamp.classs;

public class ClassTest {

    public static void main(String[] args) {
        
        // 1) 객체로부터 클래스 정보 얻기 (getClass())
        Person person = new Person();
        Class class1 = person.getClass(); // 리턴타입 : object가 제공하는 클래스
        System.out.println(class1.getName()); // 패키지명을 포함한 클래스명 리턴함
        System.out.println(class1.getSimpleName()); // 클래스명만 리턴함
        System.out.println();
        
        // 2) 문자열로부터 객체의 정보를 얻는 방법(Class.forName(""))
        try {
            Class class2 = Class.forName("kr.co.bitcamp.classs.Person");
            System.out.println(class2.getName()); // 패키지명을 포함한 클래스명 리턴함
            System.out.println(class2.getSimpleName()); // 클래스명만 리턴함
        } catch (Exception e) {
            
            e.printStackTrace();
        }

    }

}
