/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai23 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        LinkedHashMap<Integer,Integer> hash = new LinkedHashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(hash.containsKey(x)){
                int y = hash.get(x);
                hash.put(x, y+1);
            }else hash.put(x,1);
        }
   
        List<Map.Entry<Integer,Integer>> list1 = new ArrayList<>(hash.entrySet());
        Collections.sort(list1,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                if(o1.getValue() != o2.getValue()){
                    return o2.getValue() - o1.getValue();
                }
                return o1.getKey() - o2.getKey();
            }
        });
        for(int i = 0; i < list1.size(); i++){
            //System.out.println(list1.get(i).getKey()+" "+list1.get(i).getValue());
            for(int j = 0; j < list1.get(i).getValue(); j++){
                System.out.print(list1.get(i).getKey()+" ");
            }
        }
        System.out.println("");
        List<Map.Entry<Integer,Integer>> list2 = new ArrayList<>(hash.entrySet());
        Collections.sort(list2,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
               return o2.getValue() - o1.getValue();
            }
        });
        for(int i = 0; i < list2.size(); i++){
            //System.out.println(list1.get(i).getKey()+" "+list1.get(i).getValue());
            for(int j = 0; j < list2.get(i).getValue(); j++){
                System.out.print(list2.get(i).getKey()+" ");
            }
        }
    }
}
