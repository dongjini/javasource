package poly;

public class CarEx3 {
    public static void main(String[] args) {

        HankookTire fontLeft = new HankookTire(1, "앞 왼쪽");
        HankookTire frontRight = new HankookTire(1, "앞 오른족");
        HankookTire backLeft = new HankookTire(1, "뒤 왼쪽");
        HankookTire backRight = new HankookTire(1, "뒤 오른쪽");

        Car3 car3 = new Car3(fontLeft, frontRight, backLeft, backRight);
        car3 = new Car3(new HankookTire(1, "앞 왼쪽"), frontRight,
                new HankookTire(1, "뒤 왼쪽"), backRight);

        // 기본타입은 . 찍고 접근하지않음
        System.out.println(car3.num); // 0
        System.out.println(car3.frontLeft); // null
        // NullPointerException
        System.out.println(car3.frontLeft.accumulateRotation);

    }
}
