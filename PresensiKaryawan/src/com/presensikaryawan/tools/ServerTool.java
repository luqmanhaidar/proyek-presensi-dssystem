/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.presensikaryawan.tools;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author virtdev03
 */
public class ServerTool {
    public static void runBatFile(String url){
        File file=new File(url);
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public static void browseURL(String urlAddress){
        Desktop desktop=Desktop.getDesktop();
        try {
            URI url = new URI(urlAddress);
            desktop.browse(url);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

}
