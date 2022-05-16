/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai1 {
    public static int z = -1;
    public static void binary_seach(ArrayList<Integer> a , int l, int r, int x) {
        if (l > r) {
            return;
        }
        int mid = (l + r) / 2;
        if (a.get(mid) >= x) {
            z = mid;
            r = mid-1;
            binary_seach(a,l,r,x);
        } else {
            binary_seach(a, mid + 1, r, x);
        }
    }
    //

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[10];
        Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
               return o1 - o2;
            }
            
        });
    }
}
