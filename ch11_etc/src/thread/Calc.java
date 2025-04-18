package thread;

public class Calc {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) { // synchronized : 동기화메소드

        this.memory = memory;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);

    }

}
