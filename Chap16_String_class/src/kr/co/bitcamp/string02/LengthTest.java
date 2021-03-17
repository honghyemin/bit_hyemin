package kr.co.bitcamp.string02;

public class LengthTest {

    public static void main(String[] args) {

        String phoneNum = "01045671234";
        System.out.println("문자열의 길이 : " + phoneNum.length());

        // length() : 문자열의 길이 리턴

        int length = phoneNum.length();
        if (length == 11) {
            System.out.println("폰번호가 자리수가 맞습니다.");
        } else {
            System.out.println("다시 입력해주세요.");
        }

    }

}
