import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        int[] fält = new int[4];
        System.out.println("TAla");
        fält[0] = tb.nextInt();
        fält[1] = tb.nextInt();
        fält[2] = tb.nextInt();
        fält[3] = tb.nextInt();
        System.out.println(fält[0]+","+fält[1]+","+fält[2]+","+fält[3]);
        
        int mid = fält[0];
        fält[0] = fält[3];
        fält[3] = mid;
        mid = fält[1];
        fält[1] = fält[2];
        fält[2] = mid;
    }
}
