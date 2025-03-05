package oop;

public class TriangleEx1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        // 인스턴스 변수 초기화.
        triangle.height = 10;
        triangle.baseLine = 52;

        System.out.printf("넓이 : %.2f\n", triangle.getArea());

        triangle = new Triangle(20, 10);
        System.out.println("면적은 : " + triangle.getArea());

    }
}
