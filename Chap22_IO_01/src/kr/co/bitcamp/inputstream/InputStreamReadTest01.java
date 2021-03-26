package kr.co.bitcamp.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamReadTest01 {

    // 메인은 일반 예외가 발생하면 해당 예외를 JVM에 던지고 있음.     
    public static void main(String[] args) throws Exception {
        
        // 다형성이 적용된 코드
        InputStream iStream = 
                new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\test.txt");
        
        int readByte;       // while문을 읽어들이다가 읽은 바이트 수를 리턴 받는 변수 용도로 사용.
        
        // InputStream의 read()는 더 이상 읽을 것이 없다면 -1 값을 리턴.
        while( (readByte = iStream.read()) !=-1) {
            System.out.println("읽은 데이터 (1바이트) : " + readByte); // 텍스트파일의 내용(문자)이 아닌 아스키코드값을 출력
            System.out.println("읽은 문자 : " + (char)readByte); // 문자로 출력하게 하려면, char타입으로 강제 타입캐스팅 후 문자로 출력
        }
        
//        while(true) {
//            readByte = iStream.read();
//            if(readByte == -1)
//                break;
//            System.out.println("읽은 문자 : " + (char)readByte);
//        }
        
        // 이클립스의 디폴트 캐릭터셋
        System.out.println(Charset.defaultCharset());
        
        // 리소스 반납
        iStream.close();

    }

}
