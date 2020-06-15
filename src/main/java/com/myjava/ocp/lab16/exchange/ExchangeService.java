package com.myjava.ocp.lab16.exchange;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExchangeService {
    public Exchange[] query() {
        String json = null;
        try {
            File file = new File("src\\main\\java\\com\\myjava\\ocp\\lab16\\exchange\\ex.json");
            json = new Scanner(file).useDelimiter("\\A").next();
        } catch (FileNotFoundException e) {
            System.out.println("檔案找不到, " + e);
            return null;
        }
        return new Gson().fromJson(json, Exchange[].class);
    }
}
