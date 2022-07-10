package com.company.design.adapter;

//220v -> 110v 변환 어뎁터
public class SocketAdapter implements Electronic110v{

    private Electronic220v electronic220v;

    public SocketAdapter(Electronic220v electronic220v){
        this.electronic220v = electronic220v;
    }
    @Override
    public void powerOn() {
        //110v powerOn 했을 때 220v에 connect 되도록
        electronic220v.connect();
    }
}
