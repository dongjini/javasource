package oop;

// private : 외부 클래스에서 접근 불가 -> 멤버변수
// public : private 의 반대(접근제한 없음) -> 생성자, 메서드

public class Tv3 {
    // 멤버 변수는 private를 붙인다.
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자 제공
    public Tv3() {
    }

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // setter.getter 메소드
    // setter : 인스턴스 변수 값 변경
    // getter : 인스턴스 변수 사용
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() { // 불린형이라 get 대신 is 사용 (t or f)
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    // 채널 변경, 볼륨 변경, 전원 켜기, 끄기 (동작)
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    @Override // 마우스 우클릭 > source action > generate toString()
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
