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
            System.err.print("Nhap so de thuc hien chuc nang:\n" + "1. Tim kiem\n" + "2. Xem danh sach sach\n" + "3. EXIT\n");
            int n = sc.nextInt();

            if (n == 1) {
                sc.nextLine();
                System.out.println("Nhap tu khoa ban muon tim kiem:");
                String st = sc.nextLine();
                int kt = 0;
                for (int i = 0; i < kho.getIdx(); i++) {
                    // Sử dụng kho thay vì tạo một đối tượng mới
                    if (st.equals(kho.getArr()[i].getTieude())) {
                        kt = 1;
                        System.out.print(kho.getArr()[i].getTieude() + " " + kho.getArr()[i].getTacgia() + " " + kho.getArr()[i].getTheloai() + " " + kho.getArr()[i].getDate() + "\n");
                    } else if (st.equals(kho.getArr()[i].getTacgia())) {
                        kt = 1;
                        System.out.print(kho.getArr()[i].getTieude() + " " + kho.getArr()[i].getTacgia() + " " + kho.getArr()[i].getTheloai() + " " + kho.getArr()[i].getDate() + "\n");
                    } else if (st.equals(kho.getArr()[i].getTheloai())) {
                        kt = 1;
                        System.out.print(kho.getArr()[i].getTieude() + " " + kho.getArr()[i].getTacgia() + " " + kho.getArr()[i].getTheloai() + " " + kho.getArr()[i].getDate() + "\n");
                    } else if (st.equals(kho.getArr()[i].getDate())) {
                        kt = 1;
                        System.out.print(kho.getArr()[i].getTieude() + " " + kho.getArr()[i].getTacgia() + " " + kho.getArr()[i].getTheloai() + " " + kho.getArr()[i].getDate() + "\n");
                    }
                }
                if (kt == 0) System.out.println("Khong tim thay sach.");
            } else if (n == 2) kho.xem_sach();
            else if (n == 3) break;
        }
    }
}
