package basic;
import java.util.Scanner;

/**
 *
 * @author phongLV
 */
public class So_Fib {
//    static long[] Fib = new long[100];
    static long Fib[] = new long[93];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        long Fib[] = new long[93];
        Fib[1] = Fib[2] = 1;
        for(int i = 3; i <= 92; i++) Fib[i] = Fib[i-1] + Fib[i-2];
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(Fib[n]);
        }
    }
}