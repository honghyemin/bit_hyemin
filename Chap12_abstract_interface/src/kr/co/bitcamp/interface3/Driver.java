package kr.co.bitcamp.interface3;

// 독립클래스(인터페이스 매개변수의 다형성)
// 인터페이스를 implements하지 않고....
public class Driver {
    
    // new Taxi() 이거나 new Bus()만 매개변수로 들어올 수 있음
    // why? 위 두개의 클래스가 vehiclable이라는 인터페이스를 구현했기 때문에 파라미터로 들어올 수 있음.
    
    public void dirve(Vehiclable vehiclable) {
        vehiclable.run();
    }
    
    public void stop(Vehiclable vehiclable) {
        vehiclable.stop();
    }
    
    public Vehiclable newCarMethod(Vehiclable vehiclable) {
        
        if(vehiclable instanceof Taxi) {
            System.out.println("NEW 택시");
            // 조상타입 vehicleable을 taxi타입으로 다운캐스팅
            Taxi taxi = (Taxi) vehiclable;  // 다운캐스팅
            return taxi;
        }
        else if(vehiclable instanceof Bus) {
            System.out.println("NEW 버스");
            Bus bus = (Bus) vehiclable; // 다운캐스팅
            return bus;
        }
        return null; // 메소드 전체를 다시 리턴해줌
    }

}
