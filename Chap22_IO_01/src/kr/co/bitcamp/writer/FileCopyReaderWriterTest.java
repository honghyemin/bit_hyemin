package kr.co.bitcamp.writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopyReaderWriterTest {

    public static void main(String[] args) throws Exception {
        
        // Reader와 Writer 둘다 추상 클래스이므로 객체 생성해야함.
        
        Reader reader = 
                new FileReader("C:\\Users\\bitcamp\\eclipse-workspace\\FileCopyTest.java");
        
        Writer writer = 
                new FileWriter("C:\\Users\\bitcamp\\eclipse-workspace\\FileCopyTest_복사본.java");
        
        String str = "";
        int readBytes;
        char[] cArr = new char[100];
        int i=0;
        int sum=0;
        
        while(( readBytes = reader.read(cArr)) != -1) {
           i++; 
           String str1 = new String(cArr);
           str += str1;
           sum += i;
        }
        System.out.println("루핑 수 : " + i);
        writer.write(str);
        
        writer.flush();
        System.out.println("FileCopyTest_복사본.java 파일이 생성되었습니다.");
        writer.close();
        reader.close();
        

    }

}
