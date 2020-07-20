package com.myjava.ocp.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 5000);
        System.out.println("連到 Server 端");
        while (true) {
            try (OutputStream output = socket.getOutputStream();) {
                int ch;
                while ((ch = System.in.read()) != 1) {
                    output.write(ch);
                }
            } catch (Exception e) {
            }
        
        }
    }
}
