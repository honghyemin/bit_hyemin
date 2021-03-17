package kr.co.bitcamp.polymorphism05;

public class Book extends Product {

    
    private int ISBN; // 책 고유번호
    private String title; // 책 제목
    private String author; // 저자
   
    public Book(int productId, String description, String maker, int price, int iSBN, String title, String author) {
        super(productId, description, maker, price); // 부모클래스의 생성자 호출
        ISBN = iSBN;    // Book클래스의 생성자
        this.title = title;  // ''
        this.author = author;  // ''
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    @Override
    public void showInfo() {         
        super.showInfo();// 부모클래스가 갖고 있는 메서드를 명시적으로 호출
        System.out.println("국제표준도서번호 > " + this.getISBN());
        System.out.println("책 제목 > " + this.getTitle());
        System.out.println("저자 > " + this.getAuthor());
    }
    
    

}








