package kr.co.bitcamp.string02;

public class ReplaceTest {

    public static void main(String[] args) {
        
        // replace() : 문자열을 대처하는 메서드이다.
        //             - 내용을 수정하는 것이 아니라 새로 만드는 개념.
        
        String oldstr = "자바는 객체지향 언어입니다.";
        String newstr = oldstr.replace("자바", "JAVA");
        System.out.println(newstr.toString()); // toString()이 오버라이드 되어있어서 새로 대체된 내용으로 출력 가능
                                               // toString()은 생략 가능함
        
        // 두개의 해쉬값은 다르게 나옴. 새로운 값이 할당됨을 보여준다.
        // 해쉬 값과 주소 값의 차이?
        System.out.println(oldstr.hashCode());
        System.out.println(newstr.hashCode());

    }

}
