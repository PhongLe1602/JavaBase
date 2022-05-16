/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author byPhong5G
 */
public class Doi_Tien {

    public static int lb(ArrayList<Long> a, long check[], int l, int r, long x) {
        if (l > r) {
            return Integer.MIN_VALUE;
        }
        int mid = (l + r) / 2;
        if (a.get(mid) <= x) {
            l = mid + 1;
            return Math.max(mid, lb(a, check, l, r, x));

        } else {
            r = mid - 1;
            return lb(a, check, l, r, x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int k = hm.get(arr[i]);
                hm.put(arr[i], k + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        List<Map.Entry<String, Integer>> ltt = new ArrayList<>(hm.entrySet());
//        for(int i = 0; i < ltt.size(); i++){
//            System.out.println(ltt.get(i).getKey()+ " "+ ltt.get(i).getValue());
//        }
        Collections.sort(ltt, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() == o2.getValue()){
                    if(o1.getKey().compareTo(o2.getKey()) <= 0) return 1;
                    return -1;
                }
                return o1.getValue() - o2.getValue();
            }
        });
        System.out.println(ltt.get(ltt.size() - 1).getKey() + " " + ltt.get(ltt.size() - 1).getValue());
        System.out.println(ltt.get(0).getKey() + " " + ltt.get(0).getValue());
    }
}
