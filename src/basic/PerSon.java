/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

/**
 *
 * @author admin
 */
public class PerSon {
//    data field
    private String name;
    private String birth;
    private double gpa;
//    method : behavior
//    constructor : co the nap chong duoc
    public PerSon(){
        //System.out.println("Day la ham khoi tao khong co tham so");
    }
    public PerSon(String ten, String ngaySinh, double diem){
        System.out.println("Day la ham khoi tao co tham so");
        name = ten;
        birth = ngaySinh;
        gpa = diem;
    }

    public PerSon(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }
    
    public void eat(){
        System.out.println("People can eat !");
    }
//    interface: getter, setter : lay du lieu private
    public String getName(){
        return this.name;
    }
    public String getBirth(){
        return this.birth;
    }
    public double getGpa(){
        return this.gpa;
    }
    
    public void SetName(String name){
        this.name = name;
    }
    public void SetBirth(String birth){
        this.birth = birth;
    }
    public void SetBirth(double gpa){
        this.gpa = gpa;
    }
    //dung refator -> encap : de lay nhanh dong lenh
}
