/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Test {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        sc.nextLine();
        String s1 = sc.next();
        String[] arr = s.split("\\s+");
        ArrayList<String> arr1 = new ArrayList<>();
        for(int i  = 0; i < arr.length; i++){
            arr1.add(arr[i].toLowerCase());
        }
        int l = 0;
        for(int i = 0; i < arr1.size(); i++){
            char c = Character.toUpperCase(arr1.get(i).charAt(0));
            System.out.print(c);
            for(int j = 1; j < arr1.get(i).length(); j++){
                System.out.print(arr1.get(i).charAt(j));
            }
            if(l != arr1.size()-1){
                System.out.print(" "); l++;
            }
        }
        System.out.println("");
        if(s1.charAt(1) == '/') s1 = "0" + s1;
        if(s1.charAt(4) == '/'){
            String tmp = s1.substring(3,s1.length());
            tmp = "0" + tmp;
            String res = s1.substring(0,3);
            s1 = res + tmp;
        }
        System.out.println(s1);
    }
}
