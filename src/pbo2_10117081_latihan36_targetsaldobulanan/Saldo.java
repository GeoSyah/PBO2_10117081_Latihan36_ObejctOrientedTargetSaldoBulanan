/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan36_targetsaldobulanan;

/**
 *
 * @author Geo Syah Alkautsar
 * Deskripsi Kelas : Perhitungan target saldo
 */
public class Saldo {
    public int saldoAwal;
    public double bunga;
    public int saldoTarget;
    
    public void targetSaldo(int parSaldo, double parBunga){
        int i = 0;
        while (saldoAwal <= 6000000) {
            i = i + 1;
            saldoTarget = (int) (bunga * saldoAwal);
            saldoAwal =  saldoAwal + saldoTarget;
            System.out.println("Saldo di Bulan ke-" + i + " Rp."
                    + saldoAwal);
        }
        
    }
    
}
