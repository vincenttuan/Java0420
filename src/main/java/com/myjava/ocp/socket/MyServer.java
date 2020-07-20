package com.myjava.ocp.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("等待 Client 連入");
        Socket socket = server.accept(); // 等待 Client 連入
                 
    }
}
