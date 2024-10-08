class tosser extends Thread {
    public int n = 0;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            if ((int) (Math.random() * 2) == 1) {
                n++;
            }
        }
    }

    public int getResult() {
        return n;
    }
}

public class CoinToss {
    public static void main(String[] args) {
        int a;
        tosser obj = new tosser();
        obj.start();
        try {
            obj.join();
        } catch (InterruptedException e) {

        }
        System.out.println("Head:" + obj.getResult());
        System.out.println("Tail:" + (1000 - obj.getResult()));

    }
}