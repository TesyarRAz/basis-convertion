/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raz.basisconvertion.convertion;

/**
 *
 * @author raz
 */
public class BinerConvertion implements Convertion {

    @Override
    public Result from(String value, int basis) {
        if (basis == 10) {
            return new DecimalConvertion().to(value, getBasis());
        }
        
        Result decimalResult = new DecimalConvertion().from(value, basis);
        Result result = new DecimalConvertion().to(decimalResult.getResult(), getBasis());
        
        decimalResult.getLog().add(0, "Konversi Ke Desimal Terlebih Dahulu");
        decimalResult.getLog().add("Hasil Dalam Desimal : " + result.getResult());
        
        result.getLog().addAll(0, decimalResult.getLog());
        
        return result;
    }

    @Override
    public Result to(String value, int basis) {
        if (basis == 10) {
            return new DecimalConvertion().from(value, getBasis());
        }
        
        Result decimalResult = new DecimalConvertion().from(value, getBasis());
        Result result = new DecimalConvertion().to(decimalResult.getResult(), basis);
        
        decimalResult.getLog().add(0, "Konversi Ke Desimal Terlebih Dahulu");
        decimalResult.getLog().add("Hasil Dalam Desimal : " + decimalResult.getResult());
        
        result.getLog().addAll(0, decimalResult.getLog());
        
        return result;
    }

    @Override
    public int getBasis() {
        return 2;
    }
    
}
