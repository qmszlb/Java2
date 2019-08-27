
import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        ArrayList<Integer> c = new ArrayList<Integer>(n);
        while (i <= n - 1) {
            c.add(i, sc.nextInt());
            i++;
        }

        HashSet<Integer> d = new HashSet<>(c.size());
        for (int j = 0; j < c.size(); j++) {
            d.add(c.get(j));
        }
        Integer [] e = new Integer[d.size()];
          d.toArray(e);

        HashSet<Integer> b =  new HashSet<>(e.length);
//        int[] b = new int[e.length];
        for (int m = 0; m <8; m++) {
            int a = e[((int) (Math.random() * e.length))];

            b.add(a);
            a++;

        }
        for (int i5 : b) {
            System.out.print(i5);
        }
    }
}

//        for (Integer integer : c) {
//            System.out.println(integer);
//        }





//
//        int c2size =(c.get(c.size()-1)-c.get(0));
//        ArrayList<Integer> c2 = new ArrayList<Integer>(c2size);
//
//        for (int j = 0; j <=c2size; ) {
//            c2.add(j,c.get(0)+j);
//            j++;
//
//        }
//
//
//        for (Integer integer : c2) {
//            System.out.println(integer);
//        }

//        int j = (int)Math.random()*c[c.length-1];
//        int k = (int)Math.random()*c[c.length-1];
//        if (j<=s){
//            int [] j1 =new int[(int)Math.random()*n];
//            j1[j] = (int)Math.pow(10,9);
//            j++;
//        }
//        if (k<=s){
//            int [] k1 =new int[(int)Math.random()*n];
//            k1[k] = (int)Math.pow(10,9);
//            k++;
//        }

//
//        while (j+k<=s&&j!=k){
//            count++;
//
//        }
//        System.out.println(count);



