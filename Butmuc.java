/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;

/**
 *
 * @author Admin
 */
public class Butmuc {
    private String name_sp;
    private String gban;
    private String t_hieu;
    private String msac;
    private String c_lieu;
    private String loai_muc;
    private String do_min;

    public String getName_sp() {
        return name_sp;
    }

    public void setName_sp(String name_sp) {
        this.name_sp = name_sp;
    }

    public String getGban() {
        return gban;
    }

    public void setGban(String gban) {
        this.gban = gban;
    }

    public String getT_hieu() {
        return t_hieu;
    }

    public void setT_hieu(String t_hieu) {
        this.t_hieu = t_hieu;
    }

    public String getMsac() {
        return msac;
    }

    public void setMsac(String msac) {
        this.msac = msac;
    }

    public String getC_lieu() {
        return c_lieu;
    }

    public void setC_lieu(String c_lieu) {
        this.c_lieu = c_lieu;
    }

    public String getLoai_muc() {
        return loai_muc;
    }

    public void setLoai_muc(String loai_muc) {
        this.loai_muc = loai_muc;
    }

    public String getDo_min() {
        return do_min;
    }

    public void setDo_min(String do_min) {
        this.do_min = do_min;
    }
     public void in(){
        System.out.println("------");
        System.out.printf("Ten san pham: %s\nGia ban: %s\nThuong hieu: %s\nMau sac: %s\nChat lieu: %s\nLoai muc: %s\nDo min: %s\n", name_sp, gban, t_hieu, msac, c_lieu, loai_muc, do_min);
    }
    public void k_cach(int kc){
        for (int i = 0; i < kc; i ++) System.out.printf(" ");
    }
    public void xem(){
        System.out.printf("%s", name_sp);
        k_cach(32 - name_sp.length());
        System.out.printf("%s", gban);
        k_cach(22 - gban.length());
        System.out.printf("%s", t_hieu);
        k_cach(26 - t_hieu.length());
        System.out.printf("%s", msac);
        k_cach(14 - msac.length());
        System.out.printf("%s", c_lieu);
        k_cach(16 - c_lieu.length());
        System.out.printf("%s", loai_muc);
        k_cach(15 - loai_muc.length());
        System.out.printf("%s\n", do_min);
    }
    void khoang_trong(){
        for (int i = 0; i < 106; i ++) System.out.printf(" ");
    }
    public void xem_2(){
        int kc_1 = 38 - name_sp.length();
        int kc_2 = 33 - gban.length();
        int kc_3 = 35 - t_hieu.length();
        System.out.printf("%s", name_sp);
        for (int i = 0; i < kc_1; i ++) System.out.printf(" ");
        System.out.printf("%s", gban);
        for (int i = 0; i < kc_2; i ++) System.out.printf(" ");
        System.out.printf("%s", t_hieu);
        for (int i = 0; i < kc_3; i ++) System.out.printf(" ");
        System.out.printf("-Mau sac:%s\n", msac);
        khoang_trong();
        System.out.printf("-Chat lieu:%s\n", c_lieu);
        khoang_trong();
        System.out.printf("-Loai muc:%s\n", loai_muc);
        khoang_trong();
        System.out.printf("-Do min:%s\n", do_min);
        }
}
