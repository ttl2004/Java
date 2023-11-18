/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;

/**
 *
 * @author Admin
 */
public class Butchi {
    private String ten_sp;
    private String g_ban;
    private String th_hieu;
    private String mau_sac;
    private String chat_lieu;
    private String do_cung;

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public String getG_ban() {
        return g_ban;
    }

    public void setG_ban(String g_ban) {
        this.g_ban = g_ban;
    }

    public String getTh_hieu() {
        return th_hieu;
    }

    public void setTh_hieu(String th_hieu) {
        this.th_hieu = th_hieu;
    }

    public String getMau_sac() {
        return mau_sac;
    }

    public void setMau_sac(String mau_sac) {
        this.mau_sac = mau_sac;
    }

    public String getChat_lieu() {
        return chat_lieu;
    }

    public void setChat_lieu(String chat_lieu) {
        this.chat_lieu = chat_lieu;
    }

    public String getDo_cung() {
        return do_cung;
    }

    public void setDo_cung(String do_cung) {
        this.do_cung = do_cung;
    }
    public void in(){
        System.out.println("------");
        System.out.printf("Ten san pham: %s\nGia ban: %s\nThuong hieu: %s\nMau sac: %s\nChat lieu: %s\nDo cung: %s\n", ten_sp, g_ban, th_hieu, mau_sac, chat_lieu, do_cung);
    }
    public void k_cach(int kc){
        for (int i = 0; i < kc; i ++) System.out.printf(" ");
    }
    public void xem(){
        System.out.printf("%s", ten_sp);
        k_cach(32 - ten_sp.length());
        System.out.printf("%s", g_ban);
        k_cach(22 - g_ban.length());
        System.out.printf("%s", th_hieu);
        k_cach(26 - th_hieu.length());
        System.out.printf("%s", mau_sac);
        k_cach(14 - mau_sac.length());
        System.out.printf("%s", chat_lieu);
        k_cach(16 - chat_lieu.length());
        System.out.printf("%s\n", do_cung);
    }
    void khoang_trong(){
        for (int i = 0; i < 106; i ++) System.out.printf(" ");
    }
    public void xem_2(){
        int kc_1 = 38 - ten_sp.length();
        int kc_2 = 33 - g_ban.length();
        int kc_3 = 35 - th_hieu.length();
        System.out.printf("%s", ten_sp);
        for (int i = 0; i < kc_1; i ++) System.out.printf(" ");
        System.out.printf("%s", g_ban);
        for (int i = 0; i < kc_2; i ++) System.out.printf(" ");
        System.out.printf("%s", th_hieu);
        for (int i = 0; i < kc_3; i ++) System.out.printf(" ");
        System.out.printf("-Mau sac:%s\n", mau_sac);
        khoang_trong();
        System.out.printf("-Chat lieu:%s\n", chat_lieu);
        khoang_trong();
        System.out.printf("-Do cung:%s\n", do_cung);
       }
}
