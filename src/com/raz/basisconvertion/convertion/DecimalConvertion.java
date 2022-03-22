/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raz.basisconvertion.convertion;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author raz
 */
public class DecimalConvertion implements Convertion {
    @Override
    public Result from(String value, int basis) {
        Result result = new Result();
        
        int d = 0;
        
        for (int i=0; i<value.length(); i++) {
            char val = value.charAt(i);
            int p = value.length() - i - 1;
            int r = alphabetToNum(val) * ((int) Math.pow(basis, p));
            
            d += r;
            
            result.getLog().add(val + " x " + basis + "^" + p + " = " + r);
        }
        
        result.setResult(String.valueOf(d));
        
        return result;
    }
    
    @Override
    public Result to(String value, int basis) {
        Result result = new Result();
        
        String d = "";
        
        for (long i=Integer.valueOf(value); i>0; i/=basis) {
            result.getLog().add(i + " / " + basis + " = " + (i / basis) + " sisa " + (i % basis));
            
            d = numToAlpha((int) i % basis) + d;
            
            if (i < basis)
                break;
        }
        
        result.setResult(d);
        
        return result;
    }

    @Override
    public int getBasis() {
        return 10;
    }
}
