
public class Test2 implements  Runnable {
   @Override
   public void run() {
      for (int i = 0; i <20 ; i++) {
         System.out.println("一边听歌"+i);
      }
   }

   public static void main(String[] args) {
        Test2 test2 = new Test2();
//      Thread t = new Thread(test2);
//      t.start();



      new Thread (test2).start();
      for (int i = 0; i <20 ; i++) {
         System.out.println("一边condig"+i);

      }
   }


}
