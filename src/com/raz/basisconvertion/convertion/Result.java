/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raz.basisconvertion.convertion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raz
 */
public class Result {
    private String result;
    private List<String> log;

    public Result() {
        log = new ArrayList<>();
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<String> getLog() {
        return log;
    }

    public void setLog(List<String> log) {
        this.log = log;
    }

}
