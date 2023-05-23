/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ot_class_6;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class NhanVien {
    private String Ma,HoTen,DiaChi;
    public NhanVien(){
        
    }
    public NhanVien(String Ma,String HoTen,String DiaChi){
        this.Ma=Ma;
        this.HoTen=HoTen;
        this.DiaChi=DiaChi;
    }
    public void setMa(String Ma){
        this.Ma=Ma;
    }
    public String getMa(){
        return Ma;
    }
    public void setHoTen(String HoTen){
        this.HoTen=HoTen;
    }
    public String getHoTen(){
        return HoTen;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi=DiaChi;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("(+) Nhập mã nhân viên:");
        this.setMa(s.nextLine());
         System.out.print("(+) Nhập họ tên nhân viên:");
        this.setHoTen(s.nextLine());
        System.out.print("(+) Nhập địa chỉ nhân viên:");
        this.setDiaChi(s.nextLine());
    }
    public void output(){
        System.out.printf("%-15s%-25s%-15s",this.getMa(),this.getHoTen(),this.getDiaChi());
    }
}
