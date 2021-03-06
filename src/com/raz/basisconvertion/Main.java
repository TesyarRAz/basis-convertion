/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.raz.basisconvertion;

import com.raz.basisconvertion.frame.Home;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.UIManager;

/**
 *
 * @author raz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ArrayList<String> rec = new ArrayList<>();
            rec.add("windows");
            rec.add("gtk+");
            
            for (UIManager.LookAndFeelInfo lookAndFeel : UIManager.getInstalledLookAndFeels()) {
                if (rec.contains(lookAndFeel.getName().toLowerCase())) {
                    UIManager.setLookAndFeel(lookAndFeel.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception _e) {}
        }
        
        new Home().setVisible(true);
    }
}
