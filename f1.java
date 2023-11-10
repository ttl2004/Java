/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;
import java.util.Scanner;
//ADMIN
public class f1{
    private Kho kho;

    // Constructor của Khach nhận đối tượng Kho làm đối số
    public f1(Kho kho) {
        this.kho = kho;
    }
    public void hello(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Nhap so de thuc hien chuc nang:\n" + "1. Them sach\n" + "2. Xoa sach\n" + "3. Sua sach\n" + "4. Chuc nang cua khach\n" + "5. Dang xuat\n");
            int n = sc.nextInt();
            if (n == 1){
                kho.them_sach();
            }
            else if (n == 2) kho.xoa_sach();
            else if (n == 3) kho.sua_sach();
            else if (n == 4) System.out.println("Hien tai ban chua duoc cap quyen thuc hien chuc nang nay:>>");
            else if (n == 5) break;
        }

    }
}