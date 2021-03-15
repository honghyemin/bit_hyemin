package kr.co.bitcamp.array;

import java.util.Arrays;

// 다중 배열의 선언

public class ArrayBasic06 {
    public static void main(String[] args) {
       
        // 다양한 방법으로 다중 배열 선언
        int[] a,b,c;
        
        int d[], e[], f[];
        
        int g[], h, i;
        
        // 배열 사용이 가능한지 체크
        a = new int[3];
        b = new int[3];
        c = new int[3];        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        
        d = new int[6];
        e = new int[6];
        f = new int[6];
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));
        
        g = new int[9];
        //h = new int[9]; // int h; 형식으로 초기화됨.
        //i = new int[9];
        h = 100;
        i = 200;
        System.out.println(Arrays.toString(g));
        System.out.println(h);
        System.out.println(i);
        
    }

}



















