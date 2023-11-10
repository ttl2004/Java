/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proit4all.main;

/**
 *
 * @author Admin
 */
public class Luutru {
   private String tieude;
   private String tacgia;
   private String theloai;
   private String date;
   private int luong;

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getLuong() {
        return luong;
    }
    public String getTieude() {
        return tieude;
    }

    public String getTacgia() {
        return tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public String getDate() {
        return date;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void in(){
        System.out.print(this.tieude + " " + this.tacgia +  " " + this.theloai + " " + this.date + "\n");
    }
}
