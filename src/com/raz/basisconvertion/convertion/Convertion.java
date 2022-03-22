/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raz.basisconvertion.convertion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raz
 */
public interface Convertion {
    public Result from(String value, int basis);
    public Result to(String value, int basis);
    
    public int getBasis();
    
    default public int alphabetToNum(char value) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
        
        if (map.containsKey(value)) {
            return map.get(value);
        }
        
        return Integer.valueOf(String.valueOf(value));
    }
    
    default public char numToAlpha(int value) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(10, 'A');
        map.put(11, 'B');
        map.put(12, 'C');
        map.put(13, 'D');
        map.put(14, 'E');
        map.put(15, 'F');
        
        if (map.containsKey(value)) {
            return map.get(value);
        }
        
        return String.valueOf(value).charAt(0);
    }
}
