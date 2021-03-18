package kr.co.bitcamp.stringbuilder;

public class StringBuilderTest {

    public static void main(String[] args) {
        
        // StringBuilder, StringBuffer 클래스는 버퍼(임시저장메모리공간)를 이용하기 때문에, 
        // 수정한다 하더라도 새로운 인스턴스가 생성되는 것이 아니라,
        // 하나의 인스턴스를 가지고 문자열에 대한 조작이 가능.
        
        StringBuilder sBuilder = new StringBuilder("JAVA");
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        System.out.println();
        
        sBuilder.append(" Program");
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode()); // 해시코드 값이 같음 = 같은 인스턴스라는 의미
        System.out.println();
        
        sBuilder.insert(1, "나"); // 몇 번째에 insert 할 것인가? : 인덱스[1]번에 삽입
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        System.out.println();
        
        sBuilder.insert(1, 100);
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        System.out.println();
        
        sBuilder.setCharAt(0, 'R'); // 인덱스의 char를 바꿈
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        System.out.println();
        
        
        sBuilder.reverse(); // 순서를 바꿈
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        System.out.println();
        
        sBuilder.delete(0, 3);
        System.out.println(sBuilder);
        System.out.println(sBuilder.hashCode());
        System.out.println();
        
        int length = sBuilder.length();
        System.out.println("총 방문자 수 : " + length);
        System.out.println();
        

    }

}

























