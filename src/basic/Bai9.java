/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai9 {
    private static int Mod = (int)(1e9+7);
    
    public static long Pow(long a, long b){
        if(b == 0) return 1;
        long x = Pow(a,b/2);
        if(b%2 == 0) return (x%Mod * x%Mod) %Mod;
        return (a%Mod * x%Mod * x%Mod) %Mod;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.print(Pow(a, b));
    }
}
