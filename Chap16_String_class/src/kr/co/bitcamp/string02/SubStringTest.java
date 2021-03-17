package kr.co.bitcamp.string02;

public class SubStringTest {

    public static void main(String[] args) {
        
        String phoneNum = "01012345678";
        
        // subString() : 문자열을 잘라내어 String으로 반환
        String str1 = phoneNum.substring(3); // 할당된 인덱스 번호의 값부터 출력됨. 그 앞의 인덱스의 내용들은 잘려나감.
        System.out.println(str1);
        
        // 0부터 2까지의 인덱스 값만 출력. 3번째 인덱스의 값부터는 출력되지 않음.
        String str2 = phoneNum.substring(0, 3);
        System.out.println(str2);

    }

}
