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
public class timMax {
    static int[] a = new int[1000004];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long sum = 0;
            for(int i = 0; i < n; i++){
                sum += ((a[i]%((int)(1e9)+7)) * (i%((int)(1e9)+7)))%((int)(1e9)+7);
            }
            System.out.println(sum);
        }
    }
}