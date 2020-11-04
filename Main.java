import java.util.concurrent.TimeUnit;
//Cancle with flag
public class Main {

    private volatile static boolean hasStoped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread hello = new Thread(() -> {
            while (!hasStoped) {
              System.out.println("Hello World");
              try {
                 Thread.sleep(1000);
              } catch (InterruptedException ignore){}
           }
        });    
        hello.start();

        TimeUnit.SECONDS.sleep(5); // Wait for some time
        stopThread();

    }

    public static void stopThread() {
        shouldStop = true;
        System.out.println("Threading Stop");
    }
}



