package abstractclass;

public abstract class Player {

    // 멤버 변수 가능
    boolean pause;
    int currentPos;

    // 생성자 가능
    Player() {
        pause = false;
        currentPos = 0;
    }

    // 추상메서드
    abstract void play();

    // 일반 메서드 가능
    void pause() {

    }
}

class CDPlayer extends Player {

    @Override // 강제 상황
    void play() {
        System.out.println("CD 플레이어");
    }

}

class AudioPlayer extends Player {

    @Override // 강제 상황
    void play() {
        System.out.println("Audio 플레이어");
    }

}
