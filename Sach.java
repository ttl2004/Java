/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;

/**
 *
 * @author Admin
 */
public class Sach {
   private String ten_tac_pham;
   private String nha_xuat_ban;
   private String tac_gia;
   private String theloai;
   private String date;
   private String gia_ban;
   private String language;
   private String thuong_hieu;

    public String getTen_tac_pham() {
        return ten_tac_pham;
    }

    public void setTen_tac_pham(String ten_tac_pham) {
        this.ten_tac_pham = ten_tac_pham;
    }

    public String getNha_xuat_ban() {
        return nha_xuat_ban;
    }

    public void setNha_xuat_ban(String nha_xuat_ban) {
        this.nha_xuat_ban = nha_xuat_ban;
    }

    public String getTac_gia() {
        return tac_gia;
    }

    public void setTac_gia(String tac_gia) {
        this.tac_gia = tac_gia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGia_ban() {
        return gia_ban;
    }

    public void setGia_ban(String gia_ban) {
        this.gia_ban = gia_ban;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getThuong_hieu() {
        return thuong_hieu;
    }

    public void setThuong_hieu(String thuong_hieu) {
        this.thuong_hieu = thuong_hieu;
    }

    public void in(){
        System.out.print("------\n");
        System.out.printf("Ten san pham: %s\nGia ban: %s\nThuong hieu: %s\nThe loai: %s\nTac gia: %s\nNha xuat ban: %s\nNam xuat ban: %s\nNgon ngu: %s\n", ten_tac_pham, gia_ban, thuong_hieu, theloai, tac_gia, nha_xuat_ban, date, language);
    }
    public void k_cach(int kc){
        for (int i = 0; i < kc; i ++) System.out.printf(" ");
    }
    public void xem(){
        System.out.printf("%s", ten_tac_pham);
        k_cach(32 - ten_tac_pham.length());
        System.out.printf("%s", gia_ban);
        k_cach(22 - gia_ban.length());
        System.out.printf("%s", thuong_hieu);
        k_cach(26 - thuong_hieu.length());
        System.out.printf("%s", theloai);
        k_cach(18 - theloai.length());
        System.out.printf("%s", tac_gia);
        k_cach(22 - tac_gia.length());
        System.out.printf("%s", nha_xuat_ban);
        k_cach(32 - nha_xuat_ban.length());
        System.out.printf("%s", date);
        k_cach(17 - date.length());
        System.out.printf("%s\n", language);
    }
    void khoang_trong(){
        for (int i = 0; i < 106; i ++) System.out.printf(" ");
    }
    public void xem_2(){
        int kc_1 = 38 - ten_tac_pham.length();
        int kc_2 = 33 - gia_ban.length();
        int kc_3 = 35 - thuong_hieu.length();
        System.out.printf("%s", ten_tac_pham);
        for (int i = 0; i < kc_1; i ++) System.out.printf(" ");
        System.out.printf("%s", gia_ban);
        for (int i = 0; i < kc_2; i ++) System.out.printf(" ");
        System.out.printf("%s", thuong_hieu);
        for (int i = 0; i < kc_3; i ++) System.out.printf(" ");
        System.out.printf("-The loai:%s\n", theloai);
        khoang_trong();
        System.out.printf("-Tac gia:%s\n", tac_gia);
        khoang_trong();
        System.out.printf("-Nha xuat ban:%s\n", nha_xuat_ban);
        khoang_trong();
        System.out.printf("-Nam xuat ban:%s\n", date);
        khoang_trong();
        System.out.printf("-Ngon ngu:%s\n", language);
    }
}
