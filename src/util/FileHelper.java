/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author hoaip
 */
public class FileHelper {
    public static ArrayList<String[]> ReadFile(String filePath) {
        ArrayList<String[]> data = new ArrayList<String[]>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
            String line = br.readLine();
            while (line != null) {
                String[] items = line.split(",");
                data.add(items);
                line = br.readLine();
            }
            return data;
        } catch (Exception ex) {
            return null;
        }
    }
}
