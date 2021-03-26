package kr.co.bitcamp.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderTest02 {

    public static void main(String[] args) throws Exception {

        Reader reader = 
                new FileReader("C:\\Users\\bitcamp\\eclipse-workspace\\test5.txt");
        
        int readData;
        
        char[] cArr = new char[2];
        String str = "";
        
        while((readData=reader.read(cArr)) != -1) {
            str += new String(cArr, 0, readData); // 객체 새로 생성 - 문자를 하나하나 읽어들이면서 문자열로 변환 후 str에 저장
            System.out.println("읽은 문자 수 : " + readData);
        }
        
        // 문자열로 출력
        System.out.println(str);
        
        
        
        reader.close();
    }

}
