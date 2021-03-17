package kr.co.bitcamp.polymorphism02;

public class CarTest {

    public static void main(String[] args) {
        
        Car car = null;
        SportCar sportCar = new SportCar();
        PoliceCar policeCar = new PoliceCar();
        
       sportCar.SpeedUp();
       
       car = sportCar;      //1. 업캐스팅 (자손->조상) : 조작할 수 있는 멤버가 줄어듦
       // car.speedUp(); 이 안됨.
       SportCar sportCar2 = null;
       sportCar2 = (SportCar)car;     // 2. 다운캐스팅(조상->자손) - 조작할 수 있는 멤버가 늘어남.
                                      //                       바로 실행되지 않으므로 형변환 코드(캐스트 연산자)를 사용해야함.
       
       sportCar2.SpeedUp();

    }

}
