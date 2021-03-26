package kr.co.bitcamp.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

    public static void main(String[] args) throws Exception {
        // write3.txt ==> write3_복사본.txt
        
        FileInputStream fInputStream = new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write3.txt");
        FileOutputStream fOutputStream = new FileOutputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write3_복사본2.txt");
        
        byte[] readBytes = new byte[1000];
        int data = 0;
        byte[] bytes = new byte[3];
        
        while ((data = fInputStream.read(readBytes)) != -1) {
            fOutputStream.write(readBytes);
        }
        fOutputStream.flush();
        System.out.println("C드라이브에 write3_복사본2.txt파일이 생성되었습니다.");
        
        
       
        fOutputStream.close();
        fInputStream.close();
    }

}
