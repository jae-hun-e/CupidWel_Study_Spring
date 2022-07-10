package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClass;
import com.company.design.singleton.BClass;
import com.company.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

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


//        adapter 예제
        /*
        HairDryer hairDryer = new HairDryer(); // 110v
        connect(hairDryer);

        Cleaner cleaner = new Cleaner(); // 220v
        // cleaner는 220v이고 connect는 110 이므로 변환(adapter)이 필요하다
        //connect(cleaner);

        Electronic110v adapterCleaner = new SocketAdapter(cleaner); //220v 제품을 110v 에 넣어 변환시킨다.
        connect(adapterCleaner);

        AirConditioner airConditioner = new AirConditioner(); //220v
        Electronic110v adapterToAirConditioner = new SocketAdapter(airConditioner);
        connect(adapterToAirConditioner); // 220v -> 110v
        */

//        proxy 예제
        /*
        System.out.println("기존방식으로 로딩");
        Browser browser1 = new Browser("www.naver.com");
        browser1.show();
        browser1.show();
        browser1.show();


        System.out.println("proxy를 이용하여 cache기능 활용");
        IBrowser browser2 = new BrowserProxy("www.naver.com");
        browser2.show();
        browser2.show();
        browser2.show();
        browser2.show();
         */
//        AOP - 특정 메소드에 실행시간이나, 특정패키지의 특정 매소드의 실행시간 전/후로 작업하고 싶은 부분들,
//        일괄적으로 특정 요청에 req, res정보를 남기고 싶을 때 특정 메소드의 전/후에 넣고 싶을 때


/*
AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("loading time : "+end.get());

        aopBrowser.show();
        System.out.println("loading time : "+end.get());
        */

//        decorator 예제
        /*
        Icar audi = new Audi(1000);
        audi.showPrice();

        //a3
        Icar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        //a4
        Icar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        //a5
        Icar audi5 = new A5(audi, "A5");
        audi5.showPrice();

         */

//        observer 예제
        Button button = new Button("버튼");

        // 익명 class로 전달
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메세지 전달 : click1");
        button.click("메세지 전달 : click2");
        button.click("메세지 전달 : click3");
        button.click("메세지 전달 : click4");

    }



    // 콘센트-110v
    public static void connect(Electronic110v electronic110v){
        electronic110v.powerOn();
    }

}
