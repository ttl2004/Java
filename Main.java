/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proit4all.main;
import java.util.Scanner;
import com.proit4all.main.f1;
import com.proit4all.main.Khach;
import com.proit4all.main.Luutru;
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
                while (slg <= 5){
                    System.out.println("Nhap mat khau:");
                    sc.nextLine();
                    String st = sc.nextLine();
                    if (st.equals("12345")){
                        break;
                    }
                    else slg++;
                    if(slg > 5){
                        System.out.println("Chuc may man!");
                    }
                }
                f1 fk = new f1(ds);
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
