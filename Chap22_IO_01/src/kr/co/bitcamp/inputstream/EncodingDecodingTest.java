package kr.co.bitcamp.inputstream;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingDecodingTest {

    public static void main(String[] args) throws Exception {
        
        String hangul = "한글";       
        String[] encodings = new String[] {"x-windows-949", "EUC-KR", "UTF-8", "ISO8859-1"};
        
        // encoding시 저장할 array
        String[] encoded = new String[4];
        
        // encoding은 byte단위로 쪼개지는 것.
        for(int i=0; i<encodings.length; i++) {
            // 인코딩 ( 기계가 읽을 수 있도록 변환 )
            encoded[i] = URLEncoder.encode(hangul, encodings[i]);
            System.out.println(encodings[i] + "으로 인코딩 된 값 : " + encoded[i]);
        }
        
        String[] decoded = new String[4];
        for(int i=0; i<encodings.length; i++) {
            // 인코딩 된 것을 각각 charSet을 적용해서 디코딩(사람이 이해하는 쪽으로 변환)
            decoded[i] = URLDecoder.decode(encoded[i], encodings[i]);
            System.out.println(encodings[i] + "으로 디코딩 된 값 : " + decoded[i]);
        }

    }

}
