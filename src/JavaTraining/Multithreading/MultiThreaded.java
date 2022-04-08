package JavaTraining.Multithreading;

public class MultiThreaded extends Thread {
    public static void main(String[] args) throws InterruptedException {
        MultiThreaded mt = new MultiThreaded();
        mt.start();//Start() executes run() method

        for (int j = 1; j <= 100; j++) {
            System.out.print("j : " + j + "\t");
            Thread.sleep(1000);
        }
    }

    public void run() { //Starting Point
        for (int i = 1; i <= 100; i++) {
            System.out.print("i : " + i + "\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error occured in Sleep Method");
            }
        }
    }
}
