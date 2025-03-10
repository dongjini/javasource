package inter;

public interface PlayingCard {

    // 멤버변수 못가짐
    // boolean pause;

    // 상수 (대문자로 선언)
    public static final int SPADE = 4;
    int CLOVER = 1; // 앞에 pubic static final이 무조건 붇는거라 생략 가능함.

    // 일반 메서드 가질 수 없음
    // void pause() { } -> 중괄호 가질 수 없음

    // public abstract 생략 가능 그래서 에러 안남.
    void pause();

    // static, default 가 붙는다면 일반메서드도 허용
    static void display() {
    }

    default void print() {
    }

}
