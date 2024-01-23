package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.Base64Strategy;
import com.company.design.strategy.Encorder;
import com.company.design.strategy.EncordingStrategy;
import com.company.design.strategy.NormalStrategy;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        Encorder encorder = new Encorder();

        //base64
        EncordingStrategy base64 = new Base64Strategy();

        //normal
        EncordingStrategy normal = new NormalStrategy();

        String message = "Hello";
        encorder.setEncordingStrategy(base64);
        String base64Result = encorder.getMessage(message);
        System.out.println(base64Result);

        encorder.setEncordingStrategy(normal);
        String normalResult = encorder.getMessage(message);
        System.out.println(normalResult);

    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.poweron();
    }
}