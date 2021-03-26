package kr.co.bitcamp.hashtable;

import java.util.HashMap;
import java.util.Scanner;

public class HashTableTest2 {

    public static void main(String[] args) {
        
        HashMap<String, Login> map = new HashMap<String, Login>();
        
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<2; i++) {
            System.out.print("ID : ");
            String ID = scan.next();
            System.out.print("PW : ");
            String PW = scan.next();
            
            Login login = new Login(ID, PW);
            
            map.put(ID, login); 
            
        }
        
        int count = 0;
        
        while(true) {
            System.out.println("아이디와 비밀번호를 입력하세요.");
            System.out.print("ID : ");
            String ID2 = scan.next();
            System.out.print("PW : ");
            String PW2 = scan.next();
            System.out.println();
            
            if(map.containsKey(ID2)) {
                Login login = map.get(ID2);
                
                if(map.get(ID2).equals(PW2)) {
                    System.out.println( ID2 + "님이 로그인 되었습니다.");
                    break;
                } else {
                    count++;
                    System.out.println("비밀번호가 " + count + "회 틀렸습니다.");
                    if(count==5) {
                        System.out.println("입력횟수를 초과하였습니다.");
                        break;
                    }
                }
            } else {
                System.out.println("아이디가 존재하지 않습니다.");
            }
            
            
            
        }
        
        
        
    }

}
