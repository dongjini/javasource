package oop;

public class Triangle {
    // 속성 : 밑변(baseLine), 높이(height)

    int height;
    int baseLine;

    public Triangle() {
    }

    // 생성자의 목적
    // 인스턴스 변수 초기화
    public Triangle(int height, int baseLine) {
        this.height = height;
        this.baseLine = baseLine;
    }

    // 기능 : 면적을 구한다. getArea()
    double getArea() {
        return baseLine * height / 2.0;

    }

    // void getArea(double area) {
    // area = this.height * this.baseLine / 2 ;

    // }
}
