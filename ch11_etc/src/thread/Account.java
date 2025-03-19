package thread;

public class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    // public synchronized void withdraw(int memory) {
    // if (balance >= memory) {
    // try {
    // Thread.sleep(1000);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // balance -= memory;
    // }

    // }

    public void withdraw(int memory) { // 동기화 -> 메소드 앞

        synchronized (this) { // 동기화 블록 -> 따로 블록을 잡고 동기화
            if (balance >= memory) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                balance -= memory;
            }

        }
    }

}
