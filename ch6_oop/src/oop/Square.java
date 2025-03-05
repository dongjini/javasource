package oop;

public class Square {
    // 정사각형
    // 속성 : 길이(sideLength)
    // 기능 : 면적 구하기

    int sideLength;

    public Square() {
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square [sideLength=" + sideLength + "]";
    }

    int area() {
        return sideLength * sideLength;

    }

}
