/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unochapeco.goodqueue;

/**
 *
 * @author PC
 */
public class Bancooucomércio  {
    boolean atenderPref;
    boolean atender;

    public Bancooucomércio(boolean atenderPref, boolean atender) {
        this.atenderPref = atenderPref;
        this.atender = atender;
    }

    public boolean isAtenderPref() {
        return atenderPref;
    }

    public void setAtenderPref(boolean atenderPref) {
        this.atenderPref = atenderPref;
    }

    public boolean isAtender() {
        return atender;
    }

    public void setAtender(boolean atender) {
        this.atender = atender;
    }



}
