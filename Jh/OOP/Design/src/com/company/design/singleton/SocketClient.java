package com.company.design.singleton;

public class SocketClient {

//       어디서든 동일한 객체에 접근하도록 static으로 만들다.
        private static SocketClient socketClient = null;

//        싱글톤 패선에서는 생성자를 private으로 만들어서 접근을 못하게 막음
        private SocketClient(){
        }

//        기존의 방식
//        public SocketClient(){}

        public static SocketClient getInstance(){
                if( socketClient == null){
                        socketClient = new SocketClient();
                }
                return socketClient;
        }

        public void connect(){
                System.out.println("connect");
        }
}
