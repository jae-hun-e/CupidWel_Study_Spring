package com.company.design;

import com.company.design.adapter.*;
import com.company.design.singleton.AClass;
import com.company.design.singleton.BClass;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args){

//        singleton 예제
        /*
        AClass aClass = new AClass();
        BClass bClass = new BClass();

        SocketClient aClient = aClass.getSocketClient();
        SocketClient bClient = bClass.getSocketClient();

        System.out.println("객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
        */

        HairDryer hairDryer = new HairDryer(); // 110v
        connect(hairDryer);

        Cleaner cleaner = new Cleaner(); // 220v
//        connect(cleaner); // cleaner는 220v이고 connect는 110 이므로 변환(adapter)이 필요하다

        Electronic110v adapterCleaner = new SocketAdapter(cleaner); //220v 제품을 110v 에 넣어 변환시킨다.
        connect(adapterCleaner);

        AirConditioner airConditioner = new AirConditioner(); //220v
        Electronic110v adapterToAirConditioner = new SocketAdapter(airConditioner);
        connect(adapterToAirConditioner); // 220v -> 110v

    }

    // 콘센트-110v
    public static void connect(Electronic110v electronic110v){
        electronic110v.powerOn();
    }
}
