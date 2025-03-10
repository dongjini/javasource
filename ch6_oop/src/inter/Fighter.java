package inter;

import java.util.Scanner;

public class Fighter extends Unit implements Fightable { // 이런 형태로 많이 사용함.
    String msg;
    Scanner sc;

    @Override
    public void move(int x, int y) {
        Math.random();
    }

    @Override
    public void attack(Unit unit) {
    }

}
