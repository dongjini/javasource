package poly;

// Tv 클래스를 이용해서 Tv(인스턴스) 생성
// 객체 구성요소
// 1. 속성 => 맴버변수   (클래스 내에, 메인을 열기 전에 선언된 변수를 맴버 변수라 한다.)
// 2. 기능 => 맴버메소드
public class Tv2 {

    int channel;
    boolean power;

    // 채널 변경, 볼륨 변경, 전원 켜기, 끄기 (동작)
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [channel=" + channel + ", power=" + power + "]";
    }

}
