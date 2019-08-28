
public class Test2 implements  Runnable {
   @Override
   public void run() {
      for (int i = 0; i <20 ; i++) {
         System.out.println("一边听歌"+i);
         System.out.println(Thread.currentThread().getName());
      }
   }

   public static void main(String[] args) {
        Test2 test2 = new Test2();



      new Thread (test2,"123").start();
      new Thread (test2,"12").start();
      new Thread (test2,"1").start();
      for (int i = 0; i <20 ; i++) {
         System.out.println("一边condig"+i);

      }
   }


}
