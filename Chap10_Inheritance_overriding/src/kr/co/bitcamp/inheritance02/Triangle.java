package kr.co.bitcamp.inheritance02;

public class Triangle extends Shape { // shape의 상속을 받음
    
    Point[] point;      // 점이3개 이므로 배열로 만들어줌 - 객체배열
    
    public Triangle() {
        this(new Point(0,0), new Point(50,50), new Point(100,100));
    }
    
    
    public Triangle(Point point1, Point point2, Point point3) { //참조형태가 배열형이므로 매개변수3개필요
        System.out.println("Triangle의 매개변수 3개 호출됨");
        this.point = new Point[] {point1, point2, point3}; // 초기화 - 오버로드로 생성자만듦(기본생성자x)
    }
    
    public Triangle(Point[] point) {
        System.out.println("Triangle의 매개변수 point 호출됨");
        this.point = point; // 생성자의 역할은 초기화하는 것.
        
    }
    
    @Override
        public void draw() {
            System.out.println("[point1] : " +this.point[0].x + ", " + this.point[0].y );
            System.out.println("[point2] : " +this.point[1].x + ", " + this.point[1].y );
            System.out.println("[point3] : " +this.point[2].x + ", " + this.point[2].y );
            
            
        
        
        }
    

}
