import java.util.concurrent.TimeUnit;

public class CancellationWithFLag {

  private volatile static boolean hasStoped = false;

  public static void withFlag() throws InterruptedException {
    Thread hello = new Thread(() -> {
      while (!hasStoped) {
        System.out.println("Hello World");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException ignore) {

        }
      }
    });
    hello.start();

    TimeUnit.SECONDS.sleep(5); // Wait for some time
    stopThread();

  }

  public static void stopThread() {
    hasStoped = true;
    System.out.println("Threading Stop");
  }
}