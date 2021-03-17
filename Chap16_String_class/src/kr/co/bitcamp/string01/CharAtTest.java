package kr.co.bitcamp.string01;

public class CharAtTest {

    public static void main(String[] args) {
        
        String str = "980203-4456871";
        
        // 특정문자를 리턴 받고자 할 때 사용
        char gender = str.charAt(7); // 7번째 숫자를 리턴받음
        
        if(gender == '1' || gender == '3') {
            System.out.println("남자입니다.");
        } else if(gender =='2' || gender == '4') {
            System.out.println("여자입니다.");
        } else {
            System.out.println("사람이 아닙니다.");
        }
        

    }

}
