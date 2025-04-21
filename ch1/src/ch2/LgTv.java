package ch2;

// LgTv에 선언된 멤버 변수 초기화
// 1) 생성자
// 2) setter

public class LgTv implements Tv {

    private Speaker speaker; // null

    public LgTv(Speaker speaker) {
        this.speaker = speaker;
    }

    public LgTv() {
    }

    // setter 메소드
    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void powerOn() {
        System.out.println("LgTv - 전원 On");
    }

    @Override
    public void powerOff() {
        System.out.println("LgTv - 전원 Off");
    }

    @Override
    public void volumeUp() {
        // System.out.println("LgTv - 볼륨 Up");
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        // System.out.println("LgTv - 볼륨 Down");
        speaker.volumeDown();
    }
}
