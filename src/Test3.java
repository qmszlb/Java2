public class Test3 implements  Runnable {
      private String winner;
    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            boolean flag = gameOver( i);
            if (flag){
                break;
            }
            if (Thread.currentThread().getName().equals("兔子") && i%10==0);{
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
    private boolean gameOver(int i){
        if (winner!= null){
            return true;
        }else{
            if (i==100){
                winner = Thread.currentThread().getName();
                System.out.println("winner==>"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        new Thread(t,"乌龟").start();
        new Thread(t,"兔子").start();
    }

}
