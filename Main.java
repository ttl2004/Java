/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proit4all.main;
import java.util.Scanner;
import com.proit4all.main.Admin;
import com.proit4all.main.Khach;
import com.proit4all.main.Sach;
import com.proit4all.main.Kho;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kho ds = new Kho();
        while(true){
            System.out.print("Moi chon doi tuong dang nhap:\n" + "1. Admin\n" + "2. Khach\n" + "3. EXIT\n");
            int N = sc.nextInt();
            if (N == 1){
                int slg = 0;
                sc.nextLine();
                while (slg <= 5){
                    System.out.println("Nhap mat khau:");
                    String st = sc.nextLine();
                    if (st.equals("12345")){
                        break;
                    }
                    else {
                        System.out.println("Vui long nhap lai mat khau.");
                        slg++;
                    }
                    if(slg > 5){
                        System.out.println("Chuc may man!");
                    }
                }
                Admin fk = new Admin(ds);
                fk.hello();
            }
            else if(N == 2){
               Khach khach = new Khach(ds);
               khach.hi();
            }
            else if(N == 3){
                break;
            }
        }
    }
}
