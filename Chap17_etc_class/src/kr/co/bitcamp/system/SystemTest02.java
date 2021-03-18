package kr.co.bitcamp.system;

public class SystemTest02 {

    public static void main(String[] args) {
        
        //프로그램의 성능을 테스트할때 사용하면 유용한 메서드.
        long sum = 0;
       // long start = System.currentTimeMillis();    // 10의 3승분의 1초에 해당.
        long start = System.nanoTime();             // 10의 9승분의 1초
        
        // 10억번의 연산을 할 때 시간이 얼마나 걸리는가를 알아봄
        for(long i=1; i<1000000000; i++) {
            sum += i;
            
        }
        //long end = System.currentTimeMillis(); 
        long end = System.nanoTime(); 
        System.out.println(sum);
        
        System.out.println("소요된 시간 : " + (end-start) + "ns");
        //System.out.println("소요된 시간 : " + ((end-start)/1000.0) + "초");

       

    }

}
