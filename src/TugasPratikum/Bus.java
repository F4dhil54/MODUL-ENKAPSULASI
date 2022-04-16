/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPratikum;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class Bus {
    public double penumpang, maxpenumpang, average;
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    public void pluspenumpang(int penumpang){
        double temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }

    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("password salah");
        }
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }
    static Random random() {
    Random r = new Random();
    System.out.println(r.nextInt(88 - 45));
    return r;
      }

    public void getAverage(int i) {
        System.out.println("Rata rata berat badan penumpang : " +i +" Kilogram");
    }
    
}

