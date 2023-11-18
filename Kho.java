/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;

/**
 *
 * @author Admin
 */
import com.proit4all.main.Sach;
import java.util.Scanner;
import com.proit4all.main.Admin;
import java.util.Arrays;
import com.proit4all.main.Voghi;
import com.proit4all.main.Butchi;
import com.proit4all.main.Butmuc;
public class Kho { 

    Kho() {
        arr = new Sach[1000];
        brr = new Voghi[1000];
        crr = new Butchi[1000];
        drr = new Butmuc[1000];
    }
    private Voghi[] brr;
    private Butchi[] crr;
    private Butmuc[] drr;
    private Sach[] arr;
    private int idx = 0;
    private int index = 0;
    private int stt = 0;
    private int ij = 0;

    public int getIndex() {
        return index;
    }

    public int getStt() {
        return stt;
    }

    public int getIj() {
        return ij;
    }
    public Voghi[] getBrr() {
        return brr;
    }

    public void setBrr(Voghi[] brr) {
        this.brr = brr;
    }

    public Butchi[] getCrr() {
        return crr;
    }

    public void setCrr(Butchi[] crr) {
        this.crr = crr;
    }

    public Butmuc[] getDrr() {
        return drr;
    }

    public void setDrr(Butmuc[] drr) {
        this.drr = drr;
    }

    public Sach[] getArr() {
        return arr;
    }

