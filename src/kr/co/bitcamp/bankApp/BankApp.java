package kr.co.bitcamp.bankApp;

import java.util.Scanner;

public class BankApp {

    // 배열 100개 정적멤버로 추가 (1개만 만들고 나머지 사용하지 않으면 메모리 낭비가 될 수 있음)
    private static Account[] accountArray = new Account[100];
    // 값을 입력 받아야 함.
    private static Scanner scan = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        boolean run = true;
        
        while(run) {
            System.out.println("-------------------------------------------");
            System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
            System.out.println("-------------------------------------------");
            System.out.print("선택 >> ");
            int choice = scan.nextInt();
            
            if(choice == 1) {
                createAccount();
                
            } else if (choice == 2) {
                accountList();
                
            } else if (choice == 3) {
                deposite();
                
            } else if (choice ==4) {
                withdraw();
                
            } else if (choice == 5) {
                System.out.println("계좌관리 프로그램을 종료합니다.");
                run = false;
            } else {
                System.out.println("잘못 입력했습니다.");
                
            }
        }
        
    }
    // 계좌 생성 출력하기
    public static void createAccount() {
        System.out.println("--------------------------------------");
        System.out.println("           [ 계좌를 생성합니다 ]           ");
        System.out.println("--------------------------------------");
        
        System.out.print("계좌 번호 : ");
        String ano = scan.next();    // 한 단어를 입력 받을 때 용이한 메서드. 중간에 공백이 있으면 공백 앞까지만 String리턴(입력을 받음)
        //scan.nextLine();// 한 라인(문장) 전부 입력 받음
        
        System.out.print("계좌주 : ");
        String owner = scan.next();
        
        System.out.print("초기 입급액 : ");
        int balance = scan.nextInt();
        
        Account newAccount = new Account(ano, owner, balance); // 위의 1차원 배열인 Account[]를 2차원 배열로 만들어줌
        for(int i = 0; i<accountArray.length; i++) {
            if(accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과 : 계좌 생성이 완료되었습니다.");
//                System.out.println(accountArray[i].getAno() + ", " +
//                                   accountArray[i].getOwner() + ", " +
//                                   accountArray[i].getBalance());
                break;
            }
        }       
    }
    
    // 계좌 목록 출력하기
    public static void accountList() {
        System.out.println("--------------------------------------");
        System.out.println("          [ 계좌목록을 출력합니다 ]          ");
        System.out.println("--------------------------------------");
        
        for(int i = 0; i<accountArray.length; i++) {
            Account account = accountArray[i]; //참조 번지를 갖고있음. 갯수만큼 account 하나하나에 대해 목록 출력
            
            // 계좌에 대한 내용이 존재한다면 
            if(account != null) {
                System.out.print(account.getAno());
                System.out.print("\t");
                System.out.print(account.getOwner());
                System.out.print("\t");
                System.out.println(account.getBalance());
                System.out.println();
            }
        }
    }
    
    // 예금하기
    public static void deposite() {
        System.out.println("--------------------------------------");
        System.out.println("            [ '예금'을  합니다 ]          ");
        System.out.println("--------------------------------------");
        
        System.out.print("계좌번호 입력 : ");
        String ano = scan.next();
        System.out.print("예금액 : "); 
        int money = scan.nextInt();
        
        // 
        Account account = findAccount(ano);
        
        if(account == null) {
            System.out.println("계좌번호가 존재하지 않습니다. 확인바랍니다.");
            return; // 메서드가 진행이 안되고 종료됨.
        } else {
            
            account.setBalance(account.getBalance()/*처음 계좌 개설했을 때 금액*/ + money);
            System.out.println("결과 : 예금이 성공했습니다.");
            System.out.println("현재 잔액은 " + account.getBalance() + "원 입니다.");
        }
    }
    
    // 계좌 찾기
    public static Account findAccount(String ano/*입력받은 계좌번호*/) {
        
        Account account = null;
        for(int i = 0; i<accountArray.length; i++) {
            if(accountArray[i] != null) {
                //매개변수로 넘어온 계좌번호와 동일하다면
                if(accountArray[i].getAno().equals(ano)) {
                    account = accountArray[i]; // 존재하므로 계좌번호를 할당
                    break;                    
                }
            }
        }
             
        return account;
        
    }
    
    public static void withdraw() {
        System.out.println("--------------------------------------");
        System.out.println("            [ '출금'을  합니다 ]          ");
        System.out.println("--------------------------------------");
        
        System.out.print("계좌번호 입력 : ");
        String ano = scan.next();
        System.out.print("출금액 : "); 
        int money = scan.nextInt();
        
        Account account = findAccount(ano);
        
        if(account == null) {
            System.out.println("계좌번호가 존재하지 않습니다. 확인바랍니다.");
            return; // 메서드가 진행이 안되고 종료됨.
        } else {
            
            account.setBalance(account.getBalance()/*처음 계좌 개설했을 때 금액*/ - money);
            System.out.println("결과 : 출금이 성공했습니다.");
            System.out.println("현재 잔액은 " + account.getBalance() + "원 입니다.");
        }
    }
    
    
    

}

























