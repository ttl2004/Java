/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;

/**
 *
 * @author Admin
 */
import com.proit4all.main.Luutru;
import java.util.Scanner;
import com.proit4all.main.f1;
import java.util.Arrays;
public class Kho { 

    Kho() {
        arr = new Luutru[1000];
    }
    private Luutru[] arr;
    private static int idx = 0;

    public Luutru[] getArr() {
        return arr;
    }

    public static int getIdx() {
        return idx;
    }
    void xem_sach(){
        if (idx == 0) {
            System.out.println("Chua co sach, vui long cho doi.");
        }
        else{
            System.out.print("STT       Tieu de       Tac gia     The loai        Ngay xuat ban\n");
            for (int i = 0; i < idx; i ++) {
               if (arr[i].getTieude().equals("0") == false) {
                   System.out.print((i + 1) + "        " + arr[i].getTieude() + "      " + arr[i].getTacgia() + "      " + arr[i].getTheloai() + "     " + arr[i].getDate() + "\n");
               }
            }
        }
    }
    void them_sach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach can them:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i ++){
            arr[idx] = new Luutru();
            System.out.println("Nhap tieu de:");
            arr[idx].setTieude(sc.nextLine());
            System.out.println("Nhap tac gia:");
            arr[idx].setTacgia(sc.nextLine());
            System.out.println("Nhap the loai:");
            arr[idx].setTheloai(sc.nextLine());
            System.out.println("Nhap ngay xuat ban:");
            arr[idx].setDate(sc.nextLine());
            idx++;
        }
    }
    void sua_sach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thu tu sach can sua:");
        int n = sc.nextInt();
        if (n > idx && n <= 0) {
            System.out.println("Khong co sach nay trong kho");
            return;
        }
        while (true) {
            System.out.print("Chon muc ban muon sua:\n" + "1. Tieu de\n" + "2. Tac gia\n" + "3. The loai\n" + "4. Ngay xuat ban\n" + "0. Thoat\n" );
            int cnang = sc.nextInt();
            sc.nextLine();
            if (cnang == 1) {
                System.out.println("Nhap tieu de moi:");
                arr[n - 1].setTieude(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 2) {
                System.out.println("Nhap tac gia moi:");
                arr[n - 1].setTacgia(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 3) {
                System.out.println("Nhap the loai moi:");
                arr[n - 1].setTheloai(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 4) {
                System.out.println("Nhap ngay xuat ban moi:");
                arr[n - 1].setDate(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 0) {
                System.out.println("hoat thanh cong.");
                break;
            } 
        } 
    }
    void xoa_sach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thu tu sach can xoa:");
        int n = sc.nextInt();
         if (n > idx && n <= 0) {
            System.out.println("Khong co sach nay trong kho");
            return;
        }
        int cnt = 0;
        if (idx == 1) {
            Arrays.fill(arr, null);
            idx = 0;
        }
        else {
            for (int i = n - 1; i < idx - 1; i ++) {
                arr[i] = arr[i + 1];
                cnt++;
            }
            idx -= cnt;
        }
        System.out.println("Da hoan thanh.");
    }
}
