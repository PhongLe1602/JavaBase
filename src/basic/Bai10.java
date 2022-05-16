/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import static basic.Test_Case1.tack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai10 {

    public static int tack(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + tack(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Integer[] a = new Integer[n];
//        for(int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a,new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int x1 = tack(o1), x2 = tack(o2);
//                if(x1 > x2) return 1;
//                return -1;
//                  // return x1 - x2;
////                  if(tack(o1) > tack(o2)) return 1;
////                  return -1;
//                 // return tack(o1) - tack(o2);
//            }
//        });
//        for(int i = 0; i < n; i++){
//            System.out.print(a[i]+" ");
//        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        Collections.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return tack(o1) - tack(o2);
            }
        });
        for(int i:arr){
            System.out.println(i);
        }
    }
}
