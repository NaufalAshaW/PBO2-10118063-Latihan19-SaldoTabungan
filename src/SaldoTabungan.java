import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class SaldoTabungan {

    /**
     * @param args
     */
      public static void main(String[] args){
          Double saldo = 2500000.0;
          
          for(Integer i = 1; i <=6; i++){
              Double bunga = saldo * 0.15;
              saldo += bunga;
              System.out.println("Saldo di bulan ke-" + i
              + " Rp." + SaldoTabungan.formatter(saldo));
          }
      
    }

    private static String formatter(Double saldo) {
        DecimalFormat kursIDR = (DecimalFormat) DecimalFormat
                .getIntegerInstance();
        DecimalFormatSymbols formatIDR = new DecimalFormatSymbols();
        
        formatIDR.setGroupingSeparator('.');
        
        kursIDR.setDecimalFormatSymbols(formatIDR);
        
        return kursIDR.format(saldo);
    }
}
