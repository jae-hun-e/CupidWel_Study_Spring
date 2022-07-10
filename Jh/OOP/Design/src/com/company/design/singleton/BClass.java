package com.company.design.singleton;

public class BClass {

    private  SocketClient socketClient;

    public BClass(){
        this.socketClient = SocketClient.getInstance();
//        this.socketClient = new SocketClient();
    }

    public  SocketClient getSocketClient(){
        return this.socketClient;
    }
}
