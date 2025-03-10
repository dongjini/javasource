package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = new FireEngine();

        car.drive();
        car.stop();

        // FireEngine fe = (FireEngine) car;
        // fe.water();
        ((FireEngine) car).water(); // fe 라는 참조변수를 사용할게 아니면 한줄로도 가능.

        // instance of : 참조변수가 참조하고있는 실제 인스턴스의 타입 알아보기
        // 객체가 특정 생성자(constructor) 함수로부터 생성된 인스턴스인지 확인할 때 사용

        if (car instanceof FireEngine) {
            System.out.println("FireEngine의 instance 임");
        }

        if (car instanceof Car) {
            System.out.println("Car의 instance 임");
        }

        Car car2 = new Car();
        // (FireEngine)car2; (x)

        if (car2 instanceof FireEngine) { // 이게 안뜨면 FireEngine으로 강제 형변환 안됨.
            // (FireEngine)car2; 안됨
            System.out.println("car2 - FireEngine의 instance 임");
        }

        if (car2 instanceof Car) {
            System.out.println("car2 - Car의 instance 임");
        }

    }
}
