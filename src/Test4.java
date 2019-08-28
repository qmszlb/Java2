import java.util.Scanner;

public class Test4  implements  Runnable{
    private int getTime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入倒计时时间");
        int t = sc.nextInt();
        System.out.println("倒计时开始");
        return t;
    }
    @Override
    public void run() {
        for (int i = getTime(); i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             if (i==0){
                 System.out.println("倒计时结束");
             }
        }

    }
    public static void main(String[] args) {
       Test4 a = new Test4();
       new Thread(a).start();
    }
}
