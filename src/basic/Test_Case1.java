/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Phong
 */
public class Test_Case1 {

    public static int tack(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + tack(n / 10);
    }

    // psvm
    // ALt SHIRT F (chuẩn hóa đoạn code)
    public static void main(String[] args) {
        // int long;
        // float: 4byte : 6
        // double: 8byte : 15
        //sout(lệnh in)
//        System.out.println();
        // char: 1byte
        // boolean : 1byte
        // String : luu xau ki tu
//        long dienTich = 10010L;
//        float thuNhap = 3.14f;
//        double thuNhapCaNhan = 4000d;
//        char kiTu = 'A';
//        String kiemTra = "Le Van Phong";
//        boolean kietTra = true;
//        System.out.println(dienTich);
//        // in ra do chinh xac
//        System.out.printf("%.4f\n", thuNhap); 
//        System.out.printf("%.4f\n", thphonguNhapCaNhan);
//        System.out.println(String.format("%.4f",thuNhap));
          Scanner sc = new Scanner(System.in);
//        int x;
//        x = sc.nextInt();
//        System.out.println(x);
//        double x1 = sc.nextDouble();
//        System.out.println(x1);
//        String k = nextLine();
//        int ketQua = (int) Math.pow(a, b);
//        int ketQua = (int) math.sqrt(a);
//        int ketQua = Math.abs(a)
//        int ketQua = (int) Math.cbrt(a);
//        Math.max(a, b);
//        Math.min(a, b);
//        (int) Math.ceil(24.4) lam tron len(int)
//        Math.ceil(24.4) lam tron xuong
//            Dat nhan outer: ca 2 vong for deu dung  
//            for ( ) {
//                for ( ) {
//                    if (j == 10) {
//                        break outer;
//                    }
//                }
//            }
//        int n = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        ArrayList<Long> arr1 = new ArrayList<>();
//        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
//        arr.add(100);
//        for (int x : arr) {
//            System.out.println(x);
//        }
//        int[] a = {1, 2, 3};
//        System.out.println(a.length);
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i));
//        }
//        Collections.sort(arr);
//        Arrays.fill(a, 1, 4, 0);// gan ca mang a toan so 0 tu 1 -> 4
//        Arrays.sort(a);
//        char xauKiTu = sc.next().charAt(0);
//        System.out.println(xauKiTu);
//        Integer[] a = new Integer[1000];// phai de n cu the
//        for (int i = 0; i < 5; i++) {
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int x1 = tack(o1), x2 = tack(o2);
//                if (x1 > x2) {
//                    return 1;
//                }
//                return -1;
//            }
//        });
//        for (int i = 0; i < 5; i++) {
//            System.out.print(a[i]);
//        }
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return tack(01) - tack(o2);
//            }
//
//        });
//        int[] a = {1, 2, 7, 9, 10, 11, 12, 123, 13, 134};
//        Arrays.sort(a, Collections.reverseOrder());
//        Arrays.parallelSort(a);
//        for (int x : a) {
//            System.out.println(x);
//        }
//        int res = Arrays.binarySearch(a, 8);
//        int[] b = new int[10];
//        System.out.println(res);
//        Arrays.fill(a, 1);
//        Arrays.fill(a, 0, 10, -1);
//        System.arraycopy(a, 0, b, 0, 10);
//        for (int x : b) {
//            System.out.println(x);
////        }
//            HashSet<Integer> set = new HashSet<>();// cac phan tu trong Hash k dc sap xep
//            set.add(1);
//            if (set.contains(5)) {// tim kiem 1 phan tu voi OlogN
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//            set.remove(1);// xoa phan tu trong mang
//            LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
//            set1.add(1);
//            for (int i = 0; i < 10; i++) {
//                set1.add(sc.nextInt());
//            }
//            TreeSet<Integer> set2 = new TreeSet<>();
//            System.out.println(set2.first());// phan tu dau tien cua set
//            System.out.println(set2.last());// phan tu cuoi cung cua set
//            HashMap<Integer, Integer> mp = new HashMap<>();// xoa cac cap trung o truoc
//            mp.put(100, 200);
//        if (mp.containsKey(100)) {// tim kiem xem 100 co trong map k
//
//        } else {
//
//        }
//        mp.remove(100);// xoa key co gia tri 100 trong map
//        System.out.println(mp.get(100));
            ////////////////////////////////////////
            // to hop chap 2 cua K = (n*(n-1))/2  //
            ///////////////////////////////////////
//        for (int i = 0; i < 5; i++) {
//            int x = sc.nextInt();
//            if (mp.containsKey(x)) {
//                int fre = mp.get(x);
//                ++fre;
//                mp.put(x, fre);
//            } else {
//                mp.put(x, 1);
//            }
//        }
//        Set<Map.Entry<Integer,Integer>> entrySet = mp.entrySet();
//        for(Map.Entry<Integer,Integer> x:entrySet){
//            System.out.println(x.getKey()+" "+x.getValue());// in ra phan tu trong HashMap
//        }
            //Arrays.sort(a,Collections.reverseOrder); sap xep giam dan.
            String s = "abcd";
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));// in ra ki tu s[i]
            }
            String t = "edgh";
            s = s.concat(t);// ham noi xau
            System.out.println(s);
            String t1 = s.toLowerCase();//thuong
            s = s.toUpperCase();// in hoa
            s = "le van phong   ";
            s = s.trim();// xoa dau cach o dau va cuoi day
            System.out.println(s);
            System.out.println(s.equals(t)); // so sanh noi dung
            // == so sanh oject xem 2 xâu có cùng tham chiếu đến 1 đối tượng trong heap hay k
            System.out.println(s.compareTo(t1));
            // = 0 khi s = t1
            // -1 khi s < t1
            // 1 khi s > t1
