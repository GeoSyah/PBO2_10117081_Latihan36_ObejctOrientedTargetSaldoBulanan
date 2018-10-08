/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan36_targetsaldobulanan;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Program untuk memperlihatkan saldo target perbulan
 */
public class PBO2_10117081_Latihan36_TargetSaldoBulanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Saldo saldo = new Saldo();
        
        saldo.saldoAwal = 3500000;
        saldo.bunga = 0.08;
        
        saldo.targetSaldo(saldo.saldoAwal, saldo.bunga);
    }
    
}