    public int getIdx() {
        return idx;
    }
    //Cac chuc nang cua sach
    void xem_sach(){
        if (idx == 0) {
            System.out.println("Chua co sach, vui long cho doi.");
        }
        else{
            for (int i = 0; i < idx; i ++) {
                arr[i].in();
            }
        }
    }
    void them_sach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach can them:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i ++){
            arr[idx] = new Sach();
            System.out.println("Nhap ten tac pham: ");
            arr[idx].setTen_tac_pham(sc.nextLine());
            System.out.println("Nhap gia ban: ");
            arr[idx].setGia_ban(sc.nextLine());
             System.out.println("Nhap thuong hieu: ");
            arr[idx].setThuong_hieu(sc.nextLine());
            System.out.println("Nhap the loai: ");
            arr[idx].setTheloai(sc.nextLine());
             System.out.println("Nhap tac gia: ");
            arr[idx].setTac_gia(sc.nextLine());
             System.out.println("Nhap nha xuat ban: ");
            arr[idx].setNha_xuat_ban(sc.nextLine());
            System.out.println("Nhap nam xuat ban: ");
            arr[idx].setDate(sc.nextLine());
             System.out.println("Nhap loai ngon ngu: ");
            arr[idx].setLanguage(sc.nextLine());
            idx++;
        }
    }
    void sua_sach() {
        Scanner sc = new Scanner(System.in);
         if (idx == 0) {
            System.out.println("Khong co sach de sua!");
            return; 
        }
        System.out.print("STT     Ten tac pham                    Gia ban               Thuong hieu               The loai          Tac gia               Nha xuat ban                    Nam xuat ban     Ngon ngu\n");
        for (int i = 0; i < idx ; i ++) {
            System.out.printf("%d", (i + 1));
            String len = String.valueOf(i + 1);
            int kc = 8 - len.length();
            for (int j = 0; j < kc; j ++) System.out.printf(" ");
            arr[i].xem();
        }
        System.out.println("Nhap thu tu sach can sua:");
        int n = sc.nextInt();
        if (n > idx && n <= 0) {
            System.out.println("Khong co sach nay trong kho");
            return;
        }
        while (true) {
            System.out.print("Chon muc ban muon sua:\n" + "1. Ten tac pham\n" + "2. Gia ban\n" + "3. Thuong hieu\n" + "4. The loai\n" + "5. Tac gia\n" + "6. Nha xuat ban\n" + "7. Nam xuat ban\n" + "8. Ngon ngu\n" + "0. Thoat\n" );
            int cnang = sc.nextInt();
            sc.nextLine();
            if (cnang == 1) {
                System.out.println("Nhap ten tac pham moi: ");
                arr[n - 1].setTen_tac_pham(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 2) {
                System.out.println("Nhap gia ban moi: ");
                arr[n - 1].setGia_ban(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 3) {
                System.out.println("Nhap thuong hieu moi: ");
                arr[n - 1].setThuong_hieu(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 4) {
                System.out.println("Nhap the loai moi: ");
                arr[n - 1].setTheloai(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
             else if (cnang == 5) {
                System.out.println("Nhap tac gia moi: ");
                arr[n - 1].setTac_gia(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
              else if (cnang == 6) {
                System.out.println("Nhap nha xuat ban moi: ");
                arr[n - 1].setNha_xuat_ban(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
               else if (cnang == 7) {
                System.out.println("Nhap nam xuat ban moi:");
                arr[n - 1].setDate(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
                else if (cnang == 8) {
                System.out.println("Nhap ngon ngu moi: ");
                arr[n - 1].setLanguage(sc.nextLine());
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
        if (idx == 0) {
            System.out.println("Khong co sach de xoa!");
            return; 
        }
        if (idx != 0) {
            System.out.print("STT     Ten tac pham                    Gia ban               Thuong hieu               The loai          Tac gia               Nha xuat ban                    Nam xuat ban     Ngon ngu\n");
            for (int i = 0; i < idx ; i ++) {
                System.out.printf("%d", (i + 1));
                String len = String.valueOf(i + 1);
                int kc = 8 - len.length();
                for (int j = 0; j < kc; j ++) System.out.printf(" ");
                arr[i].xem();
            }
        }
        System.out.println("Nhap thu tu sach can xoa:");
        int n = sc.nextInt();
        if (n > idx || n <= 0) {
            System.out.println("Khong co sach nay trong kho");
            return;
        }
        for (int i = n - 1; i < idx; i ++) {
                arr[i] = arr[i + 1];
        }
        idx --;
        System.out.println("Da hoan thanh.");
    }
    //Cac chuc nang cua vo ghi
    void xem_vo_ghi(){
        if (index == 0) {
            System.out.println("Chua co vo ghi, vui long cho doi.");
        }
        else{
            for (int i = 0; i < index; i ++) {
                brr[i].in();
            }
        }
    }
    void them_vo_ghi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong vo ghi can them:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i ++){
            brr[index] = new Voghi();
            System.out.println("Nhap ten san pham: ");
            brr[index].setName(sc.nextLine());
            System.out.println("Nhap gia ban: ");
            brr[index].setCost(sc.nextLine());
            System.out.println("Nhap thuong hieu: ");
            brr[index].setThuonghieu(sc.nextLine());
            System.out.println("Nhap so trang: ");
            brr[index].setSo_trang(sc.nextLine());
            System.out.println("Nhap loai vo: ");
            brr[index].setType(sc.nextLine());
            System.out.println("Nhap mau sac bia: ");
            brr[index].setColor(sc.nextLine());
            System.out.println("Nhap chat lieu: ");
            brr[index].setChat_lieu(sc.nextLine());
            System.out.println("Nhap kich thuoc: ");
            brr[index].setKich_thuoc(sc.nextLine());
            index++;
        }
    }
    void sua_vo_ghi() {
        Scanner sc = new Scanner(System.in);
         if (index == 0) {
            System.out.println("Khong co vo ghi de sua!");
            return; 
        }
        System.out.print("STT     Ten san pham                    Gia ban               Thuong hieu               So trang     Loai vo          Mau sac bia       Chat lieu giay       Kich thuoc\n");
        for (int i = 0; i < index ; i ++) {
            System.out.printf("%d", (i + 1));
            String len = String.valueOf(i + 1);
            int kc = 8 - len.length();
            for (int j = 0; j < kc; j ++) System.out.printf(" ");
            brr[i].xem();
        }
        System.out.println("Nhap thu vo ghi can sua:");
        int n = sc.nextInt();
        if (n > index && n <= 0) {
            System.out.println("Khong co vo ghi nay trong kho");
            return;
        }
        while (true) {
            System.out.print("Chon muc ban muon sua:\n" + "1. Ten san pham\n" + "2. Gia ban\n" + "3. Thuong hieu\n" + "4. So trang\n" + "5. Loai vo\n" + "6. Mau sac bia\n" + "7. Chat lieu giay\n" + "8. Kich thuoc\n" + "0. Thoat\n" );
            int cnang = sc.nextInt();
            sc.nextLine();
            if (cnang == 1) {
                System.out.println("Nhap ten san pham moi: ");
                brr[n - 1].setName(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 2) {
                System.out.println("Nhap gia ban moi: ");
                brr[n - 1].setCost(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 3) {
                System.out.println("Nhap thuong hieu moi: ");
                brr[n - 1].setThuonghieu(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 4) {
                System.out.println("Nhap so trang moi: ");
                brr[n - 1].setSo_trang(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
             else if (cnang == 5) {
                System.out.println("Nhap loai vo moi: ");
                brr[n - 1].setType(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
              else if (cnang == 6) {
                System.out.println("Nhap mau sac bia moi: ");
                brr[n - 1].setColor(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
               else if (cnang == 7) {
                System.out.println("Nhap chat lieu giay moi: ");
                brr[n - 1].setChat_lieu(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
                else if (cnang == 8) {
                System.out.println("Nhap kich thuoc moi: ");
                brr[n - 1].setKich_thuoc(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 0) {
                System.out.println("hoat thanh cong.");
                break;
            } 
        } 
    }
    void xoa_vo_ghi() {
         if (index == 0) {
            System.out.println("Khong co vo ghi de xoa!");
            return; 
        }
        if (index != 0) {
            System.out.print("STT     Ten san pham                    Gia ban               Thuong hieu               So trang     Loai vo          Mau sac bia       Chat lieu giay       Kich thuoc\n");
            for (int i = 0; i < index ; i ++) {
                System.out.printf("%d", (i + 1));
                String len = String.valueOf(i + 1);
                int kc = 8 - len.length();
                for (int j = 0; j < kc; j ++) System.out.printf(" ");
                brr[i].xem();
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thu tu vo ghi can xoa:");
        int n = sc.nextInt();
        if (n > index || n <= 0) {
            System.out.println("Khong co sach nay trong kho");
            return;
        }
        for (int i = n - 1; i < index; i ++) {
            brr[i] = brr[i + 1];
        }
        index --;
        System.out.println("Da hoan thanh.");
    }
    //Cac chuc nang cua but chi
    void xem_but_chi(){
        if (stt == 0) {
            System.out.println("Chua co but chi, vui long cho doi.");
        }
        else{
            for (int i = 0; i < stt; i ++) {
                crr[i].in();
            }
        }
    }
    void them_but_chi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong but chi can them:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i ++){
            crr[stt] = new Butchi();
            System.out.println("Nhap ten san pham:");
            crr[stt].setTen_sp(sc.nextLine());
            System.out.println("Nhap gia ban:");
            crr[stt].setG_ban(sc.nextLine());
             System.out.println("Nhap thuong hieu:");
            crr[stt].setTh_hieu(sc.nextLine());
            System.out.println("Nhap mau sac:");
            crr[stt].setMau_sac(sc.nextLine());
             System.out.println("Nhap chat lieu:");
            crr[stt].setChat_lieu(sc.nextLine());
             System.out.println("Nhap do cung:");
            crr[stt].setDo_cung(sc.nextLine());
            stt++;
        }
    }
    void sua_but_chi() {
         if (stt == 0) {
            System.out.println("Khong co but chi de sua!");
            return; 
        }
        System.out.print("STT     Ten san pham                    Gia ban               Thuong hieu               Mau sac       Chat lieu       Do cung\n");
        for (int i = 0; i < stt ; i ++) {
            System.out.printf("%d", (i + 1));
            String len = String.valueOf(i + 1);
            int kc = 8 - len.length();
            for (int j = 0; j < kc; j ++) System.out.printf(" ");
            crr[i].xem();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thu tu but chi can sua:");
        int n = sc.nextInt();
        if (n > stt && n <= 0) {
            System.out.println("Khong co but chi nay trong kho");
            return;
        }
        while (true) {
            System.out.print("Chon muc ban muon sua:\n" + "1. Ten san pham\n" + "2. Gia ban\n" + "3. Thuong hieu\n" + "4. Mau sac\n" + "5. Chat lieu\n" + "6. Do cung\n" + "0. Thoat\n" );
            int cnang = sc.nextInt();
            sc.nextLine();
            if (cnang == 1) {
                System.out.println("Nhap ten san pham moi:");
                crr[n - 1].setTen_sp(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 2) {
                System.out.println("Nhap gia ban moi:");
                crr[n - 1].setG_ban(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 3) {
                System.out.println("Nhap thuong hieu moi:");
                crr[n - 1].setTh_hieu(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 4) {
                System.out.println("Nhap mau sac moi:");
                crr[n - 1].setMau_sac(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
             else if (cnang == 5) {
                System.out.println("Nhap chat lieu moi:");
                crr[n - 1].setChat_lieu(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
              else if (cnang == 6) {
                System.out.println("Nhap do cung moi:");
                crr[n - 1].setDo_cung(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 0) {
                System.out.println("hoat thanh cong.");
                break;
            } 
        } 
    }
    void xoa_but_chi() {
        Scanner sc = new Scanner(System.in);
         if (stt == 0) {
            System.out.println("Khong co but chi de xoa!");
            return; 
        }
        if (stt != 0){
            System.out.print("STT     Ten san pham                    Gia ban               Thuong hieu               Mau sac       Chat lieu       Do cung\n");
            for (int i = 0; i < stt ; i ++) {
                System.out.printf("%d", (i + 1));
                String len = String.valueOf(i + 1);
                int kc = 8 - len.length();
                for (int j = 0; j < kc; j ++) System.out.printf(" ");
                crr[i].xem();
            }
        }
        System.out.println("Nhap thu tu but chi can xoa:");
        int n = sc.nextInt();
        if (n > stt || n <= 0) {
            System.out.println("Khong co sach nay trong kho");
            return;
        }
        for (int i = n - 1; i < stt; i ++) {
                crr[i] = crr[i + 1];
        }
        stt --;
        System.out.println("Da hoan thanh.");
    }
    //Cac chuc nang cua but muc
    void xem_but_muc(){
        if (ij == 0) {
            System.out.println("Chua co but muc, vui long cho doi.");
        }
        else{
            for (int i = 0; i < ij; i ++) {
                drr[i].in();
            }
        }
    }
    void them_but_muc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong but muc can them:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i ++){
            drr[ij] = new Butmuc();
            System.out.println("Nhap ten san pham:");
            drr[ij].setName_sp(sc.nextLine());
            System.out.println("Nhap gia ban:");
            drr[ij].setGban(sc.nextLine());
             System.out.println("Nhap thuong hieu:");
            drr[ij].setT_hieu(sc.nextLine());
            System.out.println("Nhap mau sac:");
            drr[ij].setMsac(sc.nextLine());
             System.out.println("Nhap chat lieu:");
            drr[ij].setC_lieu(sc.nextLine());
             System.out.println("Nhap loai muc:");
            drr[ij].setLoai_muc(sc.nextLine());
            System.out.println("Nhap do min:");
            drr[ij].setDo_min(sc.nextLine());
            ij++;
        }
    }
    void sua_but_muc() {
        Scanner sc = new Scanner(System.in);
         if (ij == 0) {
            System.out.println("Khong co but muc de sua!");
            return; 
        }
        System.out.print("STT     Ten san pham                    Gia ban               Thuong hieu               Mau sac       Chat lieu       Loai muc       Do min\n");
        for (int i = 0; i < ij ; i ++) {
            System.out.printf("%d", (i + 1));
            String len = String.valueOf(i + 1);
            int kc = 8 - len.length();
            for (int j = 0; j < kc; j ++) System.out.printf(" ");
            drr[i].xem();
        }
        System.out.println("Nhap thu tu but muc can sua:");
        int n = sc.nextInt();
        if (n > ij && n <= 0) {
            System.out.println("Khong co but muc nay trong kho");
            return;
        }
        while (true) {
            System.out.print("Chon muc ban muon sua:\n" + "1. Ten san pham\n" + "2. Gia ban\n" + "3. Thuong hieu\n" + "4. Mau sac\n" + "5. Chat lieu\n" + "6. Loai muc\n" + "7. Do min\n" + "0. Thoat\n" );
            int cnang = sc.nextInt();
            sc.nextLine();
            if (cnang == 1) {
                System.out.println("Nhap ten san pham moi:");
                drr[n - 1].setName_sp(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 2) {
                System.out.println("Nhap gia ban moi:");
                drr[n - 1].setGban(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 3) {
                System.out.println("Nhap thuong hieu moi:");
                drr[n - 1].setT_hieu(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 4) {
                System.out.println("Nhap mau sac moi:");
                drr[n - 1].setMsac(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
             else if (cnang == 5) {
                System.out.println("Nhap chat lieu moi:");
                drr[n - 1].setC_lieu(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
              else if (cnang == 6) {
                System.out.println("Nhap loai muc moi:");
                drr[n - 1].setLoai_muc(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
               else if (cnang == 7) {
                System.out.println("Nhap do min moi:");
                drr[n - 1].setDo_min(sc.nextLine());
                System.out.println("Da hoan thanh.");
            }
            else if (cnang == 0) {
                System.out.println("hoat thanh cong.");
                break;
            } 
        } 
    }
    void xoa_but_muc() {
         if (ij == 0) {
            System.out.println("Khong co but muc de xoa!");
            return; 
        }
        Scanner sc = new Scanner(System.in);
        if (ij != 0) {
            System.out.print("STT     Ten san pham                    Gia ban               Thuong hieu               Mau sac       Chat lieu       Loai muc       Do min\n");
            for (int i = 0; i < ij ; i ++) {
                System.out.printf("%d", (i + 1));
                String len = String.valueOf(i + 1);
                int kc = 8 - len.length();
                for (int j = 0; j < kc; j ++) System.out.printf(" ");
                drr[i].xem();
            }
        }
        System.out.println("Nhap thu tu but muc can xoa:");
        int n = sc.nextInt();
        if (n > ij || n <= 0) {
            System.out.println("Khong co sach nay trong kho");
            return;
        }
        for (int i = n - 1; i < ij; i ++) {
                drr[i] = drr[i + 1];
        }
        ij --;
        System.out.println("Da hoan thanh.");
    }
}