//            System.out.println(s.compareToIgnoreCase(t1));
//            //so sanh khong phan biet hoa thuong
//            String t3 = s.substring(0, 5);// chi lay tu 0 -> n-1
//            String t4 = s.substring(3); // cat tu 3 -> s.size()-1
//            if (s.contains(t3));// tra ve true khi t3 trong s, false nguoc lai
//            s = s.replace("9", "abc"); // ki tu 9 thanh abc
//            char[] a = s.toCharArray(); // chuyen chuoi thanh xau char
//            for (char x : a) {
//                System.out.println(x);
//            }
//            String t5 = sc.next(); // chi doc duoc xau khong co dau cach
//            sc.nextLine(); // xoa phim enter bị trôi lệnh
//            String t6 = sc.nextLine();
//            char t7 = sc.nextLine().charAt(0);y doi cac ki tu trong xau thi su dung
////            -StringTokenizer //
//            -StringBuilder // tha cat cac chuoi thi su dung
//            String[] arr = s.split("\\s+");// bo qua tat ca cac space
//            for(String x:arr){
//                System.out.println(x);
//            }
            String k = "1243";
            BigInteger xx1 = sc.nextBigInteger();// String lon
            BigInteger tong = xx1.add(xx1);
            BigInteger hieu = xx1.subtract(xx1);
            BigInteger tich = xx1.multiply(xx1);
            BigInteger thuong = xx1.divide(xx1);
            BigInteger du = xx1.mod(tong);
            BigInteger res = xx1.modPow(thuong, du);//mu -> chia du
            BigInteger res1 = xx1.modPow(new BigInteger("123"), du);
            StringBuilder x1 = new StringBuilder(s);
            x1.deleteCharAt(x1.length()-1);// xoa di ki tu cuoi cung cua xau
            String x2 = x1.toString();
            x2 += x1;
            x1.append("di hoc");// lối "di hoc" vao duoi x1
            x1.append('x');
           // x1.reverse();
            System.out.println(x1);
            StringTokenizer x3 = new StringTokenizer(s);
            while(x3.hasMoreTokens()){// tack tu
                System.out.println(x3.nextElement());
            }
//            StringTokenizer st = new StringTokenizer(ns,"/");
//            while(st.hasMoreTokens()){
//                int x = Integer.parseInt(st.nextToken());
//                System.out.print(x);
//            }
            //int k = Integer.parseInt(s);
           // String k1 = "" + k;
//        kiem tra ki tu la in hoa
//        if (Character.isUpperCase(kiTu)) {
//    
//        }
//        kiem tra ki tu la in thuong
//        if (Character.isLowerCase(kiTu)) {
//             
//        }

//        kiem tra ki tu la chu cai
//        if (Character.isALphabetic(kiTu)) {
//             
//        }
//          tra ki tu la chu so
//        if (Character.isDigit(kiTu)) {
//            
//        }
//        if(s.charAt(0) =='0'){
//              s = s.replace(s.charAt(0), ''); // thay doi so 0 thanh so khac
//              System.out.println(s);
//          }
//        while(x.length() > 1 && x.charAt(0) == '0'){
//                            x = x.replaceFirst("0", "");// xoa so 0 o dau
//                        }
          //system.out.println(s);
//        
//        char kiTu2 = Charater.toLowerCase(kiTu2) chuyen ki tu in hoa thanh thuong
//        char kiTu2 = Charater.toUpperCase(kiTu) chuyen ki tu in thuong thanh Hoa 
//             sc.nextLine() // xu ly troi lenh
//        string n = sc.nextLine();
//        int k = Integer.parseInt(n); // chuyen chuoi so thanh so
//        int n = Integer.parseInt(sc.nextLine());
//        while (sc.hashNext()) { vo han  int k = Integer.parseInt(n); // chuyen chuoi so thanh so
//        int n = Integer.parseInt(sc.nextLine()
//             
//        }
//        string s = nextLine();

//           Stack<Integer> st = new Stack<>();
//           st.push(1); 
//           st.push(2);
//           if(st.empty()){
//               
//           }
//           System.out.println(st.peek());// lay phan tu o dinh ngan xep
//           int tmp = st.pop(); // xoa phan tu o dau ngan xep
//           System.out.println(st.search(1));// tra ve vi tri/ tinh tu dinh tu 1
//           Queue<Integer> queue = new LinkedList<>();
//           queue.add(1); queue.add(1);
//           System.out.println(queue.peek()); // lay phan tu o dau hang doi
//           System.out.println(queue.poll()); // lay ra phan tu o dau va xoa
//           System.out.println(queue.size());// size
//           Comparator<Integer> cmp = new Comparator<Integer>(){
//              @Override
//              public int compare(Integer o1, Integer o2) {
//                  return o2-o1;
//              }
//               
//           };
//           System.out.println(queue.isEmpty());
//           PriorityQueue<Integer> q = new PriorityQueue<>(cmp);
//           q.add(200);
//           q.add(200);
//           System.out.println(q.peek());
//           q.remove();
//           q.poll(); // lay ra va xoa 
//           System.out.println(q.size());
//           
//        }
    }
}
