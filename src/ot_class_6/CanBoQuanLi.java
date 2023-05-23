/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ot_class_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CanBoQuanLi extends NhanVien {
     private String ChucVu;
    private float HeSoLuong,PhuCap;
    public CanBoQuanLi(){
        
    }
    public CanBoQuanLi(String Ma,String HoTen,String DiaChi,String ChucVu,float HeSoLuong,float PhuCap){
        super(Ma,HoTen,DiaChi);
        this.ChucVu=ChucVu;
        this.HeSoLuong=HeSoLuong;
        this.PhuCap=PhuCap;
    }
    public void setChucVu(String ChucVu){
        this.ChucVu=ChucVu;
    }
    public String getChucVu(){
        return ChucVu;
    }
    public void setHeSoLuong(float HeSoLuong){
        this.HeSoLuong=HeSoLuong;
    }
    public float getHeSoLuong(){
        return HeSoLuong;
    }
     public void setPhuCap(float PhuCap){
        this.PhuCap=PhuCap;
    }
    public float getPhuCap(){
        return PhuCap;
    }
    public float TinhLuong(){
        float tl =0;
        tl=(float)(1450*(this.getHeSoLuong()+this.getPhuCap()));
        return tl;
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("(+) Nhập Chức vụ: ");
        this.setChucVu(sc.nextLine());
        System.out.print("(+) Nhập hệ số lương: ");
        this.setHeSoLuong(sc.nextFloat());
        System.out.print("(+) Nhập phụ cấp: ");
        this.setPhuCap(sc.nextFloat());
    }
    public void output(){
        super.output();
        System.out.printf("%-15s%-15f%-15f%-15f",this.getChucVu(),this.getHeSoLuong(),this.getPhuCap(),this.TinhLuong());
    }
   public static void main(String[] args){
       int n;
       Scanner sc = new Scanner(System.in);
       System.out.print("\t\tNhập vào số cán bộ quản lí cần nhập: ");
       n=sc.nextInt();
       sc.nextLine();
       ArrayList<CanBoQuanLi> list = new ArrayList<>();
       for(int i =0;i<n;i++){
           System.out.println("\t(-)Nhập cán bộ quản lí thứ : "+(i+1));
           CanBoQuanLi cb = new CanBoQuanLi();
           cb.input();
           list.add(cb);
           System.out.println("--------------");
       }
       int luachon;
       while(true){
           System.out.println("\n\n");
       System.out.println("\t\t1.Hiển thị thông tin");
       System.out.println("\t\t2.Cán bộ có tiền lương cao nhất");
       System.out.println("\t\t3.Sắp xếp tăng dần tiền lương");
       System.out.println("\t\t4.Tìm kiếm");
       System.out.println("\t\t0.Dừng lại");
       System.out.print("Nhập chức năng cần dùng: ");
       luachon=sc.nextInt();
       sc.nextLine();
       System.out.println("");
           switch(luachon){
           case 1:
               System.out.println("---------Hiển thị thông tin---------\n");
               System.out.printf("%-15s%-25s%-15s%-15s%-15s%-15s%-15s","Mã","Họ và tên","Địa chỉ","Chức vụ","Hệ số lương","Phụ cấp","Tổng lương");
               System.out.println("");
               for(CanBoQuanLi temp:list){
                   temp.output();
                   System.out.println("");
               }
               break;
           case 2:
               float maxtl=0;
               System.out.println("---------Cán bộ có tiền lương cao nhất---------\n");
               for(int i =0;i<n;i++){
                    CanBoQuanLi cb = new CanBoQuanLi();
                    if(list.get(i).TinhLuong()>maxtl){
                        maxtl=list.get(i).TinhLuong();
                    }
                }
               System.out.printf("%-15s%-25s%-15s%-15s%-15s%-15s%-15s","Mã","Họ và tên","Địa chỉ","Chức vụ","Hệ số lương","Phụ cấp","Tổng lương");
               System.out.println("");
               for(CanBoQuanLi temp:list){
                   if(temp.TinhLuong()==maxtl){
                        temp.output();
                   System.out.println("");
                   }
               }
               break;
           case 3:
               System.out.println("---------Sắp xếp---------\n");
               System.out.printf("%-15s%-25s%-15s%-15s%-15s%-15s%-15s","Mã","Họ và tên","Địa chỉ","Chức vụ","Hệ số lương","Phụ cấp","Tổng lương");
               System.out.println("");
               for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).TinhLuong()>list.get(j).TinhLuong())
                {
                    CanBoQuanLi temp=list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }
        }
               for(CanBoQuanLi temp:list){
                   temp.output();
                   System.out.println("");
               }
               break;
           case 4:
               String timkiem;
               System.out.println("Nhập họ tên người cần tìm kiếm");
               timkiem=sc.nextLine();
               System.out.printf("%-15s%-25s%-15s%-15s%-15s%-15s%-15s","Mã","Họ và tên","Địa chỉ","Chức vụ","Hệ số lương","Phụ cấp","Tổng lương");
               System.out.println("");
                for(CanBoQuanLi temp:list)
            {
                if(temp.getHoTen().equalsIgnoreCase(timkiem)){
                    temp.output();
                   System.out.println("");
                }
            }
                break;
           default:
               return;
       }
       }
    }
}
