/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
//        PerSon person1 = new PerSon();
//        //person.eat(); 
//        PerSon person2 = new PerSon("le van phong","16-02-2002",3.42);
//        System.out.println(person2.getName());
//        person2.SetName("Le Van Phuong");
//        System.out.println(person2.getName());
        Scanner sc = new Scanner(System.in);
        ArrayList<PerSon> arr = new ArrayList<>();
        PerSon[] person = new PerSon[10];
        for(int i = 0; i < 3; i++){
            person[i]  = new PerSon();
            System.out.println(person[i].getName());
        }
    }
}
