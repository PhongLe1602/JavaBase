package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author phongLV
 */
// alt shirt f
public class So_Nguyen_To {
    
    private static int bina(long []a,int l, int r,long x){
        if(l > r) return Integer.MAX_VALUE;
        int mid = (l+r)/2;
        if(a[mid] == x){
            return Math.min(mid, bina(a,l,mid-1,x));
        }
        else if(a[mid] > x){
            r = mid-1;
            return bina(a,l,r,x);
        }
        else{
            l = mid+1;
            return bina(a,l,r,x);
        }
    }
    private static int bina1(long []a,int l, int r,long x){
        if(l > r) return Integer.MIN_VALUE;
        int mid = (l+r)/2;
        if(a[mid] == x){
            return Math.max(mid, bina1(a,mid+1,r,x));
        }
        else if(a[mid] > x){
            r = mid-1;
            return bina1(a,l,r,x);
        }
        else{
            l = mid+1;
            return bina1(a,l,r,x);
        }
    }
    private static int bina2(long []a,int l, int r,long x){
        if(l > r) return Integer.MAX_VALUE;
        int mid = (l+r)/2;
        if(a[mid] >= x){
            r = mid-1;
            return Math.min(mid, bina2(a,l,r,x));
        }
        else{
            l = mid+1;
            return bina2(a,l,r,x);
        }
    }
    private static int bina3(long []a,int l, int r,long x){
        if(l > r) return Integer.MAX_VALUE;
        int mid = (l+r)/2;
        if(a[mid] > x){
            r = mid - 1;
            return Math.min(mid, bina3(a,l,mid-1,x));
        }
        else{
            l = mid+1;
            return bina3(a,l,r,x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long []a = new long[n];
        long []b = new long[1000007];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            b[(int)a[i]]++;
        }
        Arrays.sort(a);
        int c = bina(a,0,n-1,k);
        if(c != Integer.MAX_VALUE)System.out.println(c);
        else System.out.println(-1);
        int c1 = bina1(a,0,n-1,k);
        if(c1 != Integer.MIN_VALUE)System.out.println(c1);
        else System.out.println(-1);
        int c2 = bina2(a,0,n-1,k);
        if(c2 != Integer.MAX_VALUE)System.out.println(c2);
        else System.out.println(-1);
        int c3 = bina3(a,0,n-1,k);
        if(c3!= Integer.MAX_VALUE)System.out.println(c3);
        else System.out.println(-1);
        System.out.println(b[k]);
    }
}
