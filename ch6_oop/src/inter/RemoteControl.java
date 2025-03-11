package inter;

public interface RemoteControl {
    // 상수(public final static), 추상메서드(public abstract), default, static 메서드

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // public abstract 붙이지 않아도 추상 메서드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBettery() {
        System.out.println("건전지를 교환합니다.");
    }

}
