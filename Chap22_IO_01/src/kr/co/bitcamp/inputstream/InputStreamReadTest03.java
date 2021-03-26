package kr.co.bitcamp.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamReadTest03 {

    public static void main(String[] args) throws Exception {
        
        InputStream iStream = 
                new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\test3.txt");
        
        int count;
        byte[] readBytes = new byte[10];
        
        // 시작 인덱스가 2이고 5개 읽어서(length만큼 읽음) 저장하는 코드
        count = iStream.read(readBytes, 2, 5);
        System.out.println("읽은 바이트 수 : " + count);
        System.out.println();
        
        for(byte b : readBytes) {
            System.out.println("읽은 바이트 : " + (char)b);
        }
        
        
        
        
        
        
        iStream.close();

    }

}
