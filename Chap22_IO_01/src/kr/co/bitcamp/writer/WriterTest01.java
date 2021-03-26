package kr.co.bitcamp.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest01 {

    public static void main(String[] args) throws Exception {
        
       // toCharArray() : 문자열을 char[]로 리턴해준다. 
       char[] str = "이순신".toCharArray();
       System.out.println(str);
       
       Writer writer = new FileWriter("C:\\Users\\bitcamp\\eclipse-workspace\\test6.txt");
       for(int i=0; i<str.length; i++) {
           // 한 문자씩 보내는 형태
           writer.write(str[i]);        // (덜 효율적임)
           System.out.println("루핑 수 : " + i);
       }
       
       writer.flush();      // 버퍼에 남아있는 내용을 강제로 비워준다.
       System.out.println("파일이 생성되었습니다.");
       
       writer.close();

    }

}
