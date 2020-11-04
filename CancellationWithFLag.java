// public class CancellationWithFlag {
//   public static void main(String[] args) {
//     Thread hello = new Thread(() -> {
//       while (true) {
//         try {
//         System.out.println("Hello");
//           Thread.sleep(1000);
//         } catch (InterruptedException ignore) {
// 					Thread.currentThread().interrupt();
//         }
//       }
//     });
 
//     hello.start();

//     Thread stopFlag = new Thread(()->{hello.interrupt();});

//     stopFlag.start(); 
//   }
// }