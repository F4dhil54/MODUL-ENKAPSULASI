/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPratikum2;

/**
 *
 * @author LENOVO
 */
public class Bola {
    private double l;

    private double r;
    private double v;
    private double d;

    public double getL() {
        l = 4d * Math.PI*Math.pow(r,2d);
        return l;
    }
    public void setL(double l) {
        this.l = l;
    }
    public double getR() {
        return r;
    }
    public double setR(double r) {
        this.r = r;
        return 0;
    }
    public double getV() {
        v = 4d/3*Math.PI*Math.pow(getR(), 3);
        return v;
    }
    public void setV(double v) {
        this.v = v;
    }
    public double getD() {
        d = getR()*2;
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
}

