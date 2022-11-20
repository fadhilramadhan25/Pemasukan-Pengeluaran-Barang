/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barang;

import java.util.Scanner;

/**
 *
 * @author Fadhil Ramadhan
 */
public class Login {
    
    public boolean doLogin(){
        boolean isLogin=true;
        String ID="admin123";
        String idInput="";

        Scanner sc=new Scanner(System.in);
        System.out.println("Silahkan Masukan ID Anda");
        System.out.println("=========================");
        System.out.print("ID : ");
        idInput = sc.nextLine();
        if(!idInput.equalsIgnoreCase(ID)){
            System.out.println("ID Anda Salah -> "+idInput);
            isLogin=false;
        }

        return isLogin;
    }
}

