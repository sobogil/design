package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        /*
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        */
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
                }
                );

        aopBrowser.show();
        System.out.println("time: "+end.get());

        aopBrowser.show();
        System.out.println("time: "+end.get());

    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.poweron();
    }
}