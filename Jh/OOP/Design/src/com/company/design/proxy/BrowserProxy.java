package com.company.design.proxy;

public class BrowserProxy implements IBrowser{

    private String url;
    private Html html;

    public BrowserProxy(String url){
        this.url = url;
    }

    @Override
    public Html show() {

        // cache기능을 추가한다면 이런식으로 넣어서 메모리에 넣어준다.
        if( html == null){
            this.html = new Html(url);
            System.out.println("BrowserProxy loading html from : "+ url);
        }

        System.out.println("BrowserProxy use cache html : "+ url);
        return html;
    }
}
