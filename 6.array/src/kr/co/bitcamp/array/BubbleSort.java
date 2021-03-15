package kr.co.bitcamp.array;

import java.util.Arrays;

// 버블 정렬: 서로 이웃한 데이터를 비교하여 (큰지 작은지..) 정렬하는 방법.
//          거품 정렬이라고도 한다. 
//          데이터의 이동 모양이 거품모양으로 수면위로 올라오는 듯한 모습을 보이기 때문에 지어진 이름.

public class BubbleSort {
    public static void main(String[] args) {

        int[] ball = new int[5];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = (int) (Math.random() * 45) + 1;

        }
        System.out.println("정렬 전");
        for (int i = 0; i < ball.length; i++) {
            System.out.print(ball[i] + " ");
            

        }
        System.out.println();

        // 버블 소팅을 위해서 반드시 1차원배열이라도 더블루프가 필요하고
        // 조건문이 하나 필요함
        for (int i = 0; i < ball.length; i++) { // 전체 횟수
            for (int j = 0; j < ball.length - 1; j++) { // 인접해있는 것을 비교
                // 버블정렬
                if (ball[j] > ball[j + 1]) { // 오름차순, 내림차순을 하려면 ball[j] < ball[j+1]로 바꿔주면 됨,
                    int temp = ball[j];
                    ball[j] = ball[j + 1];
                    ball[j + 1] = temp;
                }
            }
        }
        // Arrays.sort(ball); ->> 오름차순 정렬 메서드 (근데 왜나는 적용이 안되지?)

        System.out.println("정렬 후");
        for (int i = 0; i < ball.length; i++) {
            System.out.print(ball[i] + " ");
           

        }
        System.out.println();
        
        System.out.println(Arrays.toString(ball));

    }

}
