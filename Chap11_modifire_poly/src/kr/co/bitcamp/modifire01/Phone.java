package kr.co.bitcamp.modifire01;

public class Phone {

    // protected 접근 제어자 : '같은' 패키지에서는 다 접근가능(상속여부 상관없음)
    //                                              => 상속받지 않은 클래스도 접근 가능
    //                      '다른' 패키지에서는 다 접근불가(상속여부 상관없음)
    
    
    protected String model;
    private String color;
    private String company;

    // 기본 생성자
    public Phone() {

    }

    // 오버로드된 매개 변수가 있는 생성자
    public Phone(String model, String color, String company) {
        super(); // 생략가능
        this.model = model;
        this.color = color;
        this.company = company;
    }

    // getter()
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCompany() {
        return company;
    }

    // 멤버에 대한 설정값을 확인하는 용도
    @Override
    public String toString() {
        
        String str = "모델 : " + this.getModel() + 
                      ", 색상 : " + this.getColor()  + 
                      ", 제조회사 : " + this.getCompany();
        
        
        
        return str;
        
        

    }

}
















