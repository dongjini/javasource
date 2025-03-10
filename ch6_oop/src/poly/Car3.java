package poly;

public class Car3 {
    // 멤버변수의 타입 : 기본, 객체(대문자로 시작, 배열)
    // 기본 : 정수 = 0, 실수 = 0.0, boolean = false ...
    // 객체 : null

    Tire frontLeft = new HankookTire(5, "앞 왼쪽");
    Tire frontRight;
    Tire backLeft;
    Tire backRight;

    int num;

    // 초기화 (객체는 초기화 하지 않으면 NullPointExeption이 뜬다)
    // 1) 초기화 2) set 메서드 3) 멤버변수 선언하면서 초기화하기
    public Car3(Tire frontLeft, Tire frontRight, Tire backLeft, Tire backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

}
