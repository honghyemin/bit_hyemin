package kr.co.bitcamp.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamTest02 {

    public static void main(String[] args) throws Exception {
        
        OutputStream oStream = 
                new FileOutputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write2.txt");
        
        // encoding됨. (아스키코드 등 코드 값이 저장됨.)
        byte[] data = "ABC가나다".getBytes();
        // getBytes()를 사용할 때, 매개변수 값으로 charSet을 줄 수가 없는데 
        // UTF-8은 한글을 한 char당 3byte로 인식하고, 
        // EUC-KR, x-windows-949는 한글을 2byte로 인식함.
        // ISO8859-1 charSet에서는 한글을 1byte로 인식함.
        System.out.println("data 바이트 배열의 크기 : " + data.length);
        
        // 바이트 배열을 한번에 스트림에 보낸다.
        // 앞서 write(int b) 메서드에 비해서 훨씬 효율적이다.
        
        oStream.write(data);
        oStream.flush();
        System.out.println("저장이 완료되었습니다.");
        
        System.out.println();
        
        // 출력으로 내보낸 파일 write2.txt에 저장된 내용 읽어들임.
        InputStream iStream = 
                new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write2.txt");
        
        int count=0;
        // UTF-8에서는 한글이 3바이트이므로 바이트배열을 3byte로 생성  
        byte[] readBytes = new byte[3];
        
        // 루핑 수가 몇 번 반복되는지 확인하기 위해서 
        int i=0;
        
        while((count=iStream.read(readBytes)) != -1) {
            i++; // 몇 번 반복되는지 확인
            // 디코딩하기(우리가 읽을 수 있도록 하기 위해)
            String str = new String(readBytes);
            System.out.println("읽은 값 : " + str);
            System.out.println("읽은 바이트 수 : " + count);
        }
        System.out.println("루핑 수 : " + i);
              
                
        iStream.close();
        oStream.close();

    }

}
