/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class chiaMangThanh2MangCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n,k;
            n = sc.nextInt(); k = sc.nextInt();
            long sum = 0;
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            long x1 = 0, x2 = 0;
            Arrays.sort(a);
            if(n - k > k) x1 = n-k;
            else x1 = k;
            for(int i = n-1; i >= 0; i--){
                if(x1 == 0) break;
                x2 += a[i];
                x1--;
            }
            System.out.println(x2 - (sum-x2));
        }
    }
}
