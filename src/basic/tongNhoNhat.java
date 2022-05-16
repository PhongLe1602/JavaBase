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
public class tongNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int []b = new int[n];
            int []c = new int[n];
            int l1 = 0, l2 = 0;
            long x1 = 1, x2 = 1;
            for(int i = 0; i < n; i++){
                if(i%2==0){
                    b[l1++] = a[i];
                    x1 *=10;
                }
                else
                {
                    c[l2++] = a[i];x2*=10;
                }
            }
            long s1 = 0, s2 = 0;
            x1/=10; x2/=10;
            for(int i = 0; i < l1; i++){
                s1 += b[i] * x1; x1/=10;
            }
            for(int i = 0; i < l2; i++){
                s2 += c[i] * x2; x2/=10;
            }
            System.out.println(s1+s2);
        }  
    }
}
