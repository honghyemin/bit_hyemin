package kr.co.bitcamp.polymorphism05;

import java.util.Scanner;

public class ProductTest {
    
    static int productId = 0;
    static int numberOfProduct = 0; // 상품의 갯수
    static Product[] product = new Product[10]; // 부모클래스 1차원 배열
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int choice = 0;
        
        while (choice != 3) {
            int type = 0; // 상품의 타입
            System.out.println("========== 상품 조회 / 추가 프로그램 ==========");
            System.out.println("|    1. 상품추가    2. 상품조회     3. 종료   |");
            System.out.println(" ======================================= ");
            System.out.print(">> ");
            
            choice = scan.nextInt();
            
            switch(choice) {
                case 1 : 
                    if(numberOfProduct >= product.length) {
                        System.out.println("더 이상 상품추가 불가");
                        break;
                    }
                    
                    // 상품 타입 하나를 선택해서 추가해주는 기능
                    System.out.println("(1) 책     (2) 음악    (3) 회화책");
                    System.out.print("> ");
                    type = scan.nextInt();
                        if(type < 1 || type > 3) {
                            System.out.println("잘못 입력했습니다. 다시 입력해주세요");
                            break;
                        }
                        
                        addProduct(type); // 어떤 상품을 추가할지에 대한 파라미터
                        break;
                        
                case 2 : 
                    for(int i = 0; i<numberOfProduct; i++) {
                        product[i].showInfo(); // 각각의 생품에 따른 내용들 출력하게 함
                        System.out.println();
                    }
                     break;
                     
                case 3 :
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }            
        }
    }
    
    // main 바깥에 addProduct메서드 추가
    public static void addProduct(int type) {
        
        // 공통적인 부분
        scan.nextLine();
        System.out.print("상품 설명 >> ");
        String desc = scan.nextLine(); // 입력한 값을 변수로 저장
        System.out.print("출판사 >> ");
        String maker = scan.nextLine();
        System.out.print("가격 >> ");
        int price = scan.nextInt();
        
        // 입력받는 값에 따라 내용이 달라짐 
        //(스캔으로 입력받게되면 버퍼에 저장 그 값이 변수에 저장, 입력을 하다보면 중간에 좀 남아있을 수 있음(의도한 대로 값이 안나올 수 있음) -> 버퍼에 있는 것을 쳐냄 (플러시?)) 
        scan.nextLine();
        
        // 해당 상품 타입에 해당하는 개별적인 부분
        switch(type) {
        
            case 1 : 
                System.out.print("일반 서적 제목 >> ");
                String title = scan.nextLine();
                System.out.print("저자 >> ");
                String author = scan.nextLine();
                System.out.print("표준 국제 도서 번호 >> ");
                int ISBN = scan.nextInt();
                
                // 필드의 다형성 적용(조상타입의 배열에 자손의 인스턴스를 담고 있음-원래는 같은 타입만 되나 다형성에 의해 값을 해당할 수 있음)               
                product[numberOfProduct] /*product[0]번째*//*조상타입*/ = new Book(productId++/*입력받을 때마다 1씩 추가됨*/, 
                                                                        desc, maker, price, ISBN, title, author)/*생성자*/;/*상속받은 자식타입*/
                break;
                
            case 2 : 
                System.out.print("앨범 제목 >> ");
                String albumTitle = scan.nextLine();
                System.out.print("가수 >> ");
                String artist = scan.nextLine();
                
                // 필드의 다형성(조상타입의 배열에 자손의 인스턴스를 담고 있음)
                product[numberOfProduct] = new CompactDisk(productId++, desc, maker, price, albumTitle, artist);
                break;
                
            case 3 : // Book을 상속받음
                System.out.print("회화책 제목 >> ");
                String title2 = scan.nextLine();
                System.out.print("저자 >> ");
                String author2 = scan.nextLine();
                System.out.print("언어 >> ");
                String language = scan.nextLine();
                System.out.print("표준 국제 도서 번호 >> ");
                int ISBN2 = scan.nextInt();
                
                product[numberOfProduct] = new ConversionBook(productId++, desc, maker, price, ISBN2, title2, author2, language);
                break;               
                 
        }
        numberOfProduct++; // 입력이 완료되면 상품의 갯수가 증가함
        
    }

}























