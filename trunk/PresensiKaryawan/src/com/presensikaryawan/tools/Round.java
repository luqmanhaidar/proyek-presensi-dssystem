/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presensikaryawan.tools;

/**
 *
 * @author dalvins
 */
public class Round {

    public Round() {
    }
    public static Double Round(Double Rval, int Rpal) {
        Double p = Math.pow(10, Rpal);
        Rval = Rval / p;
        float tmp = Math.round(Rval);
        return (float) tmp * p;
    }
}
