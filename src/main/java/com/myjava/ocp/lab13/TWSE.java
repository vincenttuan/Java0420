package com.myjava.ocp.lab13;

import java.io.File;
import java.net.URL;
import java.util.Scanner;

public class TWSE {
    public static void main(String[] args) throws Exception {
        String pathtring = "src\\main\\java\\com\\myjava\\ocp\\lab13\\BWIBBU_d.csv";
        File file = new File(pathtring);
        String csvstring = new Scanner(file).useDelimiter("\\A").next();
        //System.out.println(csvstring);
        String[] rows = csvstring.split("\n");
        for(String row : rows) {
            if(row.trim().split(",").length == 7) {
                System.out.println(row.trim());
            }
        }
        
    }
}
