/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Admin {
    private Kho kho;

    // Constructor của Khach nhận đối tượng Kho làm đối số
    public Admin(Kho kho) {
        this.kho = kho;
    }
    public void hello(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Chon san pham ban muon truy cap:\n" + "1. Sach\n" + "2. Vo ghi\n" + "3. But chi\n" + "4. But muc\n" + "5. Dang xuat\n");
            int cn = sc.nextInt();
            if (cn == 1) {
                while (true) {
                    System.out.print("Nhap so de thuc hien chuc nang:\n" + "1. Them sach\n" + "2. Xoa sach\n" + "3. Sua sach\n"  + "4. Xem kho sach\n" + "5. Exit\n");
                    int n = sc.nextInt();
                    if (n == 1){
                        kho.them_sach();
                    }
                    else if (n == 2) kho.xoa_sach();
                    else if (n == 3) kho.sua_sach();
                    else if (n == 4) {
                        System.out.print("Xem o dang:\n" + "1. Dang bang\n" + "2. Dang danh sach\n");
                        int see = sc.nextInt();
                        if (see == 1) {
                            System.out.printf("Ten san pham                          Gia ban                          Thuong hieu                         Thong tin them\n");
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                            for (int i = 0; i < kho.getIdx(); i ++) {
                                kho.getArr()[i].xem_2();
                                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        else if (see == 2){
                            kho.xem_sach();
                            System.out.println("------");
                        }
                    }
                    else if (n == 5) break;
                }
            }
            else if (cn == 2) {
                while (true) {
                    System.out.print("Nhap so de thuc hien chuc nang:\n" + "1. Them vo ghi\n" + "2. Xoa vo ghi\n" + "3. Sua vo ghi\n"  + "4. Xem kho vo ghi\n" + "5. Exit\n");
                    int n = sc.nextInt();
                    if (n == 1){
                        kho.them_vo_ghi();
                    }
                    else if (n == 2) kho.xoa_vo_ghi();
                    else if (n == 3) kho.sua_vo_ghi();
                    else if (n == 4) {
                        System.out.print("Xem o dang:\n" + "1. Dang bang\n" + "2. Dang danh sach\n");
                        int see = sc.nextInt();
                        if (see == 1) {
                            System.out.printf("Ten san pham                          Gia ban                          Thuong hieu                         Thong tin them\n");
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                            for (int i = 0; i < kho.getIndex(); i ++) {
                                kho.getBrr()[i].xem_2();
                                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        else if (see == 2){
                            kho.xem_vo_ghi();
                            System.out.println("------");
                        }
                    }
                    else if (n == 5) break;
                }
            }
            else if (cn == 3) {
                while (true) {
                    System.out.print("Nhap so de thuc hien chuc nang:\n" + "1. Them but chi\n" + "2. Xoa but chi\n" + "3. Sua but chi\n"  + "4. Xem but chi\n" + "5. Exit\n");
                    int n = sc.nextInt();
                    if (n == 1){
                        kho.them_but_chi();
                    }
                    else if (n == 2) kho.xoa_but_chi();
                    else if (n == 3) kho.sua_but_chi();
                    else if (n == 4) {
                        System.out.print("Xem o dang:\n" + "1. Dang bang\n" + "2. Dang danh sach\n");
                        int see = sc.nextInt();
                        if (see == 1) {
                            System.out.printf("Ten san pham                          Gia ban                          Thuong hieu                         Thong tin them\n");
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                            for (int i = 0; i < kho.getStt(); i ++) {
                                kho.getCrr()[i].xem_2();
                                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        else if (see == 2){
                            kho.xem_but_chi();
                            System.out.println("------");
                        }
                    }
                    else if (n == 5) break;
                }
            }
            else if (cn == 4) {
                while (true) {
                    System.out.print("Nhap so de thuc hien chuc nang:\n" + "1. Them but muc\n" + "2. Xoa but muc\n" + "3. Sua but muc\n"  + "4. Xem kho but muc\n" + "5. Exit\n");
                    int n = sc.nextInt();
                    if (n == 1){
                        kho.them_but_muc();
                    }
                    else if (n == 2) kho.xoa_but_muc();
                    else if (n == 3) kho.sua_but_muc();
                    else if (n == 4) {
                        System.out.print("Xem o dang:\n" + "1. Dang bang\n" + "2. Dang danh sach\n");
                        int see = sc.nextInt();
                        if (see == 1) {
                            System.out.printf("Ten san pham                          Gia ban                          Thuong hieu                         Thong tin them\n");
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                            for (int i = 0; i < kho.getIj(); i ++) {
                                kho.getDrr()[i].xem_2();
                                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        else if (see == 2){
                            kho.xem_but_muc();
                            System.out.println("------");
                        }
                    }
                    else if (n == 5) break;
                }
            }
            else if (cn == 5){
                System.out.println("Dang xuat thanh cong!");
                break;
            }
        }

    }
}
