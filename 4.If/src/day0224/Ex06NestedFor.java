package day0224;
// 다중 for문
// 다중 for문의 경우
// 바깥쪽 for문이 한 번 반복되는 동안
// 안쪽 for문은 처음부터 끝까지 모두 반복이 된다.

public class Ex06NestedFor {
    public static void main(String[] args) {
       
        for(int i = 1; i<= 3; i++) {
            System.out.println("--i for문 시작--");
            
            for(int j = 1; j<=i; j++) {
                System.out.printf("i의 현재값 : [%d] j의 현재값: [%d]\n", i, j);
            }
            
            System.out.println("--i for문 종료--");
            System.out.println();
        }
        
    }

}
