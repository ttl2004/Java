/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;

import java.util.Scanner;

public class Khach {
    private Kho kho;

    // Constructor của Khach nhận đối tượng Kho làm đối số
    public Khach(Kho kho) {
        this.kho = kho;
    }

    public void hi() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.err.print("Nhap so de thuc hien chuc nang:\n" + "1. Tim kiem\n" + "2. Xem kho\n" + "3. EXIT\n");
            int n = sc.nextInt();

            if (n == 1) {
                sc.nextLine();
                System.out.println("Nhap tu khoa ban muon tim kiem:");
                String st = sc.nextLine();
                int kt = 0, kt1 = 0, kt2 = 0, kt3 = 0, check = 0, check_1 = 0;
                //tim sach
                System.out.printf("Chon kieu xem:\n 1. Dang bang\n 2. Danh sach\n");
                int see = sc.nextInt();
                for (int i = 0; i < kho.getIdx(); i++) {
                    // Sử dụng kho thay vì tạo một đối tượng mới
                    if (st.equals(kho.getArr()[i].getTen_tac_pham()) || st.equals(kho.getArr()[i].getTac_gia()) || st.equals(kho.getArr()[i].getTheloai()) || st.equals(kho.getArr()[i].getDate())
                        || st.equals(kho.getArr()[i].getGia_ban()) || st.equals(kho.getArr()[i].getNha_xuat_ban()) || st.equals(kho.getArr()[i].getThuong_hieu()) || st.equals(kho.getArr()[i].getLanguage())
                        || kho.getArr()[i].getTen_tac_pham().indexOf(st) != -1 || kho.getArr()[i].getGia_ban().indexOf(st) != -1 || kho.getArr()[i].getThuong_hieu().indexOf(st) != -1 || kho.getArr()[i].getTheloai().indexOf(st) != -1
                        || kho.getArr()[i].getTac_gia().indexOf(st) != -1 || kho.getArr()[i].getNha_xuat_ban().indexOf(st) != -1 || kho.getArr()[i].getDate().indexOf(st) != -1 || kho.getArr()[i].getLanguage().indexOf(st) != -1) {
                        kt = 1;
                        if (see == 1) {
                            if (check_1 == 0) {
                                System.out.printf("Ten san pham                          Gia ban                          Thuong hieu                         Thong tin them\n");
                                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                                check_1 = 1;
                            }
                            kho.getArr()[i].xem_2();
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        }
                        else if (see == 2) {
                            if (check == 0) {
                                System.out.println("Danh sách sản phẩm tìm kiếm được:");
                                check = 1;
                            }
                            kho.getArr()[i].in();
                        }
                    } 
                }
                //tim vo ghi
                for (int i = 0; i < kho.getIndex(); i ++) {
                    if (st.equals(kho.getBrr()[i].getName()) || st.equals(kho.getBrr()[i].getCost()) || st.equals(kho.getBrr()[i].getThuonghieu()) || st.equals(kho.getBrr()[i].getSo_trang())
                        || st.equals(kho.getBrr()[i].getType()) || st.equals(kho.getBrr()[i].getColor()) || st.equals(kho.getBrr()[i].getChat_lieu()) || st.equals(kho.getBrr()[i].getKich_thuoc())
                        || kho.getBrr()[i].getName().indexOf(st) != -1 || kho.getBrr()[i].getCost().indexOf(st) != -1 || kho.getBrr()[i].getThuonghieu().indexOf(st) != -1 || kho.getBrr()[i].getSo_trang().indexOf(st) != -1
                        || kho.getBrr()[i].getType().indexOf(st) != -1 || kho.getBrr()[i].getColor().indexOf(st) != -1 || kho.getBrr()[i].getChat_lieu().indexOf(st) != -1 || kho.getBrr()[i].getKich_thuoc().indexOf(st) != -1) {
                        kt1 = 1;  
                        if (see == 1) {
                            if (check_1 == 0) {
                                System.out.printf("Ten san pham                          Gia ban                          Thuong hieu                         Thong tin them\n");
                                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                                check_1 = 1;
                            }
                            kho.getBrr()[i].xem_2();
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        }
                        else if (see == 2) {
                           if (check == 0) {
                                System.out.println("Danh sách sản phẩm tìm kiếm được:");
                                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                                check = 1;
                            }
                            kho.getBrr()[i].in();
                        }
                    } 
                }
                //tim but chi
                for (int i = 0; i < kho.getStt(); i ++) {
                    if (st.equals(kho.getCrr()[i].getTen_sp()) || st.equals(kho.getCrr()[i].getG_ban()) || st.equals(kho.getCrr()[i].getTh_hieu()) || st.equals(kho.getCrr()[i].getMau_sac())
                        || st.equals(kho.getCrr()[i].getChat_lieu()) || st.equals(kho.getCrr()[i].getDo_cung())
                        || kho.getCrr()[i].getTen_sp().indexOf(st) != -1 || kho.getCrr()[i].getG_ban().indexOf(st) != -1 || kho.getCrr()[i].getTh_hieu().indexOf(st) != -1 || kho.getCrr()[i].getMau_sac().indexOf(st) != -1
                        || kho.getCrr()[i].getChat_lieu().indexOf(st) != -1 || kho.getCrr()[i].getDo_cung().indexOf(st) != -1) {
                        kt2 = 1;
                        if (see == 1) {
                            if (check_1 == 0) {
                                System.out.printf("Ten san pham                          Gia ban                          Thuong hieu                         Thong tin them\n");
                                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                                check_1 = 1;
                            }
                            kho.getCrr()[i].xem_2();
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        }
                        else if (see == 2) {
                            if (check == 0) {
                                System.out.println("Danh sách sản phẩm tìm kiếm được:");
                                check = 1;
                            }
                            kho.getCrr()[i].in();
                        }
                    } 

                }
                //tim but muc
                for (int i = 0; i < kho.getIj(); i ++) {
                    if (st.equals(kho.getDrr()[i].getName_sp()) || st.equals(kho.getDrr()[i].getGban()) || st.equals(kho.getDrr()[i].getT_hieu()) || st.equals(kho.getDrr()[i].getMsac())
                        || st.equals(kho.getDrr()[i].getC_lieu()) || st.equals(kho.getDrr()[i].getLoai_muc()) || st.equals(kho.getDrr()[i].getDo_min())
                        || kho.getDrr()[i].getName_sp().indexOf(st) != -1 || kho.getDrr()[i].getGban().indexOf(st) != -1 || kho.getDrr()[i].getT_hieu().indexOf(st) != -1 || kho.getDrr()[i].getMsac().indexOf(st) != -1
                        || kho.getDrr()[i].getC_lieu().indexOf(st) != -1 || kho.getDrr()[i].getLoai_muc().indexOf(st) != -1 || kho.getDrr()[i].getDo_min().indexOf(st) != -1) {
                        kt3 = 1;
                        if (see == 1) {
                            if (check_1 == 0) {
                                System.out.printf("Ten san pham                          Gia ban                          Thuong hieu                         Thong tin them\n");
                                check_1 = 1;
                            }
                            kho.getDrr()[i].xem_2();
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                        }
                        else if (see == 2) {
                            if (check == 0) {
                                System.out.println("Danh sach san pham tim kiem duoc:");
                                check = 1;
                            }
                            kho.getDrr()[i].in();
                        }
                    }
                }
                if (kt == 0 && kt1 == 0 && kt2 == 0 && kt3 == 0) System.out.println("Khong tim thay thu ban muon tim.");
            } 
            else if (n == 2) {
                if (kho.getIdx() != 0){
                    System.out.println("------Danh sach sach------");
                    kho.xem_sach();
                    System.out.print("------\n");
                }
                else kho.xem_sach();
                if (kho.getIndex()!= 0){
                    System.out.println("------Danh sach vo ghi------");
                    kho.xem_vo_ghi();
                    System.out.print("------\n");
                }
                else kho.xem_vo_ghi();
                if (kho.getStt()!= 0){
                    System.out.println("------Danh sach but chi------");
                    kho.xem_but_chi();
                    System.out.print("------\n");
                }
                else kho.xem_but_chi();
                if (kho.getIj()!= 0){
                    System.out.println("------Danh sach but muc------");
                    kho.xem_but_muc();
                    System.out.print("------\n");
                }
                else kho.xem_but_muc();
                
            }
            else if (n == 3) break;
        }
    }
}
