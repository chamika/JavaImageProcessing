/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chamika.vision;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author chamika
 */
public class VisionProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(VisionProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
