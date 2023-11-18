/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;

/**
 *
 * @author Admin
 */
public class Voghi {
    private String name;
    private String cost;
    private String thuonghieu;
    private String so_trang;
    private String type;
    private String color;
    private String chat_lieu;
    private String kich_thuoc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public String getSo_trang() {
        return so_trang;
    }

    public void setSo_trang(String so_trang) {
        this.so_trang = so_trang;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChat_lieu() {
        return chat_lieu;
    }

    public void setChat_lieu(String chat_lieu) {
        this.chat_lieu = chat_lieu;
    }

    public String getKich_thuoc() {
        return kich_thuoc;
    }

    public void setKich_thuoc(String kich_thuoc) {
        this.kich_thuoc = kich_thuoc;
    }
    public void in(){
        System.out.println("------");
        System.out.printf("Ten san pham: %s\nGia ban: %s\nThuong hieu: %s\nSo trang: %s\nLoai vo: %s\nMau sac bia: %s\nChat lieu giay: %s\nKich thuoc: %s\n",  name, cost, thuonghieu, so_trang, type, color, chat_lieu, kich_thuoc);
    }
    public void k_cach(int kc){
        for (int i = 0; i < kc; i ++) System.out.printf(" ");
    }
    public void xem(){
        System.out.printf("%s", name);
        k_cach(32 - name.length());
        System.out.printf("%s", cost);
        k_cach(22 - cost.length());
        System.out.printf("%s", thuonghieu);
        k_cach(26 - thuonghieu.length());
        System.out.printf("%s", so_trang);
        k_cach(13 - so_trang.length());
        System.out.printf("%s", type);
        k_cach(17 - type.length());
        System.out.printf("%s", color);
        k_cach(18 - color.length());
        System.out.printf("%s", chat_lieu);
        k_cach(21 - chat_lieu.length());
        System.out.printf("%s\n", kich_thuoc);
    }
    void khoang_trong(){
        for (int i = 0; i < 106; i ++) System.out.printf(" ");
    }
    public void xem_2(){
        int kc_1 = 38 - name.length();
        int kc_2 = 33 - cost.length();
        int kc_3 = 35 - thuonghieu.length();
        System.out.printf("%s", name);
        for (int i = 0; i < kc_1; i ++) System.out.printf(" ");
        System.out.printf("%s", cost);
        for (int i = 0; i < kc_2; i ++) System.out.printf(" ");
        System.out.printf("%s", thuonghieu);
        for (int i = 0; i < kc_3; i ++) System.out.printf(" ");
        System.out.printf("-So trang:%s\n", so_trang);
        khoang_trong();
        System.out.printf("-Loai vo:%s\n", type);
        khoang_trong();
        System.out.printf("-Mau sac bia:%s\n", color);
        khoang_trong();
        System.out.printf("-Chat lieu:%s\n", chat_lieu);
        khoang_trong();
        System.out.printf("-Kich thuoc:%s\n", kich_thuoc);
    }
}
