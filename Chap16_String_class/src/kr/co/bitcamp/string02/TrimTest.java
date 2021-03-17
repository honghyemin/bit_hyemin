package kr.co.bitcamp.string02;

public class TrimTest {

    public static void main(String[] args) {
        
        String tel1 = "     02";
        String tel2 = "-3305    ";
        String tel3 = "    -1037    ";
        
        // trim()은 좌우 공백만 제거함.
        System.out.println(tel1.trim());
        System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
    }

}
