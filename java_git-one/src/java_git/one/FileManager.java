/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_git.one;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author LNV-HK-LB
 */
public class FileManager {

    public boolean writeToFile(String line, String filePath, boolean append) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(new File(filePath)), append);
            pw.println(line);
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            pw.close();
        }
        return false;
    }

    public void readFromFile(String fileName) {

    }

}
