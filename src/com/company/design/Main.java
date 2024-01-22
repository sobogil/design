package com.company.design;

import com.company.design.adapter.*;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class Main {
    public static void main(String[] args) {

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();


    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.poweron();
    }
}