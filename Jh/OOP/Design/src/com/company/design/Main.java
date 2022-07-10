package com.company.design;

import com.company.design.singleton.AClass;
import com.company.design.singleton.BClass;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args){

        AClass aClass = new AClass();
        BClass bClass = new BClass();

        SocketClient aClient = aClass.getSocketClient();
        SocketClient bClient = bClass.getSocketClient();

        System.out.println("객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

    }
}
