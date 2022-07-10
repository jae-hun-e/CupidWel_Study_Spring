package com.company.design.singleton;

public class AClass {

    private SocketClient socketClient;

    public AClass(){
//        싱글톤 방식
        this.socketClient = SocketClient.getInstance();

//        기존의 방식
//        this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
