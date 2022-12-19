/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unochapeco.goodqueue;

/**
 *
 * @author PC
 */
public class ComprovantePref   {
    private static int ChegadaPref = 1;
    private static String ChegadaPreF = "P" ;
    public ComprovantePref() {
    }

    public static int getChegadaPref() {
       
        return ChegadaPref ++;
    }

    /**
     * @param ChegadaPref the ChegadaPref to set
     */
    public static void setChegadaPref(int ChegadaPref) {
        ChegadaPref = ChegadaPref;
    }

    /**
     * @return the ChegadaPreF
     */
    public static String getChegadaPreF() {
        return ChegadaPreF;
    }

    /**
     * @param aChegadaPreF the ChegadaPreF to set
     */
    public static void setChegadaPreF(String aChegadaPreF) {
        ChegadaPreF = aChegadaPreF;
    }
    
}
