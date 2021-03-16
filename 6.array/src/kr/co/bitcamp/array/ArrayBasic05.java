package kr.co.bitcamp.array;

import java.util.Arrays;

/*
 * 배열의 값들을 for문과 같은 반복문을 사용하지 않고 한꺼번에 출력하는 코드 작성
 */

// Arrays.toString()메서드  
//  : 반복문을 사용하지 않고 배열에 할당된 값을 출력
public class ArrayBasic05 {
    public static void main(String[] args) {
        
        // 배열 선언
        int[] arr = {23,88,998,426,487,239,873};
        
        //for반복문 사용하여 값 출력.
        for(int i = 0; i<arr.length; i++) 
            System.out.print(arr[i]+" ");
        System.out.println();
        
        // toString()메서드 사용하여 값 출력.
        System.out.println(Arrays.toString(arr)); // [] 괄호의 형태로 배열 표시를 보여주면서 출력
        System.out.println(arr[0]);
        
        
    }

}
