package extend;

// 클래스간의 관계
// 1) 상속관계 : isa
// 2) 포함관계 : hasa
//      ㄴ> 한 클래스 안에 다른 클래스가 멤버 변수로 선언.

// 관계 결정하기
// public class Circle extends Point{}
// extends : 원(Circle)은 점(Point)이다. : Circle is a Point
// 포함 : 원(Circle)은 점(Point)을 가지고 있다 : Circle has a Point

// Car, SportsCar
// SportsCar 는 Car 이다(ㅇ) or SportsCar는 Car를 가지고 있다.(x)

public class Circle extends Shape {
    // int x;
    // int y;
    Point point; // 대문자로 시작하면 전부 포함된계.
    int r;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() { // 오버라이딩 (부모가 draw 했는데 또 한 이유)
        System.out.printf("[center = (%d, %d), r = %d, color = %s]\n",
                point.x, point.y, r, color);
    }
}
