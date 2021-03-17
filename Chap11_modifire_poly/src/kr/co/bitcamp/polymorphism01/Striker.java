package kr.co.bitcamp.polymorphism01;

public class Striker extends Player{ // 5개의 멤버를 갖고있음 (부모4개 , 자식1개)

    private int shoot;

    public Striker(String name, int age, int backNumber, int speed, int shoot) { // 부모 생성자가 호출이 되서 부모가 만들어지고 자식도 만들어진다...?
        super(name, age, backNumber, speed);    // Player의 생성자 호출
        this.shoot = shoot;
    }
    
    public int getShoot() {
        return this.shoot;
    }
    
    @Override   //부보의 info를 가져와서 재구성
        public void info() {
            super.info();   // player의 info()를 호출
            System.out.println("유효 슛팅 : " + this.getShoot());
        }
    
    
}
